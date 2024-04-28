import java.math.*;
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
				novi.next = temp;
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
	
	public void obrisi(int d, int k) {
		Cvor temp = this.glava;
		Cvor prev = null;
		while(temp != null) {
			if(Math.abs(temp.val-d) < k) {
				if(prev == null) 
					this.glava = this.glava.next;
				else prev.next = temp.next;
				temp = temp.next;
			}
			else {
				prev = temp;
				temp = temp.next;
			}
		}
		
	}
	
	public void pronadjiSredinu() {
		Cvor temp = this.glava;
		Cvor temp2 = this.glava;
		while(temp2 != null && temp2.next != null) {
			temp=temp.next;
			temp2 = temp2.next.next;
		}
		System.out.println("Srednji el: " + temp.val);
	}
	
	public void reverseList() {
		Cvor nextC = null;
		Cvor prev = null;
		Cvor curr = this.glava;
		while(curr != null) {
			nextC = curr.next;
			curr.next = prev;
			prev = curr;
			curr =nextC;
		}
		this.glava = prev;
	}
	
	public void preuredi1(int k) {
		int k2 = 1;
		Cvor temp = this.glava;
		while(k2 < k) {
			temp = temp.next;
			k2++;
		}
		
		Cvor sredina = temp.next;
		temp.next = null;
		
		Cvor nextC = null;
		Cvor prev = null;
		Cvor curr = this.glava;
		while(curr != null) {
			nextC = curr.next;
			curr.next = prev;
			prev = curr;
			curr =nextC;
		}

		this.glava = prev;
		curr = this.glava;

		while(curr.next != null)
			curr = curr.next;
	
		curr.next = sredina;
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
	