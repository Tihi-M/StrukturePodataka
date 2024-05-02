
public class Objave {
	Objava glava;
	
	public Objave() {
		this.glava = null;
	}
	
	public void dodajObjavu(String o) {
		Objava nova = new Objava(o);
		if(this.glava == null) {
			this.glava = nova;
			return;
		}
		
		Objava temp  = this.glava;
		while(temp.next != null)
			temp = temp.next;
		temp.next = nova;
	}
	
}
