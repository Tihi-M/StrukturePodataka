import java.util.Scanner;
import java.util.Stack;
public class Test {
	public static Scanner sc  = new Scanner(System.in);
	
	public static void fillArr(int[] arr) {
		for(int i = 0; i < arr.length;i++)
			arr[i] = sc.nextInt();
	}
	
	public static void printNextGreater(int[] arr) {
		Stack<Integer> s = new Stack<>();
		s.push(arr[0]);
		int el, next;
		for(int i = 1; i < arr.length;i++) {
			next = arr[i];
			
			if(!s.isEmpty()) {
				el = s.pop();
				
				while(el < next) {
					System.out.println(next + " > " + el);
					if(s.isEmpty())
						break;
					else
						el = s.pop();
				}
				
				if(el > next)
					s.push(el);
			}
			
			s.push(next);
		}
		
		while(!s.isEmpty()) {
			System.out.println(s.pop() + " ~ " + "-1");
		}
	
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza: ");
		int len = sc.nextInt();
		if(len <=0)
			return;
		int arr[] = new int[len];
		fillArr(arr);
		printNextGreater(arr);
		
		
		
	}
}
