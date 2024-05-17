import java.util.Scanner;
import java.util.Stack;
public class Tets {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillArr(int[] arr) {
		for(int i = 0; i< arr.length;i++)
			arr[i] = sc.nextInt();
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] pushEl = new int[n];
		int[] popEl = new int[n];
		fillArr(pushEl);
		fillArr(popEl);
		
		Stack<Integer> moves = new Stack<>();
		Stack<String> actions = new Stack<>();
		int i_=0;
		int j_=0;
		int movesNum = 0;
		while(movesNum < 2*n && ((j_ >= 0 && j_<n)||(i_ >= 0 && i_<n))) {
			if(pushEl[i_] != popEl[j_]) {
				moves.push(pushEl[i_]);
				actions.push("push");
				i_++;
				movesNum++;
			}
			else if(popEl[j_] == moves.peek()) {
				moves.pop();
				actions.push("pop");
				j_++;
				i_--;
				movesNum++;
			}
			else {
				System.out.println("-");
				break;
			}
			
		}
		Stack<String> copy = new Stack<>();
		while(!actions.empty())
			copy.push(actions.pop());
		
		while(!copy.empty())
			System.out.println(copy.pop());
		
		
	}
}
