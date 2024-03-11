import java.util.Scanner;
import java.util.Random;
public class Matrice11 {
	public static void printMatrix(int[][] matrix,int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(matrix[i][j] +" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void fillMatrix(int[][] matrix,int n) {
		Random rnd = new Random();
		for(int i =0;i < n;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j]= rnd.nextInt(10);
		printMatrix(matrix,n);
	}
	
	public static void lokalniMaximumi(int[][] matrix,int n) {
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++) {
				boolean max = true;
				if(i-1>=0 && matrix[i][j] < matrix[i-1][j]) max = false;
				if(i+1<n && matrix[i][j] < matrix[i+1][j]) max = false; 
				if(j-1>=0 && matrix[i][j] < matrix[i][j-1]) max = false;
				if(j+1<n && matrix[i][j] < matrix[i][j+1]) max = false;
				if(max) System.out.println("("+i+","+j+") "+matrix[i][j]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMatrix(mat,n);
		lokalniMaximumi(mat,n);
		sc.close();
	}
}
