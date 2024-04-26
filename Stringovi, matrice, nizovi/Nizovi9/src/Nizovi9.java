import java.util.Scanner;
import java.math.*;
public class Nizovi9 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillArr(int[] arr,int len) {
		for(int i=0; i < len; i++)
			arr[i] = sc.nextInt();
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static boolean jeParnaCif(int num) {
		for(int i = 2; i <= Math.sqrt(num);i++) {
			if(num % i == 0) return false;
		}
		return true;
	}
	
	public static void prosteCifre(int[] arr,int len) {
		System.out.println("Odgovarajuci elementi: ");
		for(int i = 0; i < len ; i++) {
			int tempEl = arr[i];
			while(tempEl > 0) {
				if(jeParnaCif(tempEl % 10)) {
					System.out.print(arr[i] + " ");
					break;
				}
				else
					tempEl /= 10;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		prosteCifre(niz,len);
		sc.close();
	}
}
