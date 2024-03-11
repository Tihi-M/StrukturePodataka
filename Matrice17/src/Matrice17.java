import java.util.Scanner;
public class Matrice17 {
	public static void printMatrix(int[][] matrix,int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void popuniMatricu2(int[][] matrix,int n) {
		int sumOfIndex = 0;
		int el = 1;
		while(sumOfIndex <= 2*(n-1)) {
			for(int i = 0; i < n;i++) {
				for(int j = 0;j < n;j++) {
					if(sumOfIndex == i+j) matrix[i][j] = el; 
				}
			}
			sumOfIndex++;
			if(sumOfIndex > n-1) el--;
			else el++;
		}
	}
	
	/*
	 * 0.0 0.1 0.2
	 * 1.0 1.1 1.2
	 * 2.0 2.1 2.2
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N:");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		popuniMatricu2(mat,n);
		printMatrix(mat,n);
	}
}
