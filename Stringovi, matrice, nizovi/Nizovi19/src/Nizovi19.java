import java.util.Scanner;
//rotacija niza
public class Nizovi19 {
	public static Scanner sc = new Scanner(System.in);
	public static void fillArr(int[] arr,int len) {
		for(int i = 0;i < len;i++)
			arr[i] = sc.nextInt();
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void rotiraj(int[] arr,int len,int k) {
		int[] copy = new int[k];
		for(int i = 0; i < k;i++)
			copy[i] = arr[i];
		for(int i = 0; i <len-k;i++)
			arr[i] = arr[i+k];
		int j =0;
		for(int i = len-k; i < len;i++) {
			arr[i] = copy[j];
			j++;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		int[] niz = new int[len];
		System.out.println("k:");
		int k = sc.nextInt();
		fillArr(niz,len);
		printArr(niz,len);
		rotiraj(niz,len,k);
		printArr(niz,len);
		sc.close();
	}
}
