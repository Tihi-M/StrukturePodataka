
public class Test {
	public static void main(String[] args) {
		int[] x1 = {0,5,2,7};
		int[] y1 = {5,5,0,0};
		Paralelogram p1 = new Paralelogram(x1 ,y1);
		int[] x2 = {0,3,1,4};
		int[] y2 = {3,3,0,0};
		Paralelogram p2 = new Paralelogram(x2,y2);
		int[] x3 = {0,4,1,5};
		int[] y3 = {4,4,0,0};
		Paralelogram p3 = new Paralelogram(x3,y3);
		ListaParalelograma l1p1 = new ListaParalelograma();
		l1p1.dodajNaKraj(p1);
		l1p1.dodajNaKraj(p2);
		l1p1.dodajNaKraj(p3);
		//l1p1.printList();
		
		//l1p1.glava = l1p1.mergeSort(l1p1.glava);
		//l1p1.printList();
		int[] x4 = {0,3,1,4};
		int[] y4 = {6,6,0,0};
		Paralelogram p4 = new Paralelogram(x4,y4);
		
		int[] x5 = {0,2,1,3};
		int[] y5 = {2,2,0,0};
		Paralelogram p5 = new Paralelogram(x5,y5);
		
		l1p1.dodaj(p4);
		l1p1.dodaj(p5);
		l1p1.printList();
		
		
		l1p1.obrisi(9, 25);
		l1p1.printList();
	}
}
