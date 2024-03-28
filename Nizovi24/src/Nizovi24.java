import java.util.Scanner;
public class Nizovi24 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillNum(int[] arr) {
		for(int i =0;i < arr.length;i++)
			arr[i]=sc.nextInt();
	}
	
	public static void printArr(int[] arr) {
		for(int i = 0;i < arr.length;i++)
			if(!(i == 0 && arr[i] == 0))
				System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void saberi(int[] num1,int[] num2) {
		int[] zbir = new int[Math.max(num1.length, num2.length)+1];
		int i = num1.length-1;
		int j = num2.length-1;
		int k = zbir.length-1;
		int prenos = 0;
		while(i >= 0 && j>=0) {
			zbir[k] = (num1[i] + num2[j] + prenos) % 10;
			prenos = (num1[i] + num2[j] + prenos) / 10;
			i--;
			j--;
			k--;
		}
		while(i >= 0) {
			zbir[k] = (num1[i] + prenos)%10;
			prenos = (num1[i] + prenos)/10;
			i--;
			k--;
		}
		while(j >= 0) {
			zbir[k] = (num2[j] + prenos)%10;
			prenos = (num2[j] + prenos)/10;
			j--;
			k--;
		}
		zbir[0] = prenos;
		printArr(zbir);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina prvog broja");
		int n = sc.nextInt();
		int[] br1 = new int[n];
		fillNum(br1);
		System.out.println("Duzina drugog broja");
		int m = sc.nextInt();
		int[] br2 = new int[m];
		fillNum(br2);
		
		saberi(br1,br2);
		sc.close();
	}
}
