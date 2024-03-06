import java.util.Scanner;

public class Nizovi18 {
	public static Scanner sc = new Scanner(System.in);
	public static void fillArr(int[] arr,int len) {
		for(int i = 0; i < len; i++)
			arr[i]=sc.nextInt();
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i < len;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void stampajIndekse(int[] arr,int len) {
		System.out.println("Odgovarajuci indeksi: ");
		boolean indexFound = false;
		int sumPre=0;
		int sumAf=0;
		for(int j = 0; j<len;j++) 
			sumAf+=arr[j];
		for(int i = 0;i < len;i++) {
			sumPre+=arr[i];
				if(sumAf == sumPre) {
					System.out.println(i);
					indexFound = true;
				}
			sumAf-=arr[i];
		}
		if(!indexFound) System.out.print("-1");
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina niza:");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		sc.close();
		printArr(niz,len);
		stampajIndekse(niz,len);
		
	}
}
