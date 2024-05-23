import java.util.Scanner;
import java.util.Stack;


// 
public class Tets {
	public static Scanner sc = new Scanner(System.in);
	
	public static void printArr(int arr[]) {
		for(int i = 0; i< arr.length;i++)
			System.out.print(arr[i]);
		System.out.println();
		
	}
	
	public static void printOnes(String zagrade) {
		Stack<Character> s1  = new Stack<>();

		int result[] = new int[zagrade.length()];
		int count =0;
		s1.push(zagrade.charAt(0));
		for(int i = 1 ; i< zagrade.length();i++) {
			if(!s1.isEmpty() && s1.peek() == '(') {
				if(zagrade.charAt(i) == ')') {
					result[i-1]=0;
					result[i]=1;
					s1.pop();
				}
				else {
					s1.push(zagrade.charAt(i));
				}
			}
			else {
				count--;
				if(count == 0) {
					System.out.println(0);
					s1.pop();
				}
				else s1.push(zagrade.charAt(i));
			}
		}
		printArr(result);
	}
	
	public static void main(String[] args) {
		String zagrade = sc.next();
		printOnes(zagrade);
		sc.close();
	}
}
