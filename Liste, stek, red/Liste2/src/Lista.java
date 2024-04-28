import java.math.*;
import java.util.Scanner;
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
	
	public Cvor pronadjiSredinu(Cvor head) {
		if(head == null)
			return null;
		Cvor res = null;
		Cvor temp = head;
		Cvor temp2 = head;
		while(temp2 != null && temp2.next != null) {
			res = temp;
			temp=temp.next;
			temp2 = temp2.next.next;
		}
		return res;
	}
	
	public Cvor merge(Cvor l, Cvor r,boolean b) {
		Cvor res = new Cvor(0);
		Cvor temp = res;
		if(b) {
			while(l != null && r != null) {
				if(l.val < r.val) {
					temp.next = l;
					l = l.next;
				}else{
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
		else {
			while(l != null && r != null) {
				if(l.val > r.val) {
					temp.next = l;
					l = l.next;
				}else{
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
	}
	
	public Cvor mergeSort(Cvor head, boolean b) {
		if(head == null || head.next == null)
			return head;

		Cvor left = head;
		Cvor right = pronadjiSredinu(left);
		Cvor tmp = right.next;
		right.next = null;
		right = tmp;
		
		left = this.mergeSort(head,b);
		right = mergeSort(right,b);
		
		return merge(left,right,b);
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
	
	public void preuredi2(int x) {
		Cvor curr = this.glava;
		Cvor nextC = null;
		Cvor prev = null;
		while(curr != null) {
			if(curr.val>=x) {
				prev = curr;
				curr = curr.next;
			}else {
				nextC=curr.next;
				prev.next = nextC;
				curr.next = this.glava;
				this.glava = curr;
				curr = nextC;
			}
		}
	}
	
	public Cvor joinList(Cvor head1,Cvor head2) {
		//head = mergeSort(head,false);
		//l2.glava = mergeSort(head,false);
		
		Cvor res = new Cvor(0);
		Cvor tmp = res;
		Cvor tmp1 = head1;
		Cvor tmp2 = head2;
		
		while(tmp1 != null && tmp2 != null) {
			if(tmp1.val < tmp2.val) {
				tmp.next = tmp1;
				tmp1 =tmp1.next;
			}
			else {
				tmp.next = tmp2;
				tmp2 = tmp2.next;;
			}
			tmp = tmp.next;
		}
		while(tmp1 != null) {
			tmp.next = tmp1;
			tmp = tmp.next;
			tmp1=tmp1.next;
		}
		while(tmp2 != null) {
			tmp.next = tmp2;
			tmp = tmp.next;
			tmp2 = tmp2.next;
		}
		return res.next;
	}
	
	public void fillList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Br clanova:");
		int brClanova = sc.nextInt();
		int val;
		while(brClanova>0) {
			val = sc.nextInt();
			dodajNaKraj(val);
			brClanova--;
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
	