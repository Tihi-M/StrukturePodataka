import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Test {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillMatrix(int matrix[][]) {
		for(int i = 0; i < matrix.length;i++)
			for(int j = 0;j < matrix[0].length;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static int obimOstrva(int map[][]) {
		int row = map.length;
		int coll = map[0].length;
		int obim = 0;
		for(int i =0 ; i < row;i++)
			for(int j =0; j < coll;j++)
				if(map[i][j] == 1) {
					obim+=4;
					if(i > 0 && map[i-1][j] == 1)
						obim-=2;
					if(j > 0 && map[i][j-1] == 1)
						obim-=2;
				}
		return obim;
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("m,n:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matr[][] = new int[m][n];
		fillMatrix(matr);
		System.out.println(obimOstrva(matr));
	}
}
