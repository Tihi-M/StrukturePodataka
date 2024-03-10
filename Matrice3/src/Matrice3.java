import java.util.Scanner;
import java.util.Random;

public class Matrice3 {
	public static void fillMatrix(int[][] mat, int m, int n) {
		Random rnd = new Random();
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				mat[i][j] = rnd.nextInt(10);
	}
	
	public static void printMatrix(int[][] mat,int m, int n) {
		for(int i =0;i < m;i++) {
			for(int j = 0; j < n; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}
	
	public static int checkCorner(int m,int n,int x,int y) {
		if(x == 0) {
			if( y == 0) return 1;
			else if (y == n-1) return 2;
			else return -1;
		}
		else if(x == m-1) {
			if( y == 0) return 3;
			else if (y == n-1) return 4;
			else return -2;
		}
		else if( y == 0) return -3;
		else if ( y == n-1) return -4;
		else return 0;
		//1,2,3,4 = corners;
		//-1,-2,-3,-4 = border;
		// 0 = in matrix;
	}
	
	public static void susjedi(int[][] mat,int m,int n, int x,int y) {		
		int findPos= checkCorner(m,n,x,y);
		switch(findPos) {
		case 1:
			System.out.println("("+0+","+1+")"+ " " + mat[0][1]);
			System.out.println("("+1+","+0+")"+ " " + mat[1][0]);
			break;
		case 2:
			System.out.println("("+0+","+(n-2)+")"+ " " + mat[0][n-2]);
			System.out.println("("+1+","+(n-1)+")"+ " " + mat[1][n-1]);
			break;
		case 3:
			System.out.println("("+(m-2)+","+0+")"+ " " + mat[m-2][0]);
			System.out.println("("+(m-1)+","+1+")"+ " " + mat[m-1][1]);
			break;
		case 4:
			System.out.println("("+(m-2)+","+(n-1)+")" + " " + mat[m-2][n-1]);
			System.out.println("("+(m-1)+","+(n-2)+")" + " " + mat[m-1][n-2]);
			break;
		case -1:
			System.out.println("("+0+","+(y-1)+")"+ " " + mat[0][y-1]);
			System.out.println("("+0+","+(y+1)+")"+ " " + mat[0][y+1]);
			System.out.println("("+(x+1)+","+y+")"+ " " + mat[x+1][y]);
			break;
		case -2:
			System.out.println("("+x+","+(y-1)+")"+ " " + mat[x][y-1]);
			System.out.println("("+x+","+(y+1)+")"+ " " + mat[x][y+1]);
			System.out.println("("+(x-1)+","+y+")"+ " " + mat[x-1][y]);
			break;
		case -3:
			System.out.println("("+(x-1)+","+0+")"+ " " + mat[x-1][0]);
			System.out.println("("+x+","+(y+1)+")"+ " " + mat[x][y+1]);
			System.out.println("("+(x+1)+","+0+")"+ " " + mat[x+1][0]);
			break;
		case -4:
			System.out.println("("+(x-1)+","+(n-1)+")"+ " " + mat[x-1][n-1]);
			System.out.println("("+x+","+(y-1)+")"+ " " + mat[x][y-1]);
			System.out.println("("+(x+1)+","+(n-1)+")"+ " " + mat[x+1][n-1]);
			break;
		case 0:
			System.out.println("("+x+","+(y-1)+")"+ " " + mat[x][y-1]);
			System.out.println("("+(x-1)+","+y+")"+ " " + mat[x-1][y]);
			System.out.println("("+x+","+(y+1)+")"+ " " + mat[x][y+1]);
			System.out.println("("+(x+1)+","+y+")"+ " " + mat[x+1][y]);
			break;
		default: System.out.println("error");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dimenzije mxn: (indeksi pocinju nulom)");
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("Koordinate polja: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		while((x < 0) ||( y < 0) || (x > m) || (y > n)) {
			System.out.println("x mora biti od 0 do " + (m-1));
			System.out.println("y mora biti od 0 do " + (n-1));
			x = sc.nextInt();
			y = sc.nextInt();
		}
		int[][] mat = new int[m][n];
		fillMatrix(mat,m,n);
		printMatrix(mat,m,n);
		susjedi(mat,m,n,x,y);
		sc.close();
	}
}
