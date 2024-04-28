
public class Lista {
	Cvor glava;
	public Lista() {
		this.glava = null;
	}
	
	public void printList() {
		Cvor temp = this.glava;
		while(temp != null) {
			System.out.print(temp.rijec+" ");
			temp = temp.next;
		}
		System.out.println(".");
	}
	
	public void dodajNaKraj(String d) {
		Cvor novi = new Cvor(d);
		if(this.glava == null) {
			this.glava = novi;
			return;
		}
		Cvor temp = this.glava;
		while(temp.next != null)
			temp = temp.next;
		temp.next = novi; 
	}
	
	public void dodaj(String d) {
		Cvor temp = this.glava;
		Cvor novi = new Cvor(d);
		Cvor prev = null;
		while(temp != null && temp.rijec.compareTo(novi.rijec) < 0) {
			prev = temp;
			temp = temp.next;
		}
		if(prev != null) {
			if(temp != null && temp.rijec.equals(novi.rijec))
				return;
			else {
				prev.next = novi;
				novi.next = temp;
			}
		}else {
			if(!temp.rijec.equals(novi.rijec)) {
				this.glava = novi;
				novi.next = temp;
			}
		}
	}
	
	public int countDif(String str1,String str2) {
		int count = 0;
		for(int i = 0; i < str1.length();i++) {
			if(str2.indexOf(str1.charAt(i)) < 0) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
	public void obrisi(String d, int k) {
		Cvor temp = this.glava;
		Cvor prev = null;
		while(temp != null) {
			if(countDif(temp.rijec,d) > k) {
				if(prev == null) {
					this.glava = this.glava.next;
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
	
}

// a b d e f
