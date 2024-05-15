import java.util.Stack;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String input = new String();
		input = sc.next();
		while(!input.equals("0")) {
			s.push(input);
			input = sc.next();
		}
		while(!s.empty())
			System.out.println(s.pop());
		
		sc.close();
	}
}
