import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lista l1 = new Lista();
		System.out.println("Br clanova:");
		int brClanova = sc.nextInt();
		int val;
		while(brClanova>0) {
			val = sc.nextInt();
			l1.dodajNaKraj(val);
			brClanova--;
		}
		l1.printList();
		//l1.dodaj1();
		//l1.dodaj2(2);
		//l1.dodaj3(3, 7);
		l1.dodaj4(2, 0);
		l1.printList();
		sc.close();
	}
}
