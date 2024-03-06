import java.util.Scanner;

public class Nizovi23 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillArr(int[] arr,int len) {
		for(int i = 0; i < len;i++)
			arr[i] = sc.nextInt();
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0; i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void addEl(int[] arr,int len,int el) {
		int[] arr2= new int[len+1];
		int elInd = 0;
		for(int i =0; i < len;i++) {
			if(el<arr[i]) {
				elInd = i;
				break;
			}
			else elInd++;
		}
		arr2[elInd] = el;
		for(int i = 0; i < elInd;i++)
			arr2[i] = arr[i];
		for(int i = elInd+1;i < len+1;i++) {
			arr2[i] = arr[i-1];
		}
		printArr(arr2,len+1);
	}
	// 1 2 3 4 6 7 8 
	// 1 2 3 4 5 6 7 8
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		int[] niz = new int[len];
		System.out.println("X:");
		int x = sc.nextInt();
		fillArr(niz,len);
		printArr(niz,len);
		sc.close();
		addEl(niz,len,x);
	}
}
