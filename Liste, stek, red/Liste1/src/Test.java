
public class Test {
	public static void main(String[] args) {
		Lista l1 = new Lista();
		l1.dodajNaPocetak(5);
		l1.dodajNaKraj(4);
		l1.dodajNaPocetak(1);
		l1.dodajNaPocetak(3);
		l1.dodajNaKraj(2);
		l1.dodajNaPocetak(1);
		l1.dodajNaPocetak(1);
		l1.dodajNaKraj(1);
		l1.dodajNaKraj(6);
		l1.stampajListu();
		int brCv = l1.brCvorova();
		System.out.println("Broj Cvorova: "+brCv);
		l1.obrisiElement(5);
		l1.stampajListu();
		l1.obrisiSveCv(1);
		//l1.obrisiListu(brCv);
		l1.stampajListu();
		l1.obrisiGlavu();
		l1.stampajListu();
	}
}
