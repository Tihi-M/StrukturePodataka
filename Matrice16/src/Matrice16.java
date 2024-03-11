import java.util.Random;
import java.util.Scanner;
public class Matrice16 {
	public static void popuniMatricu1(int[][] matrix,int n, int k) {
		Random rnd = new Random();
		for(int i = 0; i < n;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = rnd.nextInt(-k,k);
	}
	
	public static void printMatrix(int[][] matrix,int n) {
		for(int i = 0; i<n;i++) {
			for(int j = 0; j < n; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("K:");
		int k = sc.nextInt();
		popuniMatricu1(mat,n,k);
		printMatrix(mat,n);
		sc.close();
	}
}
