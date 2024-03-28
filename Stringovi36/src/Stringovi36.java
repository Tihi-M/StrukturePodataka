import java.util.Scanner;
public class Stringovi36 {
	public static boolean aInB(String strA,String strB) {
		int[] brojac = new int[26];
		for(int i = 0; i < strB.length();i++)
			brojac[strB.charAt(i)-'a']++;
		for(int i = 0;i < strA.length();i++)
			if(brojac[strA.charAt(i)-'a'] != 0) brojac[strA.charAt(i)-'a']--;
		for(int i = 0;i < brojac.length;i++)
			if(brojac[i]!=0) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String A");
		String str1 = sc.next();
		System.out.println("String B");
		String str2 = sc.next();
		if(aInB(str1,str2)) System.out.println("Da");
		else System.out.println("ne");
		sc.close();
	}
}
