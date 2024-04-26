import java.util.Scanner;
public class Nizovi25 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillNum(int[] arr) {
		System.out.println("Unesite cifru po cifru:");
		for(int i = 0; i<arr.length;i++)
			arr[i] = sc.nextInt();
	}
	
	public static void printArr(int[] arr) {
		int i =0;
		while(arr[i] == 0) {
			i++;
		}
		
		for(int j = i; j < arr.length;j++)
			System.out.print(arr[j] + " ");
	}
	
	public static void oduzmi(int[] a,int[] b) {
		int[] razlika = new int[a.length];
		int i = a.length-1;
		int j = b.length-1;
		int k = razlika.length-1;
		while(j>=0) {
			if(b[j] > a[i]) {
				razlika[k]=a[i]+10-b[j];
				int z = i;
				if(a[z] - 1 < 0)
					while(z >= 1 && a[z] - 1 < 0) {
						a[z] = 9;
						a[z-1]--;
						z--;
					}
				else a[i-1]--;
			}
			else razlika[k] = a[i]-b[j];
			k--;
			i--;
			j--;
		}
		while(i>=0) {
			razlika[k] = a[i];
			k--;
			i--;
		}
		printArr(razlika);
	}
	
	public static void main(String[] args) {
		System.out.println("Duzina prvog broja:");
		int n = sc.nextInt();
		int[] br1 = new int[n];
		fillNum(br1);
		System.out.println("Duzina drugog broja:(mora biti manji od prvog)");
		int m = sc.nextInt();
		int[] br2 = new int[m];
		fillNum(br2);
		
		oduzmi(br1,br2);
		sc.close();
	}
	
}