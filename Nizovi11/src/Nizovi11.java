import java.util.Scanner;
import java.util.Random;

public class Nizovi11 {
	public static int max(int[] arr,int len) {
		int tempMax= Integer.MIN_VALUE;
		for(int i = 0;i < len;i++) 
			if(tempMax < arr[i]) tempMax=arr[i];
				
		return tempMax;
	}
	
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0; i < len;i++)
			arr[i] = rnd.nextInt(20);
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0; i < len;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza: ");
		int len = sc.nextInt();
		int[] niz = new int[len];
		sc.close();
		fillArr(niz,len);
		printArr(niz,len);
		System.out.println("Najveci el: " + max(niz,len));
	}
}
