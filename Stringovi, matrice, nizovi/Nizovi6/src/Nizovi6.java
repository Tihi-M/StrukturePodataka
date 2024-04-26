import java.util.Scanner;
import java.util.Random;

public class Nizovi6 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void printArr(int arr[],int len) {
		for(int i = 0;i < len; i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void fillRandom(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0; i < len;i++)
			arr[i] = rnd.nextInt(10);
		printArr(arr,len);
	}
	
	public static void shiftLeft(int[] arr, int len) {
		int tempF=arr[0];
		for(int i =0;i< len-1;i++)
			arr[i] = arr[i+1];
		arr[len-1]=tempF;
		printArr(arr,len);
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillRandom(niz,len);
		shiftLeft(niz,len);
		sc.close();
	}
}
