import java.util.Scanner;
import java.util.Random;

public class Nizovi14 {
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0; i < len;i++)
			arr[i] = rnd.nextInt(10);
	}
	
	public static void  printArr(int[] arr, int len) {
		for(int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void doubleArr(int[] arr, int len) {
		int[] arr2 = new int[len*2];
		for(int i = 0; i < len;i++) {
			int j = 2*i+1;
			arr2[j] = arr[i];
			arr2[j-1] = arr[i];
		}
		printArr(arr2,len*2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza: ");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		doubleArr(niz,len);
		sc.close();
	}
}
