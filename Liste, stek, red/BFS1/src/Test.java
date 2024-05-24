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
	
	public static int findArea(int[][] map,int i_,int j_) {
		int directions[][] = {{1,0},{1,-1},{1,1},{0,-1},{0,1},{-1,0},{-1,-1},{-1,1}};
		int area = 0;
		if(0 <= i_ && i_ < map.length && 0<=j_ && j_<map[0].length && map[i_][j_]==1) {
			map[i_][j_] = 0;
			area=1;

			for(int i = 0;i < directions.length;i++) {
				for(int j = 0;j < directions[0].length;j++) {
					area += findArea(map,i+i_,j+j_);
				}
			}
		}
		
		return area;
	}
		
	public static int biggestLake(int map[][]) {
		int maxArea=0;
		
		for(int i = 0; i< map.length;i++) {
			for(int j = 0; j< map[0].length;j++) {
				int area = findArea(map,i,j);
				maxArea = Math.max(maxArea, area);
			}
		}
		
		return maxArea;
	}
	
	public static void main(String[] args) {
		System.out.println("m, n:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int matr[][] = new int[m][n];
		fillMatrix(matr);
		System.out.println(biggestLake(matr));
	}
}
