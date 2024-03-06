import java.util.Scanner;
import java.util.Random;

public class Nizovi20 {
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0; i < len; i++)
			arr[i] = rnd.nextInt(20);
	}
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i < len;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static boolean hasDuplicate(int[] arr,int len) {
		for(int i = 0; i < len-1;i++) {
			for(int j=i+1; j < len;j++)
				if(arr[j] == arr[i]) return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		sc.close();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		if(hasDuplicate(niz,len)) System.out.println("Ima");
		else System.out.println("Nema");
	}
}
