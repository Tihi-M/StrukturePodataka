import java.util.Scanner;
public class Nizovi21 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillArr(int[] arr,int len) {
		for(int i = 0; i < len; i++) {
			arr[i] = sc.nextInt();
			while(arr[i] > len) {
				System.out.println("Mora biti manji od " + len);
				arr[i] = sc.nextInt();
			}
		}
		
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i < len; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static boolean notInArr(int[] arr,int len,int num) {
		for(int i = 0;i < len;i++) {
			if(arr[i] == num) return false;
		}
		return true;
	}
	
	public static void stampajPreskocene(int[] arr,int n) {
		for(int i = 1; i < n;i++) {
			if(notInArr(arr,n,i)) System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza");
		int n = sc.nextInt();
		int[] niz = new int[n];
		fillArr(niz,n);
		printArr(niz,n);
		stampajPreskocene(niz, n);
	}

}
