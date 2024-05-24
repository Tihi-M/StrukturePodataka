
public class Test {
	public static void main(String[] args) {
		MyList l1 = new MyList();
		l1.addEnd(2);
		l1.addEnd(5);
		l1.addEnd(19);
		l1.addEnd(23);
		l1.addEnd(7);
		l1.addEnd(13);
		l1.addEnd(2);
		l1.printList();
		//MergeSort vraca glavu list!!!
		//|
		//V
		l1.head = l1.mergeSort(l1.head);
		
		l1.printList();
		
		//l1.insert1();
		
		//l1.printList();
		
		//l1.head  = l1.insert2();
		
		//l1.printList();
	
		//l1.insert4();
		//l1.printList();
		Node sr = null;
		sr = l1.sredina(l1.head);
		System.out.println(sr.data);
	}
}
