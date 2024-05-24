
public class Test {
	public static void main(String[] args) {
		MyList l1= new MyList();
		l1.addLast(2);
		l1.addLast(3);
		l1.addLast(5);
		l1.addLast(23);
		l1.addLast(6);
		l1.addLast(0);
		l1.addLast(12);
		
		l1.printList();
		
		l1.head = l1.mergeSort(l1.head);
		
		l1.printList();
		l1.add(24);
		l1.add(100);
		l1.add(7);
		l1.printList();
		
		l1.delete();
		l1.printList();
		
		l1.groupReverse();
		l1.printList();
		
	}
}
