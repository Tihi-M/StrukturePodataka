import java.util.Scanner;
import java.util.Random;

public class Nizovi22 {
	
	public static void fillArr(int[] arr,int len) {
		Random rnd = new Random();
		for(int i = 0;i < len;i++)
			arr[i] = rnd.nextInt(10);
	}
	
	public static void printArr(int[] arr,int len) {
		for(int i = 0;i<len;i++) 
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static int countEven(int[] arr,int len) {
		if(len < 0) return 0;
		else if(arr[len] % 2 == 0) return 1+countEven(arr,len-1);
		else return countEven(arr,len-1);
	}
	
	public static void fillSecondaryArr(int[] arr2,int len,int[] arr, int ogLen,int opt) {
		int j = 0;
		if(opt == 0) {
			for(int i = 0; i < ogLen;i++) {
				if(arr[i] % 2 == 0) {
					arr2[j] = arr[i];
					j++;
				}
			}
		}else {
			for(int i = 0; i < ogLen;i++) {
				if(arr[i] % 2 != 0) {
					arr2[j] = arr[i];
					j++;
				}
			}
		}
	}
	
	public static void premjesti(int[] arr,int len) {
		int brParnih = countEven(arr,len-1);
		int brNeparnih = len-brParnih;
		int[] parni = new int[brParnih];
		int[] neparni = new int[brNeparnih];
		fillSecondaryArr(parni,brParnih,arr,len,0);
		fillSecondaryArr(neparni,brNeparnih,arr,len,1);
		for(int i = 0;i < brParnih;i++) {
			arr[i] = parni[i];
		}
		int j = 0;
		for(int i = brParnih; i < len; i++) {
			arr[i] = neparni[j];
			j++;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Duzina niza");
		int len = sc.nextInt();
		int[] niz = new int[len];
		fillArr(niz,len);
		printArr(niz,len);
		premjesti(niz,len);
		printArr(niz,len);
		sc.close();
	}
}
