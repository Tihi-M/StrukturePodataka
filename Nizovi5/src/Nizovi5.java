import java.util.Scanner;

public class Nizovi5 {
	public static Scanner sc = new Scanner(System.in);

	public static void fillArr(int[] arr,int len) {
		for(int i = 0;i < len ; i++)
			arr[i]=sc.nextInt();
		printArr(arr,len);
	}
	
	public static void printArr(int[] arr, int len) {
		for(int i = 0; i < len; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void changeSign(int[] arr,int len) {
		int changes = 0;
		for(int i = 0; i < len-1;i++) {
			if(arr[i]*arr[i+1] < 0) changes++;
		}
		System.out.println("Broj promjena: " + changes);
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz, len);
		changeSign(niz,len);
		sc.close();
	}
}
