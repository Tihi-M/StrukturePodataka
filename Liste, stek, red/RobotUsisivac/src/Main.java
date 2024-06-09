import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Main {
public static Scanner sc = new Scanner(System.in);
	
public static int fillMatrix(int matrix[][]) {
	int n = 0;
	for(int i = 0; i < matrix.length;i++)
		for(int j=0;j <matrix[0].length;j++) {
			matrix[i][j] = sc.nextInt();
			if(matrix[i][j] == 3)
				n++;
		}
	return n;
}

public static void printMatrix(int matrix[][]) {
	for(int i = 0; i < matrix.length;i++) {
		for(int j = 0; j < matrix[0].length;j++)
			System.out.print(matrix[i][j] + " ");
		System.out.println();
	}
	System.out.println();
}

public static int bfs(int matrix[][],int i_,int j_,int cnt) {
	Queue<Polje> red = new LinkedList<>();
	int brKoraka = 0;
	
	matrix[i_][j_] = -1;
	red.add(new Polje(i_,j_));
	int directionsX[] = {1,-1,0,0};
	int directionsY[] = {0,0,1,-1};
	
	while(!red.isEmpty()) {
		Polje top = red.poll();
		int x = top.x;
		int y = top.y;
		
		for(int i = 0; i < 4;i++) {
			int x_ = x + directionsX[i];
			int y_ = y + directionsY[i];
			
			if(x_ > -1 && y_ > -1 && x_ < matrix.length && y_ < matrix[0].length && matrix[x_][y_] != -1) {
				if(matrix[x_][y_] == 0) {
					matrix[x_][y_] = -1;
					brKoraka++;
					red.add(new Polje(x_,y_));
					break;
				}
				else if(matrix[x_][y_] == 3) {
					cnt--;
					brKoraka++;
					matrix[x_][y_] = -1;
					red.add(new Polje(x_,y_));
					break;
				}
				if(cnt == 0)
					break;
				printMatrix(matrix);
				
			}
			if(cnt == 0)
				break;
		}
		
	}
	if(cnt != 0)
		return -1;
	return brKoraka;
	
	
}
	
public static int brojKoraka(int matrix[][],int cnt) {
	int brKoraka = 0;
	for(int i = 0; i < matrix.length;i++)
		for(int j = 0; j < matrix[0].length;j++)
			if(matrix[i][j] == 1){
				System.out.println("Broj polja: " + cnt);
				brKoraka = bfs(matrix,i,j,cnt);
			}
	
	return brKoraka;
}

	public static void main(String[] args) {
		System.out.println("Dimenzija matrice:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int matr[][] = new int[m][n];
		
		int nPolja = fillMatrix(matr);
		
		System.out.println("Broj koraka: " + brojKoraka(matr,nPolja));
		
	}
}
