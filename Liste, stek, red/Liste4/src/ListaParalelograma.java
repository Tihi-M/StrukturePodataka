
public class ListaParalelograma {
	Paralelogram glava;
	Paralelogram next;
	Paralelogram prev;
	
	public ListaParalelograma() {
		this.glava = null;
		this.prev = null;
		this.next = null;
	}
	
	public void dodajNaKraj(Paralelogram p) {
		Paralelogram temp = this.glava;
		if(this.glava == null) {
			this.glava = p;
			return;
		}
	
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = p;
	}
	
	
	public Paralelogram midList(Paralelogram head) {
		if(head == null)
			return head;
		
		Paralelogram temp = null;
		Paralelogram slow = head;
		Paralelogram fast = head;
		while(fast != null && fast.next!=null) {
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		return temp;
	}
	
	public Paralelogram merge(Paralelogram l,Paralelogram r) {
		int[] x = {0,0,0,0};
		int[] y = {0,0,0,0};
		Paralelogram res = new Paralelogram(x,y);
		Paralelogram temp = res;
		while(l != null && r != null) {
			if(l.compareTo(r) < 0) {
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
	
	public Paralelogram mergeSort(Paralelogram head) {
		if(head == null || head.next == null)
			return head;
		
		Paralelogram left = head;
		Paralelogram right = midList(head);
		Paralelogram temp = right.next;
		right.next=null;
		right = temp;
		
		left = mergeSort(head);
		right = mergeSort(right);
		
		return merge(left,right);
	}
	
	public void dodaj(Paralelogram p) {
		this.glava = mergeSort(this.glava);
		Paralelogram temp = this.glava;
		Paralelogram prev = null;
		while(temp != null && temp.compareTo(p) < 0) {
			prev = temp;
			temp = temp.next;
		}
		if(prev == null) {
			this.glava = p;
			p.next = temp;
		}else{
			prev.next = p;
			p.next = temp;
		}
	}
	
	public void printList() {
		Paralelogram temp = this.glava;
		while(temp !=null) {
			System.out.println(temp.toString());
			temp = temp.next;
		}
		System.out.println("Kraj liste");
		
	}
	
	public void obrisi(int a, int b) {
		Paralelogram temp = this.glava;
		Paralelogram prev = null;
		while(temp != null) {
			if(temp.povrsina() > a && temp.povrsina() <b) {
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
	
}
