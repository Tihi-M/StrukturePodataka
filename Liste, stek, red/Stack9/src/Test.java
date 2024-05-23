import java.util.Stack;
import java.math.*;
import java.util.Scanner;
public class Test {
	public static Scanner sc = new Scanner(System.in);
	public static void printAbsoluteOnes(int m, int n) {
		for(int i  = m; i  <= n ;i++) {
			int temp = i;
			int dif = temp%10;
			temp/=10;
			while(temp > 0) {
				dif -= temp%10;
				temp /= 10;
			}
			dif = Math.abs(dif);
			if(dif == 1)
				System.out.print(i +" ");
		}
	}
	
	public static void main(String[] args) {
			int m, n;
			System.out.println("M, n : ");
			m= sc.nextInt();
			n = sc.nextInt();
			printAbsoluteOnes(m,n);
			
			sc.close();
		}
}
