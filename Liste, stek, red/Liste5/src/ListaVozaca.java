
public class ListaVozaca {
	int brojElemenata;
	Cvor kraj;
	Cvor pocetak;
	Cvor next;
	
	public ListaVozaca() {
		this.brojElemenata = 0;
		this.pocetak= null;
		this.kraj= null;
		this.next = null;
	}
	
	public void dodajNaKraj(Vozac v) {
		Cvor novi = new Cvor(v);
		Cvor temp  = this.pocetak;
		if(this.pocetak == null) {
			this.pocetak = novi;
			this.kraj = novi;
			this.brojElemenata++;
			return;
		}
		
		while(temp.next != null)
			temp = temp.next;
		temp.next = novi;
		this.kraj = novi;
		this.brojElemenata++;
	}
	
	public Cvor findMid(Cvor head) {
		if(head == null || head.next == null)
			return head;
		Cvor res = null;
		Cvor slow = head;
		Cvor fast = head;
		while(fast != null && fast.next != null) {
			res = slow;
			slow = slow.next;
			fast  = fast.next.next;
		}
		return res;
	}
	
	public Cvor merge(Cvor l, Cvor r) {
		Vozac x = new Vozac();
		Cvor res = new Cvor(x);
		Cvor temp = res;
		
		while(l != null && r != null) {
			if(l.info.compareTo(r.info) < 0) {
				temp.next = l;
				l= l.next;
			}
			else {
				temp.next = r;
				r = r.next;
			}
			temp = temp.next;
		}
		
		if(l != null) {
			temp.next = l;
		}
		else if(r != null) {
			temp.next = r;
		}
		
		return res.next;
	}
	
	public Cvor mergeSort(Cvor head) {
		if(head == null || head.next == null )
			return head;
	
		Cvor left = head;
		Cvor right = findMid(head);
		Cvor temp = right.next;
		right.next = null;
		right = temp;
		
		left = mergeSort(head);
		right = mergeSort(right);
		
		return merge(left,right);
	}
	
	public void dodaj(Vozac v) {
		Cvor novi = new Cvor(v);
		this.pocetak = mergeSort(this.pocetak);
		Cvor temp  = this.pocetak;
		Cvor prev = null;
		while(temp!=null && temp.info.compareTo(v) < 0) {
			prev = temp;
			temp = temp.next;
			if(temp != null)
				this.kraj = temp;
		}
		if(prev == null) {
			this.pocetak = novi;
			novi.next=temp;
		}
		else {
			prev.next = novi;
			novi.next = temp;
		}
	}
	
	public void brisi(Vozac v) {
		Cvor temp  = this.pocetak;
		Cvor prev = null;
		while(temp!=null) {
			if(temp.info.ime.equals(v.ime)) {
				if(prev == null) {
					this.pocetak = this.pocetak.next;
					temp = temp.next;
				}
				else {
					prev.next = temp.next;
					temp = temp.next;
				}
			}
			else {
				prev = temp;
				temp = temp.next;
			}
		}
		
	}
	
	public void printList() {
		Cvor temp = this.pocetak;	
		while(temp != null) {
			System.out.println(temp.info.toString());
			temp = temp.next;
		}
		System.out.println("Kraj liste");
	}
}
