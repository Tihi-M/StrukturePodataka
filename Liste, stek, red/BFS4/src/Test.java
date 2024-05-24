import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Test {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillMatrix(int matrix[][]) {
		for(int i =0;i < matrix.length;i++)
			for(int j = 0;j < matrix[0].length;j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static int collect(int map[][],int i_,int j_) {
		Queue<Polje> red = new LinkedList<>();
		red.add(new Polje(i_,j_));
		int collected = map[i_][j_];
		map[i_][j_]=0;
		
		int rows = map.length;
		int colls = map[0].length;
		
		int directionsX[] = {1,-1,0,0};
		int directionsY[] = {0,0,1,-1};
		
		while(!red.isEmpty()) {
			Polje top = red.poll();
			int row = top.x;
			int coll = top.y;
			
			for(int i = 0; i < directionsX.length;i++) {
				int x = row+directionsX[i];
				int y = coll+directionsY[i];
				if(x > -1 && x < rows && y > -1 && y < colls && map[x][y] > 0) {
					collected+=map[x][y];
					map[x][y] = 0;
					red.add(new Polje(x,y));
				}
				
			}
		}
		return collected;

	}
	
	public static int collectFish(int map[][],int rows,int colls) {
		int brRiba = 0;
		int max=0;
		
		for(int i = 0; i < rows;i++)
			for(int j = 0; j < colls;j++)
				if(map[i][j] > 0) {
					brRiba = collect(map,i,j);
					max = Math.max(max, brRiba);
					
				}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("m,n:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int	matr[][] = new int[m][n];
		fillMatrix(matr);
		System.out.println(collectFish(matr,m,n));
	}
}
