import java.util.Scanner;

public class Nizovi4 {
	static public Scanner sc = new Scanner(System.in);
	
	public static void takeInputs(int[] arr,int len) {
		for(int i = 0;i < len; i++) 
			arr[i] = sc.nextInt();
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void zeroElem(int[] arr,int len) {
		int brParova = 0;
		for(int i = 0;i < len-1;i++) 
			if((arr[i]%10 == 0) && (arr[i+1] % 10 == 0)) brParova++;
		System.out.println("Br parova sa nulama: "+brParova);
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		int[] niz = new int[len];
		takeInputs(niz,len);
		sc.close();
		zeroElem(niz,len);
	}
	
}
