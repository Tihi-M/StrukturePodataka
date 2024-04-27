
public class Lista {
	Cvor glava;
	
	public Lista() {
		this.glava = null;
	}
	
	public void dodajNaPocetak(int val) {
		Cvor novi = new Cvor(val);
		novi.nextC = this.glava;
		this.glava = novi;
	}
	
	public void dodajNaKraj(int val) {
		Cvor novi = new Cvor(val);
		if(this.glava == null) {
			this.glava = novi;
			return;
		}//ako su izbrisani svi cvorovi;
		
		Cvor temp = this.glava;
		
		while(temp.nextC != null)
			temp = temp.nextC;
		
		temp.nextC = novi;
	}
	
	public void stampajListu() {
		Cvor temp = this.glava;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.nextC;
		}
		System.out.println("#");
	}
	
	public int brCvorova() {
		Cvor temp = this.glava;
		int n=0;
		while(temp != null) {
			n++;
			temp = temp.nextC;
		}
		return n;
	}
	
	public void obrisiElement(int val_) {
		Cvor temp = this.glava;
		Cvor prev = null;
		while(temp != null && temp.val != val_) {
			prev = temp;
			temp = temp.nextC;
		}
		if(temp == null)
			return;
		if(prev != null)
			prev.nextC = temp.nextC;
		else
			this.glava = this.glava.nextC;
		
	}
	
	public void obrisiSveCv(int val_) {
		Cvor temp = this.glava;
		Cvor prev = null;
		while(temp!=null) {
			if(temp.val == val_) {
				if(prev == null) {
					this.glava=this.glava.nextC;
				}
				else {
					prev.nextC = temp.nextC;
				}
				temp = temp.nextC;
			}
			else {
				prev = temp;
				temp = temp.nextC;
			}
		}
	}
	public void obrisiListu(int len) {
		Cvor temp = this.glava;
		for(int i = 0;i < len && temp!=null;i++) {
			Cvor temp2 = temp;
			temp = temp.nextC;
			obrisiElement(temp2.val);
		}
	}
	
	public void obrisiGlavu() {
		if(this.glava==null)
			return;
		this.glava = this.glava.nextC;
	}
	
	
} 
