import java.util.Random;
import java.util.Scanner;
public class Matrice13 {
	public static Scanner sc = new Scanner(System.in);
	public static void fillMatrix(int[][] matrix, int n) {
		for(int i = 0;i < n;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static boolean jeSimetricna(int[][] matrix,int n) {
		for(int i = 0;i < n;i++)
			for(int j = 0; j < n;j++)
				if(matrix[i][j] != matrix[j][i]) return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Dimenzija matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMatrix(mat,n);
		if(jeSimetricna(mat,n)) System.out.println("Simetricna je");
		else System.out.println("Nije simetricna");
		sc.close();
	}
}
