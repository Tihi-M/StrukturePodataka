import java.util.Scanner;
import java.util.Random;

public class Matrice10 {
	public static void printMatrix(int[][] mat,int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void fillMatrix(int[][] mat,int n) {
		Random rnd = new Random();
		for(int i = 0; i < n;i++)
			for(int j = 0;j < n;j++)
				mat[i][j] = rnd.nextInt(10);
	
		printMatrix(mat,n);
	}
	
	public static void lokalniMin(int[][] mat,int n) {
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < n;j++) {
				boolean min = true;
				if(i - 1 >= 0 && mat[i][j] > mat[i-1][j]) min = false;
				if(i + 1 < n && mat[i][j] > mat[i+1][j]) min = false;
				if(j - 1 >= 0 && mat[i][j] > mat[i][j-1]) min = false;
				if(j + 1 < n && mat[i][j] > mat[i][j+1]) min = false;
				if(min) System.out.println("("+i+","+j+") " + mat[i][j]);			}
			
		}
				
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzije: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMatrix(mat,n);
		lokalniMin(mat,n);
	}
}
