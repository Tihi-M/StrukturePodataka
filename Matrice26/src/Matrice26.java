import java.util.Scanner;
import java.math.*;
public class Matrice26 {
	public static Scanner sc = new Scanner(System.in);
	public static void takePoints(float[][] points) {
		for(int i = 0;i < points.length;i++)
			for(int j = 0; j<points[0].length;j++)
				points[i][j] = sc.nextFloat();
	}
	public static boolean validTriangle(float a, float b, float c) {
		if(a+b>c && a+c>b && b+c>a) return true;
		return false;
	}
	
	public static float findLen(float x1,float y1,float x2,float y2) {
		float len =(float)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return len;
	}
	
	public static float findArea(float a,float b,float c) {
		float s = (a+b+c)/2;
		float area = (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
	
	public static void findMaxArea(float[][] points) {
		float maxArea = -1;
		for(int i = 0;i < points.length-2;i++) 
			for(int j = i+1; j < points.length-1;j++) 
				for(int k = j+1;k < points.length;k++) {
					float A = findLen(points[i][0],points[i][1],points[j][0],points[j][1]);
					float B = findLen(points[i][0],points[i][1],points[k][0],points[k][1]);
					float C = findLen(points[j][0],points[j][1],points[k][0],points[k][1]);
					System.out.println(A + " "+B+" "+C);
					float tempArea = 0;
					if(validTriangle(A,B,C)) tempArea=findArea(A,B,C);
					System.out.println(tempArea);
					if(tempArea>maxArea) { 
						System.out.println(points[i][0]+" "+points[i][1]);
						System.out.println(points[j][0]+" "+points[j][1]);
						System.out.println(points[k][0]+" "+points[k][1]);
						
						maxArea=tempArea;
					}
				}
		System.out.println("Najveci trougao: "+maxArea);
	}
	public static void main(String[] args) {
		System.out.println("Broj tacaka:");
		int n = sc.nextInt();
		float[][] tacke = new float[n][2];
		takePoints(tacke);
		findMaxArea(tacke);
		sc.close();
	}
}
