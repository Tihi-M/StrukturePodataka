import java.util.Scanner;

public class Nizovi16 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillArr(int[] arr,int len) {
		for(int i = 0; i < len; i++)
			arr[i]=sc.nextInt();
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static boolean jeOpadajuci(int[] arr,int len) {
		for(int i = 0;i < len-1;i++)
			if(arr[i]<arr[i+1])return false;
		return true;
	}
	
	public static boolean jeRastuci(int[] arr,int len) {
		for(int i = 0;i < len-1;i++)
			if(arr[i]>arr[i+1])return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		if(jeRastuci(niz,len)) System.out.println("Rastuci niz.");
		else if (jeOpadajuci(niz,len)) System.out.println("Opadajuci niz.");
		else System.out.println("Niz nije sortiran.");
		sc.close();
	}
}
