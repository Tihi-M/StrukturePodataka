import java.util.Scanner;
import java.util.Random;

public class Matrica2 {
	public static void fillMat(int[][] mat,int n) {
		Random rnd = new Random();
		for(int i = 0;i<n;i++)
			for(int j = 0;j < n;j++)
				mat[i][j]=rnd.nextInt(10);
	}
	
	public static void printMat(int[][] mat,int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0; j < n; j++) 
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void brojVojnika(int[][] mat, int n) {
		int sum =0;
		for(int i = 0;i<n;i++)
			for(int j = 0;j < n;j++)
				if((i == 0) || (j == 0) || (i == n-1) || (j == n-1 )) sum+=mat[i][j]; 
		System.out.println("Broj vojnika: "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija: ");
		int n = sc.nextInt();
		int[][] matrica = new int[n][n];
		fillMat(matrica,n);
		printMat(matrica,n);
		brojVojnika(matrica,n);
		sc.close();
	}
}
