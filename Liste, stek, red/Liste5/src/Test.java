
public class Test {
	public static void main(String[] args) {
		int[] x1 = {1,2,3,4,5,6,7,8,9,10,1,12,13,14,15,16,1,18,19,20};
		int[] y1 = {1,2,3,4,5,6,7,8,9,10,11,12,10,14,15,16,17,1,19,20};
		Vozac v1 = new Vozac("Marko","Ferari",x1,y1);
		int[] x2 = {1,2,3,1,2,3,1,2,30,1,2,3,10,2,3,15,20,3,11,2};
		int[] y2 = {3,3,3,3,3,30,30,3,3,3,3,3,3,1,5,1,4,1,1,2};
		Vozac v2 = new Vozac("Jovan","BMW",x2,y2);
		int[] x3 = {2,4,6,8,2,4,6,8,2,4,6,8,2,4,6,8,2,4,6,8};
		int[] y3 = {1,2,3,3,2,1,2,4,6,6,4,2,3,4,5,5,4,3,2,1};
		Vozac v3 = new Vozac("Lazar","Mercedes",x3,y3);
		
		ListaVozaca l1 = new ListaVozaca();
		l1.dodajNaKraj(v1);
		l1.dodajNaKraj(v2);
		l1.dodajNaKraj(v3);
		
		l1.printList();
		int[] x5 = {2,1,6,8,2,4,6,8,2,4,1,8,2,4,6,1,2,4,1,8};
		int[] y5 = {3,3,3,3,3,30,30,3,3,30,3,3,3,1,5,1,4,1,1,2};
		Vozac v5 = new Vozac("Strahinja","Audi",x5,y5);
		l1.dodaj(v5);
		int[] x6 = {2,4,6,8,2,4,6,8,1,4,6,8,2,4,6,8,2,4,6,8};
		int[] y6 = {1,2,3,3,2,1,2,4,6,6,4,2,3,4,5,5,4,3,2,1};
		Vozac v6 = new Vozac("Milan","WV",x6,y6);
		l1.dodaj(v6);
		int[] x7 = {1,2,3,4,5,6,7,8,9,10,1,12,13,14,15,16,1,18,19,20};
		int[] y7 = {10,2,3,4,5,6,7,8,9,10,11,12,10,14,15,16,17,1,19,20};
		Vozac v7 = new Vozac("Milos","Dodge",x7,y7);
		l1.dodaj(v7);
		l1.printList();
		
		l1.brisi(v2);
		l1.printList();
	}
}
