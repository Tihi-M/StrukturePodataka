import java.util.Scanner;
import java.util.Random;
public class Vjezba {
	public static void printMatrix(int[][] matrix) {
		for(int i = 0;i < matrix.length;i++) {
			for(int j = 0;j < matrix[0].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	public static void fillMatrix(int[][] matrix) {
		Random rnd = new Random();
		for(int i  = 0;i < matrix.length;i++) 
			for(int j  = 0;j < matrix[0].length;j++)
				matrix[i][j] = rnd.nextInt(10);
		
	}
	
	public static void changeDirection(int[] drc) {
		if(drc[0] == 0 && drc[1] == 1) {
			drc[0] = 1;
			drc[1] = 0;
			return;
		}
		if(drc[0] == 1 && drc[1] == 0) {
			drc[0] = 0;
			drc[1] = -1;
			return;
		}
		if(drc[0] == 0 && drc[1] == -1) {
			drc[0] = -1;
			drc[1] = 0;
			return;
		}
		if(drc[0] == -1 && drc[1] == 0) {
			drc[0] = 0;
			drc[1] = 1;
			return;
		}
	}
	
	public static void spiralnaMatrica(int[][] matrix) {
		int el = 1;
		int i =0;
		int j =0;
		int m = matrix.length;
		int n = matrix[0].length;
		int[] smjer= {0,1};
		while(el <= m*n) {
			matrix[i][j] = el;
			el++;
			int i_ =i+smjer[0];
			int j_ =j+smjer[1];
			if(i_ < 0 || i_ >= m || j_< 0 || j_ >= n || matrix[i_][j_] !=0) {
				changeDirection(smjer);
				i_=i+smjer[0];
				j_=j+smjer[1];
			}
			i = i_;
			j= j_;
		}
		printMatrix(matrix);
	}
	
	public static void pomnoziMatrice(int[][] matrix1,int[][] matrix2) {
		int m = matrix1.length;
		int n = matrix2[0].length;
		
		int[][] proizvod = new int[m][n];
		for(int k = 0; k < m;k++) 
			for(int i = 0;i < n;i++)
				for(int j = 0; j < matrix2.length;j++)
					proizvod[k][i] += matrix1[k][j]*matrix2[j][i];
		printMatrix(proizvod);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("m i n:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matr1 = new int[m][n];
		fillMatrix(matr1);
		printMatrix(matr1);
		System.out.println("p i q:");
		int p = sc.nextInt();
		int q = sc.nextInt();
		int[][] matr2 = new int[p][q];
		fillMatrix(matr2);
		printMatrix(matr2);
		//spiralnaMatrica(matr);
		pomnoziMatrice(matr1,matr2);
		sc.close();
	}
}
