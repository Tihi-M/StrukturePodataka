import java.util.Scanner;
import java.math.*;
public class Matrice27 {
	public static Scanner sc = new Scanner(System.in);
	
	public static void takePoints(float[][] points) {
		for(int i = 0;i<points.length;i++)
			for(int j = 0;j < 2;j++)
				points[i][j] = sc.nextFloat();
	}

	public static boolean areOnSameLine(float[][] points) {
		float k = (points[1][1]-points[0][1])/(points[1][0]-points[0][0]);
		float n = points[0][1] - k*points[0][0]; 
		for(int i = 2;i < points.length;i++) {
			float y = k*points[i][0] + n;
			if(Math.abs(points[i][1] -y) > 0.0000001) return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Broj tacka:");
		int n = sc.nextInt();
		float[][] tacke = new float[n][2];
		takePoints(tacke);
		if(areOnSameLine(tacke)) System.out.println("Da");
		else System.out.println("Ne");
	}
}
