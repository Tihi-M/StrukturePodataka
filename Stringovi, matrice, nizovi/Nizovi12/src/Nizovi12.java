import java.util.Scanner;
import java.util.Random;


public class Nizovi12 {
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0; i < len; i++)
			arr[i] = rnd.nextInt(10);
	}
	
	public static void printArr(int[] arr, int len) {
		for(int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static float prosjecnaVr(int[] arr, int len) {
		float sum = 0;
		for(int i = 0; i < len; i++)
			sum += arr[i];
		return sum/len;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza");
		int len = sc.nextInt();
		sc.close();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		System.out.println("Prosjek: "+prosjecnaVr(niz,len));
	}
}
