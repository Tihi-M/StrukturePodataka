import java.util.Scanner;
import java.util.Random;

public class Matrice1 {
	public static void fillMatrix(int[][] arr,int len) {
		Random rnd = new Random();
		for(int i = 0;i < len;i++)
			for(int j = 0; j < len;j++)
				arr[i][j] = rnd.nextInt(10);
	}
	
	public static void printMatrix(int[][] arr,int len) {
		for(int i = 0; i < len;i++) {
			for(int j = 0; j < len;j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void tragMatrice(int[][] matrix,int n) {
		int sum = 0;
		for(int i = 0;i < n;i++)
			for(int j = 0;j < n;j++)
				if(i == j) sum += matrix[i][j];
		System.out.println("Trag matrice: " + sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice:");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMatrix(mat,n);
		printMatrix(mat,n);
		tragMatrice(mat,n);
		sc.close();
	}
}
