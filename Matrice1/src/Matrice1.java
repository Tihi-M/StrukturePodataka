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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice:");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMatrix(mat,n);
		printMatrix(mat,n);
		tragMatrice(mat,n);
	}
}
