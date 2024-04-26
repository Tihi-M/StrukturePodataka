import java.util.Scanner;
import java.util.Random;

public class Nizovi2 {
	
	public static void printArr(int[] arr, int len) {
		for(int i = 0;i < len; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
	}
	
	public static void fillArr(int[] arr, int len) {
		Random rnd = new Random();
		for(int i =0;i<len;i++)
			arr[i] = rnd.nextInt(10);
		printArr(arr,len);
		
	}
	
	public static void minArr(int[] arr, int len,int a) {
		int min = 100;
		for(int i = 0;i < len;i++) {
			if((arr[i] < min)&&(arr[i] > a))
				min = arr[i];
		}
		if(min != 100)System.out.println("Trazeni element: " + min);
		else System.out.println("Trazeni element: ne postoji :(");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza");
		int len = sc.nextInt();
		System.out.println("A:");
		int a = sc.nextInt();
		sc.close();
		int[] niz = new int[len];
		fillArr(niz, len);	
		minArr(niz, len, a);
	}

}
