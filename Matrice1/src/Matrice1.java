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
	
	public static void zbirElemenata(int[][] matrix, int n) {
		int sum = 0;
		for(int i = 0; i < n;i++)
			for(int j = 0;j < n;j++)
				sum+=matrix[i][j];
		System.out.println("Zbir elemenata: "+ sum);
	}
	
	public static void zbirIznad(int[][] matrix,int n) {
		int sum=0;
		for(int i = 0;i < n;i++)
			for(int j = 0;j < n;j++)
				if(j > i) sum+=matrix[i][j];
		System.out.println("Zbir elemenata iznad g.d: "+sum);
	}
	
	public static void zbirIspod(int[][] matrix,int n) {
		int sum=0;
		for(int i = 0;i < n;i++)
			for(int j = 0;j < n;j++)
				if(i > j) sum+=matrix[i][j];
		System.out.println("Zbir elemenata ispod g.d: "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice:");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMatrix(mat,n);
		printMatrix(mat,n);
		zbirElemenata(mat,n);
		tragMatrice(mat,n);
		zbirIznad(mat,n);
		zbirIspod(mat,n);
		sc.close();
	}
}
