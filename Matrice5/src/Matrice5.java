import java.util.Scanner;

public class Matrice5 {
	
	public static void printMatrix(int[][] matrix,int m,int n) {
		for(int i = 0; i < m;i++) {
			for(int j = 0; j < n; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
				
	}
	public static void zmijca(int[][] matrix,int m,int n) {
		int head = 1;
		for(int i = 0;i <= m-1;i++) {
			if (i % 2 == 0) {
				for(int j = 0;j<=n-1;j++) {
					matrix[i][j]=head;
					head++;
				}
			}
			else {
				for(int j = n-1; j>=0;j--) {
					matrix[i][j] = head;
					head++;
				}
			}
		}
		printMatrix(matrix,m,n);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzije matrice mxn: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		zmijca(mat,m,n);
		sc.close();
	}
}
