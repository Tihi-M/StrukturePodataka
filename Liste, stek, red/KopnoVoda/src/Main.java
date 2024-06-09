import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void fillMatrix(int matrix[][]) {
		for(int i = 0; i < matrix.length;i++)
			for(int j=0;j <matrix[0].length;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static void printMatrix(int matrix[][]) {
		for(int i = 0; i < matrix.length;i++) {
			for(int j = 0; j < matrix[0].length;j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	public static int[][] more(int matrix[][]) {
		Queue<Polje> red = new LinkedList<>();
		
		int directionsX[] = {1,-1,0,0};
		int directionsY[] = {0,0,1,-1};
	
		int matrix2[][] = new int[matrix.length][matrix[0].length];
		
		for(int i = 0; i < matrix.length;i++)
			for(int j = 0; j < matrix[0].length; j++)
				if(matrix[i][j] == 1) {
					matrix2[i][j] = 0;
					red.add(new Polje(i,j));
				}
				else matrix2[i][j] = Integer.MAX_VALUE;
		
		while(!red.isEmpty()) {
			Polje top  =red.poll();
			int x = top.x;
			int y = top.y;
			
			for(int i = 0; i < directionsX.length;i++) {
				int x_ = x + directionsX[i];
				int y_ = y + directionsY[i];
				
				if(x_ > -1 && x_ < matrix2.length && y_ > -1 && y_ < matrix2[0].length
						&& matrix2[x_][y_] > matrix2[x][y]+1) {
					matrix2[x_][y_]= matrix2[x][y] + 1;
					red.add(new Polje(x_,y_));
				}
			}
		}
		return matrix2;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Dimenzije matrice:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int matr[][] = new int[m][n];
		
		fillMatrix(matr);
		
		matr = more(matr);
		
		printMatrix(matr);
		
	}
}
