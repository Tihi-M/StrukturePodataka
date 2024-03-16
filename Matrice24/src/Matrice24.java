import java.util.Scanner;
import java.util.Random;
public class Matrice24 {
	public static void printMatrix(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0; j < matrix[0].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	public static void fillMatrix(int[][] matrix) {
		Random rnd = new Random();
		for(int i =0;i < matrix.length;i++)
			for(int j = 0;j < matrix[0].length;j++)
				matrix[i][j] = rnd.nextInt(10);
		printMatrix(matrix);
	}
	
	public static void multiply(int[][] matrix1,int[][] matrix2) {
		int m = matrix1.length;
		int n = matrix2[0].length;
		int[][] proizvod = new int[m][n];
		for(int k = 0;k < m;k++)
			for(int i = 0;i < n;i++)
				for(int j =0;j < matrix2.length;j++)
					proizvod[k][i]+=matrix1[k][j]*matrix2[j][i];
		printMatrix(proizvod);
	}
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dimenzije matrice 1:");
			int m = sc.nextInt();
			int n = sc.nextInt();
			int[][] mat1= new int[m][n];
			System.out.println("Dimenzije matrice 1:");
			int p = sc.nextInt();
			int q = sc.nextInt();
			int[][] mat2 = new int[p][q];
			if(n != p) System.out.println("Matrice se ne mogu mnoziti.");
			else {
				fillMatrix(mat1);
				fillMatrix(mat2);
				multiply(mat1,mat2);
			}
			sc.close();
	}
}
