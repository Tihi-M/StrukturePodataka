import java.util.Scanner;
public class Stringovi39 {
	public static void findNumVal(String coll) {
		int n=0;
		for(int i = 0;i < coll.length();i++) {
			char ch = coll.charAt(i);
			int chVal = ch-'A'+1;
			n = n*26+chVal;
		}
		System.out.println("Broj kolone: " + n);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Naziv kolone:");
		String str = sc.next();
		findNumVal(str);
		sc.close();
	}
}
