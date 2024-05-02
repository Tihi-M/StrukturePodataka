
public class Test {
	public static void main(String[] args) {
		Pratioci p1 = new Pratioci();
		Objave o1 = new Objave();
		o1.dodajObjavu("aefi[jaaeaeaef");
		o1.dodajObjavu("aefgfngtgthaef");
		o1.dodajObjavu("aefi[jatt;weewaef");
		o1.dodajObjavu("aefi[324567");
		Korisnik k1 = new Korisnik("Tihi",p1,o1); 
		
		Pratioci p2 = new Pratioci();
		Objave o2 = new Objave();
		Korisnik k2 = new Korisnik("Milos",p2,o2);
		
		Pratioci p3 = new Pratioci();
		Objave o3 = new Objave();
		Korisnik k3 = new Korisnik("Mirka",p3,o3);
		
		Pratioci p4 = new Pratioci();
		Objave o4 = new Objave();
		Korisnik k4 = new Korisnik("Marko",p4,o4);
		
		Pratioci p5 = new Pratioci();
		Objave o5 = new Objave();
		Korisnik k5 = new Korisnik("Janko",p5,o5);
		
		Pratioci p6 = new Pratioci();
		Objave o6 = new Objave();
		Korisnik k6 = new Korisnik("Darko",p6,o6);
		
		p1.dodajPratiocaK(k2);
		p1.dodajPratiocaK(k5);
		p1.dodajPratiocaK(k3);
		p1.dodajPratiocaK(k4);
		p1.dodajPratiocaK(k6);
		
		k1.zaprati(k5);
		k1.zaprati(k2);
	
		//k5.prikaziPratioce();
		
		k1.prikaziPratioce();
		k1.prikaziObjave();
		k1.pronadjiFanove();
		k1.otprati(k2);
		k1.pronadjiFanove();
	}
}
