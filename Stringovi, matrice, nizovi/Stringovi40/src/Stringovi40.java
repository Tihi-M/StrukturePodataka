import java.util.Scanner;
public class Stringovi40 {
	public static int collToInt(String str) {
		int n = 0;
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			int val = ch-'A'+1;
			n = n*26+val;
		}
		return n;
	}
	
	public static int findCellNum(int x1,int y1,int x2,int y2) {
		if(x1 == x2 && y2 == y1)
			return 1;
		else if(x1 == x2)
			return y2-y1+1;
		else if(y1 == y2)
			return x2-x1+1;
		else return (x2-x1+1)*(y2-y1+1);
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vrsta 1 i kolona 1");
		int x1 = sc.nextInt();
		String y1=sc.next();
		int coll1 = collToInt(y1);
		System.out.println("Vrsta 2 i kolona 2");
		int x2 = sc.nextInt();
		String y2=sc.next();
		int coll2 = collToInt(y2);
	
		while(x2<x1 || coll2<coll1) {
			System.out.println("Vrsta 2 i kolona 2 ne smije biti manja");
			x2 = sc.nextInt();
			y2 = sc.next();
			coll2 = collToInt(y2);
		}
		
		int n = findCellNum(x1,coll1,x2,coll2);
		System.out.println("Broj celija: " + n);
		sc.close();
	}
}
