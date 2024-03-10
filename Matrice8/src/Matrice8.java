import java.util.Scanner;
import java.util.Random;

public class Matrice8 {
	public static void fillMatrix(int[][] matrix,int n) {
		Random rnd = new Random();
		for(int i = 0; i < n; i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = rnd.nextInt(10);
	}
	
	public static void printMatrix(int[][] matrix,int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0; j<n ; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void proizvodMatrica(int[][] matrix1,int[][] matrix2,int n) {
		int[][] proizvod = new int[n][n];
			for(int k = 0; k < n;k++)
				for(int i = 0;i < n;i++)
					for(int j = 0;j < n;j++)
						proizvod[k][i]+=matrix1[k][j]*matrix2[j][i];
		printMatrix(proizvod,n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice:");
		int n = sc.nextInt();
		int[][] mat1 = new int[n][n];
		int[][] mat2 = new int[n][n];
		fillMatrix(mat1,n);
		fillMatrix(mat2,n);
		printMatrix(mat1,n);
		printMatrix(mat2,n);
		proizvodMatrica(mat1,mat2,n);
	}
}
