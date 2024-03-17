import java.util.Scanner;
import java.util.Random;
//zamjena kolona
public class Matrice12 {
	public static void printMatrix(int[][] matrix,int n) {
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	public static void fillMatrix(int[][] matrix,int n) {
		Random rnd = new Random();
		for(int i = 0;i < n;i++)
			for(int j =0;j < n;j++)
				matrix[i][j] = rnd.nextInt(10);
		printMatrix(matrix,n);
	}
	
	public static void zamijeniKolone(int[][] matrix,int n,int r,int s) {
		for(int i = 0;i < n;i++) {
			int temp = matrix[i][r];
			matrix[i][r] = matrix[i][s];
			matrix[i][s] = temp;
		}
		printMatrix(matrix,n);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzija matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		System.out.println("R i S:");
		int r = sc.nextInt();
		int s = sc.nextInt();
		while (r > n && r<0 && s > n && s < 0) {
			System.out.println("Unijeti brojevi su van opsega matrice");
			r=sc.nextInt();
			s=sc.nextInt();
		}
		fillMatrix(mat,n);
		zamijeniKolone(mat,n,r,s);
		sc.close();
	}
}
