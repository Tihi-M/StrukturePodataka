import java.util.Scanner;

public class Matrice18 {
	
	public static void promjeniSmjer(int[] smjer) {
		if(smjer[0] == 0 && smjer[1] == 1) {
			smjer[0] = 1;
			smjer[1] = 0;
			return;
		}
		if(smjer[0] == 1 && smjer[1] == 0) {
			smjer[0] = 0;
			smjer[1] = -1;
			return;
		}
		if(smjer[0] == 0 && smjer[1] == -1) {
			smjer[0] = -1;
			smjer[1] = 0;
			return;
		}
		if(smjer[0] == -1 && smjer[1] == 0) {
			smjer[0] = 0;
			smjer[1] = 1;
			return;
		}
	}
	
	public static void printMatrix(int[][] matrix,int m, int n) {
		for(int i=0;i < m;i++) {
			for(int j = 0;j < n;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void spiralnaMatrica(int[][] matrix,int m, int n) {
		int el = 1;
		int i = 0;
		int j = 0;	
		int[] smjer = {0,1};
		while(el <= m*n) {
			matrix[i][j] = el;
			el++;
			int i_ = i+smjer[0];
			int j_ = j+smjer[1];
			if(i_ < 0 || j_ < 0 || i_>=m || j_>=n || matrix[i_][j_] != 0) {
				promjeniSmjer(smjer);
				i_=i+smjer[0];
				j_=j+smjer[1];
			}
			i=i_;
			j=j_;
		}
		printMatrix(matrix,m,n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzije matrice:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		spiralnaMatrica(mat,m,n);
		sc.close();
	}

}
