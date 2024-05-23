import java.util.Scanner;
import java.util.Stack;
public class Test {
	public static Scanner sc = new Scanner (System.in);

	public static void fillArr(int arr[],int len) {
		for(int i = 0; i < len;i++)
			arr[i] = sc.nextInt();
	}

	public static void ukloniDuplikate(int arr[],int k) {
		Stack<Element> s = new Stack<>();
		Stack<Element> result = new Stack<>();
		System.out.println("Pocetno stanje:");
		for(int i = 0;i < arr.length;i++) {
			int n = arr[i];
			if(!s.isEmpty() && s.peek().value == n) 
				s.peek().count++;
			else {
				s.add(new Element(n,1));
				
			}
			System.out.println(s.peek().toString());
		}
		boolean notRemovedAll = true;
			boolean removed = false;
			while(!s.isEmpty()) {
				if(s.peek().count >= k) {
					s.pop();
					removed = true;
					}
				else {
					if(!result.isEmpty()) {
						Element top = result.pop();
						Element next = s.pop();

						if(top.value == next.value) {
							int x  = top.count;
							int y = next.count;
							top.count = x+y;
							next.count = x+y;
							if(x+y<k) {	
							result.add(top);
							result.add(next);
							}
						}
						else {
							result.add(top);
							result.add(next);
						}
					}
					else {
						result.add(s.pop());
					}
				}
				notRemovedAll = removed;
			}
			System.out.println(notRemovedAll);

			if(notRemovedAll) {
				while(!result.isEmpty()) {
					System.out.println("Trenutno stanje: " +result.peek().toString());
					s.add(result.pop());
				}
			}
		System.out.println("Izasao iz petlje");
		while(!result.isEmpty()) {
			System.out.println(result.pop().toString());
		}
		
	}
	
	public static void main(String[] args) {
		int brPonavljanja = sc.nextInt();
		int brElemenata = sc.nextInt();
		
		int niz[] = new int[brElemenata];
		fillArr(niz,brElemenata);
		ukloniDuplikate(niz,brPonavljanja);
		sc.close();
	}
}
