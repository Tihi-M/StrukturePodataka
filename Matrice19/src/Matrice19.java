import java.util.Scanner;
import java.util.Random;

public class Matrice19 {
	public static Scanner sc = new Scanner(System.in);
	public static void fillMatrix(int[][] matrix,int m,int n) {
		for(int i = 0;i < m;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static boolean isMinMax(int[][] matrix,int i_,int j_) {
		for(int i = 0;i <matrix.length;i++) {
				if(i_ != i)
					if(matrix[i][j_] > matrix[i_][j_]) return false;
		}
		for(int j = 0;j<matrix[0].length;j++) {
			if(j_ != j)
				if(matrix[i_][j] < matrix[i_][j_]) return false;
		}
		return true;
	}
	/*
	 * 00 01 02
	 * 10 11 12
	 * 20 21 22
	 */
	public static void findMinMax(int[][] matrix,int m,int n) {
		for(int i = 0;i < m;i++)
			for(int j = 0;j < n;j++) {
				if(isMinMax(matrix,i,j)) {
					System.out.println("("+i+","+j+")"+matrix[i][j]);
					return;
				}
			}
	}
	public static void main(String[] args) {
		System.out.println("Dimenzije matrice:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		fillMatrix(mat,m,n);
		findMinMax(mat,m,n);
		sc.close();
	}
}
