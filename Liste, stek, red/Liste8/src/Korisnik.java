
public class Korisnik {
	Korisnik next;
	String ime_korisnika;
	Pratioci listaP;
	Objave listaO;
	public Korisnik(String ime_,Pratioci p_,Objave o_) {
		this.ime_korisnika = ime_;
		this.listaP = p_;
		this.listaO = o_;
		this.next = null;
	}
	
	public void prikaziPratioce() {
		Korisnik temp = this.listaP.glava;
		while(temp != null) {
			System.out.println(temp.ime_korisnika);
			temp = temp.next;
		}
		System.out.println("###########");
	}
	
	public void prikaziObjave() {
		Objava temp = this.listaO.glava;
		while(temp != null) {
			System.out.println(temp.sadrzaj);
			temp = temp.next;
		}
		System.out.println("###########");
	}
	
	public void zaprati(Korisnik k) {
		k.listaP.dodajPratiocaK(this);
	}
	
	public void otprati(Korisnik k) {
		k.listaP.ukloniPratioca(this);
	}
	
	public void pronadjiFanove() {
		Korisnik temp1 = this.listaP.glava;
		Korisnik temp2 = null;
		Korisnik found = null;
		while(temp1 != null) {
			found = temp1;
			temp2 = temp1.listaP.glava;
			boolean pratiA= false;
			while(temp2 != null) {
				if(this.ime_korisnika.equals(temp2.ime_korisnika)) {
					pratiA = true;
					break;
				}
				temp2 = temp2.next;
			}
			if(!pratiA && found != null)
				System.out.println(found.ime_korisnika + " !");
			temp1 = temp1.next;
		}
		System.out.println("###########");
	}
	
}
