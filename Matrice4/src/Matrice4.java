import java.util.Scanner;
import java.util.Random;

public class Matrice4 {
	public static Scanner sc = new Scanner(System.in);

	public static void fillMat(int[][] matrix,int n) {
		for(int i = 0;i < n;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static void printMat(int[][] matrix, int n) {
		for(int i = 0; i < n;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean jeSimetricna(int[][] matrix,int n) {
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n; j++) {
				if(matrix[i][j] != matrix[j][i]) return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Dimenzija matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMat(mat,n);
		if(jeSimetricna(mat,n)) System.out.println("Simetricna");
		else System.out.println("Nije simetricna");
		sc.close();
	}
}
