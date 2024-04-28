
public class Test {
	public static void main(String[] args) {
		Lista l1 = new Lista();
		l1.dodajNaKraj("auto");
		l1.dodajNaKraj("bicikl");
		l1.dodajNaKraj("dimnjak");
		l1.dodaj("crvena");
		l1.dodaj("ajkula");
		l1.dodaj("gvozdje");
		l1.dodaj("crvena");
		l1.dodaj("gvozdje");
		l1.dodaj("ajkula");
		l1.printList();
		l1.obrisi("bcde",4);
		l1.printList();
	}
}
