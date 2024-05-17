import java.util.Scanner;
import java.util.Stack;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input  = sc.next();
		
		String[] splitInput = input.split("/");
		Stack<String> directs =  new Stack<>();
		
		for(int i = 0; i <splitInput.length ;i++)
			if(!splitInput[i].equals("..") && !splitInput[i].equals(".")) {
				if(i == splitInput.length-1)
					directs.push("/"+splitInput[i]);
				else if(i!=splitInput.length-2)
					directs.push(splitInput[i]+"/");
				else directs.push(splitInput[i]);
			}
			else if(!directs.isEmpty() && splitInput[i].equals(".."))
				directs.pop();

		Stack<String> reverse = new Stack<>();
		while(!directs.isEmpty())
			reverse.push(directs.pop());
		while(!reverse.isEmpty())
			System.out.print(reverse.pop());
		sc.close();
	}
}
