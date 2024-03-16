import java.util.Scanner;

public class Matrice23 {
	public static Scanner sc = new Scanner(System.in);
	public static void fillMatrix(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++)
			for(int j = 0;j < matrix[0].length;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static int filterCoveredMatrix(int[][] matrix,int i_,int j_,int k) {
		int sum = 0;
		for(int i = i_;i <i_+k;i++)
			for(int j = j_;j < j_+k;j++)
				sum += matrix[i][j];
		return sum;
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[0].length;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void filterMatrix(int[][] picture,int k) {
		int newM = picture.length-k + 1;
		int newN = picture[0].length-k + 1;
		int [][] newPic = new int[newM][newN];
		int i_=0;
		int j_=0;
		for(int i = 0;i <= picture.length-newM;i++) {
			for(int j = 0;j <= picture[0].length-newN;j++) {
				int el = filterCoveredMatrix(picture,i,j,k);
				newPic[i_][j_] = el/(k*k);
				j_++;
			}
			i_++;
			j_=0;
		}
		printMatrix(newPic);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzije matrice:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		System.out.println("Dimenzije filtera:");
		int k = sc.nextInt();
		fillMatrix(mat);
		filterMatrix(mat,k);
		sc.close();
	}
}
