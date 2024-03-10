import java.util.Scanner;

public class Matrice6 {
	public static void printMatrix(int[][] matrix,int m,int n) {
		for(int i = 0;i < m;i++) {
			for(int j = 0;j<n;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void fillMatrix(int[][] matrix,int m,int n) {
		int sumOfIndex = 0;
		int el =0;
		while(el<m*n) {
			for(int i = 0;i < m;i++) {
				for(int j =0;j < n;j++) {
					if(i+j==sumOfIndex) {
						matrix[i][j] = el;
						el++;
					}
				}
			}
			sumOfIndex++;
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Dimenzije mxn:");
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] mat = new int[m][n];
		fillMatrix(mat,m,n);
		printMatrix(mat,m,n);
	sc.close();
	}
	
}
