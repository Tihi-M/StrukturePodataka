import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static boolean delDuplicates(String input) {
		Stack<Character> s = new Stack<>();
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '(') {
				s.push(input.charAt(i));
				count++;
				}
			else if(input.charAt(i)== ')') {
				if(!s.isEmpty() && s.peek() == '(') {
					count--;
					s.pop();
				}
			}
		}
		if(count == 0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		
		System.out.println(delDuplicates(inp));
		sc.close();
	}
}
