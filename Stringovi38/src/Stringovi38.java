import java.util.Scanner;
public class Stringovi38 {
	public static String reverse(String str) {
		String revStr = new String();
		for(int i = str.length()-1; i >= 0 ;i--)
			revStr+=str.charAt(i);
		return revStr;
	}
	
	public static void findColl(int num) {
		String coll = new String();
		while(num > 0) {
			if(num % 26 == 0) {
				coll+='Z';
				num = num / 26 - 1;
			}else {
				coll+=Character.toString((char)(num%26 - 1 + 'A'));
				num = num / 26;
			}
		}
		coll = reverse(coll);
		System.out.println(coll);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N:");
		int n = sc.nextInt();
		sc.close();
		findColl(n);
	}
}
