import java.util.Random;
import java.util.Scanner;
public class Matrice15 {
	public static Scanner sc = new Scanner(System.in);
	public static void printMatrix(int[][] matrix,int n) {
		for(int i = 0;i < n;i++) {
			for(int j =0; j < n;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void fillMatrix(int[][] matrix,int n) {
		Random rnd = new Random();
		for(int i = 0;i < n;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = rnd.nextInt(10);
		printMatrix(matrix,n);
	}
	public static void inputMatrix(int[][] matrix,int n) {
		for(int i = 0;i < n;i++)
			for(int j = 0; j< n;j++)
				matrix[i][j] = sc.nextInt();
	}
	public static void copyMatrix(int[][] ogMat,int[][] cMat,int n) {
		for(int i =0; i < n;i++)
			for(int j = 0;j<n;j++)
				cMat[i][j]=ogMat[i][j];
	}
	
	public static void rotateMatrix(int[][] matrix,int n) {
		int[][] copy = new int[n][n];
		copyMatrix(matrix,copy,n);
		int i_=0;
		int j_=0;
		for(int i = n-1; i>=0;i--) {
			for(int j = 0;j<n;j++) {
				matrix[j_][i_] = copy[i][j];
				j_++;
			}
			j_=0;
			i_++;
		}
		printMatrix(matrix,n);
	}
	
	/*
	 * 0.0 0.1 0.2
	 * 1.0 1.1 1.2
	 * 2.0 2.1 2.2
	 * 
	 * |
	 * V
	 * 
	 * 2.0 1.0 0.0
	 * 2.1 1.1 0.1
	 * 2.2 1.2 0.2
 	 */
	
	public static void main(String[] args) {
		System.out.println("Dimenzija matrice:");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		//fillMatrix(mat,n);
		inputMatrix(mat,n);
		rotateMatrix(mat,n);
		sc.close();
 	}
}
