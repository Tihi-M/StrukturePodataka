import java.util.Scanner;
import java.util.Random;


public class Nizovi10 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0; i<len;i++) {
			System.out.println(i+1+": "+arr[i]);
		}
	}
	
	public static void baciKocku(int cnt) {
		int[] results = new int[6];
		int res;
		Random rnd = new Random();
		for(int i = 0; i < cnt; i++) {
			res = rnd.nextInt(6);
			results[res]++;
		}
		printArr(results,6);
	}
	
	public static void main(String[] args) {
		System.out.println("Broj bacanja kockice");
		int n = sc.nextInt();
		sc.close();
		baciKocku(n);
	}
}
