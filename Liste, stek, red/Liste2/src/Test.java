public class Test {
	public static void main(String[] args) {
		Lista l1 = new Lista();	
		l1.fillList();
		Lista l2 = new Lista();
		l2.fillList();
		l1.printList();
		l2.printList();
		//l1.dodaj1();
		//l1.dodaj2(2);
		//l1.dodaj3(3, 7);
		//l1.dodaj4(2, 0);
		//l1.obrisi(2, 3)
		//System.out.println(l1.pronadjiSredinu(l1.glava).val);
		//l1.reverseList();
		//l1.preuredi1(3);
		//l1.preuredi2(17);
		//l1.glava = l1.mergeSort(l1.glava,false);
		l1.glava = l1.mergeSort(l1.glava,true);
		l2.glava = l2.mergeSort(l2.glava,true);
		l1.glava = l1.joinList(l1.glava, l2.glava);
		l1.printList();
	}
}
