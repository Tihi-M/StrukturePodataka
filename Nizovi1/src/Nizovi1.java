import java.util.Scanner;
import java.util.Random;

public class Nizovi1 {

	public static void printArr(int[] arr, int len) {
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0;i < len;i++) {
			arr[i] = rnd.nextInt(10);
		}
		printArr(arr,len);
	}
	
	public static void updateArr(int[] arr,int len, int a) {
		for(int i = 0;i < len; i++) {
			if(arr[i] > 0) 
				arr[i]-=a;
			else arr[i]+=a;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int len;
		System.out.println("Duzina niza: ");
		len = sc.nextInt();
		System.out.println("A:");
		int a = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		updateArr(niz,len,a);
		printArr(niz,len);
		sc.close();
	}

}
