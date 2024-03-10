import java.util.Scanner;
import java.util.Random;

public class Matrice7 {
		public static void fillMatrix(int[][] matrix,int n) {
			Random rnd = new Random();
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n;j++)
					matrix[i][j]=rnd.nextInt(10);
		}
		
		public static void printMatrix(int[][] matrix,int n) {
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < n;j++)
					System.out.print(matrix[i][j]+" ");
				System.out.println();
			}
			System.out.println();
		}
	
		public static void zbirMatrica(int[][] matrix1,int[][] matrix2, int n) {
			int[][] zbirM = new int[n][n];
			for(int i = 0; i < n;i++)
				for(int j =0; j < n;j++)
					zbirM[i][j] = matrix1[i][j]+matrix2[i][j];
			printMatrix(zbirM,n);
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Dimenzija matrice: ");
			int n = sc.nextInt();
			int[][] mat1 = new int[n][n];
			int[][] mat2 = new int[n][n];
			fillMatrix(mat1,n);
			fillMatrix(mat2,n);
			printMatrix(mat1,n);
			printMatrix(mat2,n);
			zbirMatrica(mat1,mat2,n);
			sc.close();
		}
		

}
