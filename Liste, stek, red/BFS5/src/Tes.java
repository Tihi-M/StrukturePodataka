import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Tes {
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillMatrix(int matrix[][]) {
		for(int i =0 ;i < matrix.length;i++)
			for(int j = 0; j < matrix[0].length; j++)
				matrix[i][j] = sc.nextInt();
	}
	
	public static int followPath(int map[][],int i_,int j_) {
		Queue<Polje> red = new LinkedList<>();
		red.add(new Polje(i_,j_,1));
		
		int directionsX[] = {1,-1,0,0,1,1,-1,-1};
		int directionsY[] = {0,0,1,-1,1,-1,-1,1};
		
		int rows = map.length;
		int colls = map[0].length;
		
		while(!red.isEmpty()) {
			Polje top = red.poll();
			int row = top.x;
			int coll = top.y;
			
			for(int i =0 ; i < directionsX.length;i++) {
				int x = row + directionsX[i];
				int y = coll + directionsY[i];
				if(x >-1 && x < rows && y>-1 && y<colls && map[x][y]==0) {
					map[x][y] = 1;
					if(x == rows-1 && y == colls-1)
						return top.count+1;
					red.add(new Polje(x,y,top.count+1));
				}
			}
			
		}
		return -1;
		
	}
	
	public static int shortestPath(int map[][],int rows,int colls) {
		int putanja = 0;
		int min = 10000;
		
		for(int i = 0; i < rows;i++)
			for(int j =0; j < colls;j++)
				if(map[i][j] == 0) {
					putanja = followPath(map,i,j);
					min = Math.min(putanja, min);
				}
		return min;		
	}
	
	public static void main(String[] args) {
		System.out.println("m,n:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int matr[][] = new int[m][n];
		fillMatrix(matr);
		System.out.println(shortestPath(matr,m,n)); 
		
	}
}
