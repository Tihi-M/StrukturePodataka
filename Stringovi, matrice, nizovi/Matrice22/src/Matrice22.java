import java.util.Scanner;
//validna matrica
public class Matrice22 {
	public static Scanner sc = new Scanner(System.in);
	public static void inputElements(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++)
			for(int j = 0;j < matrix[0].length;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static void fillArr(int[] arr,int n) {
		for(int i = 0;i < n;i++)
			arr[i] = i+1;
			
	}
	
	public static boolean isValidRowColl(int[] arr,int[] elToN) {
		int[] substractEl = new int[arr.length];
		for(int i = 0;i < arr.length;i++)
			substractEl[i] = arr[i] - elToN[i];
		int sum  = 0;
		for(int i = 0;i < substractEl.length;i++)
			sum += substractEl[i];
		if(sum != 0) return false;
		return true;
	}
	
	public static boolean isValid(int[][] matrix) {
		int[] oneToN = new int[matrix[0].length];
		fillArr(oneToN, oneToN.length);
		for(int i = 0;i < matrix.length;i++)
			if(isValidRowColl(matrix[i],oneToN) == false) return false; 
		for(int i = 0;i < matrix.length;i++) {
			int[] coll = new int[matrix.length];
			for(int j=0;j<matrix.length;j++)
				coll[j] = matrix[j][i];
			if(isValidRowColl(coll,oneToN) == false) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print("Dimenzija matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		inputElements(mat);
		if(isValid(mat)) System.out.println("da");
		else System.out.println("ne");
		sc.close();
	}
}
