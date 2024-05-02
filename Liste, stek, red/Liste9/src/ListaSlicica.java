
public class ListaSlicica {
	Cvor glava;
	
	public ListaSlicica() {
		this.glava = null;
	}
	protected void printList() {
		Cvor temp = this.glava;
		while(temp != null) {
			System.out.println(temp.info.toString());
			temp = temp.next;
		}
		System.out.println("----------------------");
	}
	
	protected void add(Slicica s) {
		Cvor novi = new Cvor(s);
		if(this.glava == null) {
			this.glava = novi;
			return;
		}
		Cvor temp = this.glava;
		while(temp.next != null)
			temp = temp.next;
		temp.next = novi;
	}
	
	protected void del(Slicica s) {
		Cvor prev = null;
		Cvor temp = this.glava;
		while(temp != null) {
			if(temp.info.compareTo(s) == 0) {
				if(prev == null) {
					this.glava = this.glava.next;
					return;
				}
				else {
					prev.next = temp.next;
					return;
				}
			}
			prev = temp;
			temp = temp.next;
		}
	}
	
	private Cvor findMid(Cvor head) {
		if(head == null || head.next == null)
			return head;
		
		Cvor res = null;
		Cvor slow = head;
		Cvor fast = head;
		while(fast != null && fast.next != null) {
			res = slow;
			slow = slow.next;
			fast = fast.next;
		}
		return res;
	}
	
	private Cvor merge(Cvor l, Cvor r) {
		Slicica s = new Slicica("","",0);
		Cvor res = new Cvor(s);
		Cvor temp = res;
		
		while(l != null && r != null) {
			if(l.info.compareTo(r.info) < 0) {
				temp.next = l;
				l = l.next;
			}
			else {
				temp.next = r;
				r = r.next;
			}
			temp = temp.next;
		}
		
		if(l != null)
			temp.next = l;
		if(r != null)
			temp.next = r;
		return res.next;
		
	}
	
	protected Cvor mergeSort(Cvor head) {
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
	
	
	
}
