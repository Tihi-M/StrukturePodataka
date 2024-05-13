import java.util.Scanner;
import java.util.Stack;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> zagrade = new Stack<>();
		
		String izraz = sc.next();
		for(int i = 0; i<izraz.length();i++) {
			if(izraz.charAt(i)=='(') {
				zagrade.push('(');
			}
			if(izraz.charAt(i)=='[') {
				zagrade.push('[');
			}
			if(izraz.charAt(i)=='{') {
				zagrade.push('{');
			}
			
			if(izraz.charAt(i)==')') {
				if(zagrade.peek() != '(') {
					System.out.println("Ne");
					break;
				}
				else {
					zagrade.pop();
				}
			}
			if(izraz.charAt(i)=='}') {
				if(zagrade.peek() != '{') {
					System.out.println("Ne");
					break;
				}
				else {
					zagrade.pop();
				}
			}
			if(izraz.charAt(i)==']') {
				if(zagrade.peek() != '[') {
					System.out.println("Ne");
					break;
				}
				else {
					zagrade.pop();
				}
			}
		}
		
		if(zagrade.isEmpty())
			System.out.println("Da");
		
		
		
	}
}
