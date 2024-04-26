import java.util.Scanner;
public class Stringovi25 {
	public static boolean bContainsA(String txt1,String txt2) {
		int[] brojac=new int[26];
		for(int i = 0;i < txt1.length();i++)
			brojac[txt1.charAt(i)-'a']++;
		for(int i = 0;i < txt2.length();i++)
			if(brojac[txt2.charAt(i)-'a'] != 0) brojac[txt2.charAt(i)-'a']--;
		for(int i = 0;i < brojac.length;i++)
			if(brojac[i] != 0) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String str1 = sc.next();
		System.out.println("String 2:");
		String str2 = sc.next();
		if(bContainsA(str1,str2)) System.out.println("Sadrzi");
		else System.out.println("Ne sadrzi");
		sc.close();
	}
}
