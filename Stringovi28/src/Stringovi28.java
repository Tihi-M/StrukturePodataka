import java.util.Scanner;
public class Stringovi28 {
	public static int findLastIndex(String str, String str1) {
		for(int i = 0;i < str.length();i++) {
			boolean foundSub = true;
			int ind = 0;;
			for(int j = 0; j<str1.length();j++) {
					if(str.charAt(i+j) != str1.charAt(j)) {
						foundSub = false;
						break;
					}
					ind++;
				}
				ind +=i;
				if(foundSub) return ind;
			}
		return 0;
		
	}
	public static String zamijeni(String str,String str1,String str2) {
		int endOfStr1 = findLastIndex(str,str1);
		String part1 = str.substring(0,endOfStr1-str1.length());
		String part2 = str.substring(endOfStr1,str.length());
		String newStr = part1+str2+part2;
		return newStr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("S:");
		String s = sc.next();
		System.out.println("S1:");
		String s1 = sc.next();
		System.out.println("S2:");
		String s2 = sc.next();
		s = zamijeni(s,s1,s2);
		System.out.println("Nakon zamjene: " + s);
		sc.close();
	}
}
