import java.util.Random;
//Toplics matric
import java.util.Scanner;
public class Matrice14 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillMatrix(int[][] matrix,int m, int n) {
		for(int i = 0; i < m; i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static boolean jeToplicova(int[][] matrix,int m,int n) {
		for(int k = 0; k < n;k++)
			for(int i = 0; i<m-1;i++)
				for(int j = k;j < n-1;j++)
					if(matrix[i][j] != matrix[i+1][j+1]) return false;
		return true;
		
	}
	/*
	 * 0,0 0,1 0,2 0,3
	 * 1,0 1,1 1,2 1,3
	 * 2,0 2,1 2,2 2,3
	 * 3,0 3,1 3,2 3,3
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Dimenzije matrice: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		fillMatrix(mat,m,n);
		if(jeToplicova(mat,m,n)) System.out.println("jeste");
		else System.out.println("Nije");
	}
}
