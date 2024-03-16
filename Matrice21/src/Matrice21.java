import java.util.Random;
import java.util.Scanner;
public class Matrice21 {
	public static void printMatrix(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[0].length;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void fillMatrix(int[][] matrix) {
		Random rnd = new Random();
		for(int i = 0;i < matrix.length;i++)
			for(int j =0;j < matrix[0].length;j++)
				matrix[i][j] = rnd.nextInt(2);
		printMatrix(matrix);
	}
	public static boolean isSingle(int[][] matrix,int i_,int j_) {
		for(int i = 0; i < matrix.length;i++)
			if(i != i_ && matrix[i][j_] == 1) return false;
		for(int j = 0; j < matrix[0].length;j++)
			if(j != j_ && matrix[i_][j] == 1) return false;
		return true;
	}
	public static void findSingles(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[0].length;j++)
				if(matrix[i][j] == 1 && isSingle(matrix,i,j)) System.out.println("("+i+","+j+")");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzije matrice");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		fillMatrix(mat);
		findSingles(mat);
		sc.close();
	}
}
