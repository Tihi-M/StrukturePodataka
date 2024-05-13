import java.util.Stack;
import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		Stack<String> s2 = new Stack<>();
		Scanner sc = new Scanner(System.in);
		String input = new String();
		
		input = sc.next();
		String firstPage = input;
		
		while(!input.equals(".")) {
			if(!input.equals("back")) {
				System.out.println(input);
				s.push(input);
				s2.push(input);
				
			}
			else {
				if(!s.empty()) {
					s.pop();
					if(!s.empty()) {
						if(!s.peek().equals(firstPage)) {
							System.out.println(s.peek());
							s2.push(s.peek());
						}
						else {
							System.out.println(s.peek());
							s2.push(firstPage);
						}
					}
					else s2.push("-");
				}
				else {
					s2.push("-");
				}
			}
			
			input = sc.next();
		}
		
		Stack<String> s3 = new Stack<>();
		while(!s2.empty())
			s3.push(s2.pop());
		
		while(!s3.empty())
			System.out.println(s3.pop());
	}
}
