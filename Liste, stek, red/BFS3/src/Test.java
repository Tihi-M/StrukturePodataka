import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void fillMatrix(int matrix[][]) {
	for(int i = 0; i < matrix.length;i++)
		for(int j = 0;j < matrix[0].length;j++)
			matrix[i][j] = sc.nextInt();
	}
	
	public static void izbrisiOstrvo(int map[][],int rows,int colls,int i_,int j_) {
		Queue<Polje> red = new LinkedList<>();
		red.add(new Polje(i_,j_));
		map[i_][j_] = 0;
		
		int directionsX[] = {1,-1,0,0};
		int directionsY[] = {0,0,1,-1};

		while(!red.isEmpty()) {
			Polje top = red.poll();
			int row = top.x;
			int coll = top.y;
			
			for(int i = 0; i < directionsX.length;i++) {
					int x = directionsX[i]+row;
					int y = directionsY[i]+coll;
					if(x > -1 && x < rows && y> -1 && y<colls && map[x][y]==1) {
						System.out.println("Updated");
						map[x][y]= 0;
						red.add(new Polje(x,y));
					}
					
				}
			
		}
		
	}
	
	public static int brOstrvaBFS(int map[][]) {
		int brOstrva = 0;
		int row = map.length;
		int coll = map[0].length;
		
		for(int i = 0; i < row;i++)
			for(int j= 0; j < coll;j++)
				if(map[i][j] == 1) {
					++brOstrva;
					izbrisiOstrvo(map,row,coll,i,j);
				}
		return brOstrva;
	}
	
	public static void main(String[] args) {
		System.out.println("m,n:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matr[][] = new int[m][n];
		fillMatrix(matr);
		System.out.println(brOstrvaBFS(matr));
	}
}
