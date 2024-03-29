import java.util.Scanner;
public class Matrice29 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillMatrix(int[][] matrix) {
		System.out.println("Matrica: ");
		for(int i = 0;i < matrix.length;i++)
			for(int j = 0;j < matrix[0].length;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[0].length; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void findSubmatrix(int[][] matrix, int s) {
		int n = Math.min(matrix.length, matrix[0].length);
		while(n > 0) {
			for(int k = 0; k < matrix.length-n+1;k++) {
				for(int l =0; l < matrix[0].length-n+1;l++) {
					int sum = 0;
					int[][] subMatrix = new int[n][n];
					for(int i = 0; i < n;i++) {
						for(int j = 0; j < n;j++) {
							subMatrix[i][j] = matrix[k+i][l+j];
							sum +=  matrix[k+i][l+j];
							if(sum > s ) break;
							}
					}
				if(sum <= s) {
					printMatrix(subMatrix);
					return;
					}
				}
			}
			n--;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("m x n: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matr = new int[m][n];
		fillMatrix(matr);
		System.out.println("suma:");
		int s = sc.nextInt();
		findSubmatrix(matr,s);
		sc.close();
	}
}
