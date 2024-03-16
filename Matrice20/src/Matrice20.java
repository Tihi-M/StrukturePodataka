import java.util.Scanner;
import java.util.Random;
public class Matrice20 {
	public static void printMatrix(int[][] matrix) {
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0;j < matrix[0].length;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void fillMatrix(int[][] matrix,int m, int n) {
		Random rnd = new Random();
		for(int i = 0;i < m;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = rnd.nextInt(2);
		
		printMatrix(matrix);
	}
	
	public static boolean isConnected(int[][] matrix,int i_,int j_) {
		for(int i = 0;i < matrix.length;i++) 
				if(i != i_ && matrix[i][j_] == 1)return true;
		for(int j = 0;j < matrix[0].length;j++) 
			if(j != j_ && matrix[i_][j] == 1)return true;
		return false;
	}
	
	public static void findServer(int[][] matrix, int m,int n) {
		int count = 0;
		for(int i = 0;i < m;i++)
			for(int j = 0;j < n;j++)
				if(matrix[i][j] != 0 && isConnected(matrix,i,j)) count++;
		System.out.println("Broj servera:" + count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		fillMatrix(mat,m,n);
		findServer(mat,m,n);
		sc.close();
	}
}
