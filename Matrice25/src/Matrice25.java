import java.util.Scanner;
import java.util.Random;
public class Matrice25 {
	public static void printMatrix(int[][] matrix) {
		for(int i =0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[0].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void fillMatrix(int[][] matrix) {
		Random rnd = new Random();
		for(int i = 0;i<matrix.length;i++)
			for(int j = 0;j<matrix[0].length;j++)
				matrix[i][j] = rnd.nextInt(10);
		printMatrix(matrix);
	
	}
	/*
	 * 00 01 02
	 * 10 11 21 
	 * 20 21 22
	 */
	public static void printElementsByDiagonals(int[][] matrix) {
		int sumOfIndex=0;
		int el =0;
		int n = matrix.length;
		int limit = n*n;
		while(el < limit) {
			for(int i = 0;i < n;i++) 
				for(int j =0;j< n;j++) 
					if(i+j==sumOfIndex) {
						System.out.print(matrix[i][j] + " ");
						el++;
					}
			sumOfIndex++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMatrix(mat);
		printElementsByDiagonals(mat);
		sc.close();
	}
}
