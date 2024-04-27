
public class Lista {
	Cvor glava;
	
	public Lista() {
		this.glava = null;
	}
	
	public void dodajNaPocetak(int val_) {
		Cvor novi = new Cvor(val_);
		novi.next = this.glava;
		this.glava = novi;
	}
	
	public void dodajNaKraj(int val_) {
		Cvor novi = new Cvor(val_);
		if(this.glava == null) {
			this.glava=novi;
			return;
		}
		
		Cvor temp = this.glava;
		while(temp.next!=null)
			temp = temp.next;
		
		temp.next = novi;
	}
	
	public void dodaj1() {
		Cvor temp = this.glava;
		while(temp.next != null) {
			int newVal = temp.val - temp.next.val;
			Cvor novi = new Cvor(newVal);
			novi.next = temp.next;
			temp.next = novi;
			temp = novi.next;
		}
	}
	public void dodaj2(int k) {
		Cvor temp = this.glava;
		while(temp != null) {
			if(temp.val % k == 0) {
				Cvor novi = new Cvor(-1);
				novi.next = temp.next;
				temp.next = novi;
				temp = novi.next;
			}
			else temp = temp.next;
		}
	}
	
	public void dodaj3(int a, int b) {
		Cvor temp = this.glava;
		while(temp != null) {
			if(temp.val > a && temp.val < b) {
				Cvor novi = new Cvor(0);
				novi.next = temp.next;
				temp.next = novi;
				temp = novi;
			}
			else temp = temp.next;
		}
	}
	
	public void dodaj4(int k,int v) {
		Cvor temp = this.glava;
		Cvor prev = temp;
		int tempK =k;
		while(temp != null) {
			if(tempK == 0) {
				Cvor novi = new Cvor(v);
				novi.next = temp.next;
				prev.next = novi;
				temp = novi.next;
				tempK = k;
			}
			else {
				tempK--;
				prev = temp;
				temp = temp.next;
			}
		}
	}
	
	public void printList() {
		Cvor temp = this.glava;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("#");
	}
}
	