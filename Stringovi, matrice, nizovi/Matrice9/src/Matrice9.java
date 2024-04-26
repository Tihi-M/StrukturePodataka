import java.util.Scanner;
import java.util.Random;

public class Matrice9 {
	public static void printMatrix(int[][] matrix, int n) {
		for(int i =0; i < n;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(matrix[i][j]+" ");
				System.out.println();
		}
		System.out.println();
	}
	
	public static void fillMatrix(int[][] matrix,int n) {
		Random rnd = new Random();
		for(int i = 0; i < n;i++)
			for(int j = 0;j < n;j++)
				matrix[i][j] = rnd.nextInt(10);
		printMatrix(matrix,n);
	}
	
	public static void findSum(int[][] matrix,int n) {
		int sum = 0;
		for(int i =0;i < n;i=i+2) 
			for(int j = 1;j<n;j=j+2) {
				sum +=matrix[i][j];
				System.out.println(i+" "+j);
			}
		
		System.out.println("Zbir el sa parnim redom i neparnom kolonom: "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("dimenzija matrice: ");
		int n = sc.nextInt();
		sc.close();
		int[][] mat1= new int[n][n];
		fillMatrix(mat1,n);
		findSum(mat1,n);
	}
}
