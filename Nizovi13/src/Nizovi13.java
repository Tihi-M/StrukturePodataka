import java.util.Scanner;
import java.util.Random;

public class Nizovi13 {
	public static void fillArr(int[] arr, int len) {
		Random rnd = new Random();
		for(int i = 0; i < len; i++)
			arr[i] = rnd.nextInt(10);
	}
	
	public static void printArr(int[] arr, int len) {
		for(int i = 0;i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static int prebroj(int[] arr, int len, int k_) {
		int count= 0;
		for(int i = 0; i < len; i++) {
			if((arr[i]%2 == 0)&&(arr[i] > k_))
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza: ");
		int len = sc.nextInt();
		int[] niz = new int[len];
		System.out.println("K: ");
		int k = sc.nextInt();
		sc.close();
		fillArr(niz,len);
		printArr(niz,len);
		System.out.println("Broj parnih el vecih od " + k + ": " + prebroj(niz,len,k));
	}
}
