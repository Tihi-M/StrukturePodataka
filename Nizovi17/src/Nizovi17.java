import java.util.Scanner;
import java.util.Random;

public class Nizovi17 {
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0;i < len;i++)
			arr[i] = rnd.nextInt(10);
	}
	
	public static void printPoli(int[] arr,int len,int x) {
		for(int i = 0; i < len; i++){
			if(i != len-1) System.out.print(arr[i]+"*"+x+"^"+i+" + ");
			else System.out.print(arr[i]+"*"+x+"^"+i);
		}
		System.out.println();
	}
	
	public static int vrijednostPoli(int[] arr,int len,int x) {
		int res = 0;
		int st=1;
		for(int i = 0;i < len;i++) {
			res += arr[i]*st;
			st*=x;
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza: ");
		int len = sc.nextInt();
		System.out.println("X:");
		int X = sc.nextInt();
		sc.close();
		int[] koeficijenti = new int[len];
		fillArr(koeficijenti,len);
		printPoli(koeficijenti,len,X);
		System.out.println("Vrijednost polinoma:"+vrijednostPoli(koeficijenti,len,X));
	}
}
