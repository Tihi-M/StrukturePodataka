import java.util.Scanner;
import java.util.Random;
public class Nizovi15 {
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0; i < len; i++)
			arr[i] = rnd.nextInt(10);
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static int countEven(int[] arr,int len) {
		int count = 0;
		for(int i = 0; i < len; i++)
			if(arr[i] % 2 == 0) count++;
		return count;
	}
	
	public static void formEvenOdd(int[] arr,int ogLen,int len1,int len2) {
		int[] even = new int[len1];
		int[] odd = new int[len2];
		int j = 0;
		int k = 0;
		for(int i = 0; i<ogLen;i++) {
			if(arr[i] % 2 == 0) {
				even[j] = arr[i];
				j++;
			}
			else {
				odd[k] = arr[i];
				k++;
			}
		}
		System.out.println("Parni clanovi:");
		printArr(even, len1);
		System.out.println("Neparni clanovi:");
		printArr(odd, len2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza: ");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		int lenEvenArr = countEven(niz,len);
		formEvenOdd(niz,len,lenEvenArr,len-lenEvenArr);
		sc.close();
}
}