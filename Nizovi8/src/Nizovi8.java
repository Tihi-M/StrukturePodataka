import java.util.Scanner;

public class Nizovi8 {
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
	
	public static void parneCifre(int[] arr,int len,int n) {
		System.out.println("Odgovarajuci elementi: ");
		for(int i = 0; i < len ; i++) {
			int brP = 0;
			int tempEl = arr[i];
			while(tempEl > 0) {
				if(tempEl % 10 % 2 == 0)
					brP++;
				else
					tempEl /= 10;
				if(brP == n) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		System.out.println("Broj parnih cifara:");
		int n = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		parneCifre(niz,len,n);
		sc.close();
	}
}
