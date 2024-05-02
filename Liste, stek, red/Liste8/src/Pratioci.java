
public class Pratioci {
	Korisnik glava;
	public Pratioci() {
		this.glava = null;
	}
	
	public void dodajPratiocaK(Korisnik k) {
		if(this.glava == null) {
			this.glava = k;
			return;
		}
		
		Korisnik temp = this.glava;
		while(temp.next != null) 
			temp = temp.next;
		temp.next = k;	
	}
	
	public void ukloniPratioca(Korisnik k) {
		Korisnik temp = this.glava;
		Korisnik prev = null;
		while(temp != null) {
			if(temp.ime_korisnika.equals(k.ime_korisnika)) {
				if(prev == null) {
					this.glava = this.glava.next;
					return;
				}
				else {
					prev.next = temp.next;
					temp = temp.next;
				}
			}
		}
	}
}
