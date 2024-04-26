import java.util.Scanner;

public class Matrice28 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillMat(int[][] mat) {
		for(int i = 0;i < mat.length;i++)
			for(int j = 0;j<mat.length;j++)
				mat[i][j] = sc.nextInt();
	}
	
	public static boolean isMagic(int[][] mat) {
		int sumMainD = 0;
		int n = mat.length;
		for(int i = 0;i < n;i++)
			for(int j = 0; j < n;j++)
				if( i == j ) sumMainD+=mat[i][j];
		
		for(int i = 0; i < n;i++) {
			int sum = 0;
			for(int j = 0; j < n;j++)
				sum+=mat[i][j];
			if(sum != sumMainD) return false;
		}
		
		for(int i = 0; i < n;i++) {
			int sum = 0;
			for(int j = 0; j < n;j++)
				sum+=mat[j][i];
			if(sum != sumMainD) return false;
		}
		
		int sumSecondD =0;
		for(int i = 0; i < n;i++) 
			for(int j = 0; j < n;j++)
				if(i+j == n-1) sumSecondD+=mat[i][j];
		
		if(sumSecondD != sumMainD) return false;
		
		return true;
	
	}
	
	public static void main(String[] args) {
		System.out.println("Dimenizja matrice: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		fillMat(mat);
		if(isMagic(mat)) System.out.println("Da");
		else System.out.println("Ne");
		sc.close();
	}
}
