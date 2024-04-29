
public class Fajlovi {
	Cvor glava;
	
	public Fajlovi() {
		this.glava = null;
	}
	
	public void dodajNaKraj(String ime, String sadrzaj) {
		Cvor novi = new Cvor(ime,sadrzaj);
		if(this.glava == null){
			this.glava = novi;
			return;
		}
		Cvor temp = this.glava;
		while(temp.next != null)
			temp = temp.next;
		
		temp.next = novi;
	}
	
	public void printList() {
		Cvor temp = this.glava;
		while(temp != null) {
			System.out.println(this.toString());
			temp = temp.next;
		}
		System.out.println("Kraj liste");
	}
	
	public Cvor findMid(Cvor head) {
		if(head == null || head.next == null)
			return head;
		
		Cvor res=null;
		Cvor fast = head;
		Cvor slow = head;
		while(fast != null && fast.next != null) {
			res = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		return res;
	}
	
	public Cvor merge(Cvor l, Cvor r) {
		Cvor res = new Cvor("","");
		Cvor temp = res;
		while(l != null && r != null) {
			if(l.ime.compareTo(r.ime) < 0) {
				temp.next = l;
				l = l.next;
			}
			else {
				temp.next = r;
				r = r.next;
			}
		}
		
		if(l != null)
			temp.next = l;
		if(r != null)
			temp.next = r;
		
		return res.next;
	}
	
	public Cvor mergeSort(Cvor head) {
		if(head == null || head.next == null)
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
	
	public void dodaj(String ime, String sadrzaj) {
		this.glava = mergeSort(this.glava);
		Cvor novi = new Cvor(ime,sadrzaj);
		Cvor temp = this.glava;
		Cvor prev = null;
		while(temp != null && temp.ime.compareTo(novi.ime) < 0) {
			prev = temp;
			temp = temp.next;
		}
		if(prev == null) {
			this.glava = novi;
			novi.next = temp;
		}
		else {
			prev.next = novi;
			novi.next = temp;
		}
	}
	
	public void pronadjiFajlove(String txt) {
		System.out.println("Pronadjeni fajlovi:");
		Cvor temp = this.glava;
		while(temp != null) {
			if(temp.sadrzi(txt)) 
				System.out.println(temp.toString());
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public void pronadjiDuplikate() {
		System.out.println("Pronadjeni duplikati:");
		Cvor temp2 = this.glava;
		Cvor temp = this.glava;
		while(temp2 != null) {
			while(temp != null && temp.next != null) {
				if(temp.equals(temp.next)) 
				System.out.println(temp.toString());
				temp = temp.next;
			}
			temp2 = temp2.next;
			temp = temp2;
		}
		System.out.println(".");
		
	}
}
