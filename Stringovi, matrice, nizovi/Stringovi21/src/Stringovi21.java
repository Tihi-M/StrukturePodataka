import java.util.Scanner;
public class Stringovi21 {
	public static boolean suAnagrami(String txt1, String txt2) {
		int[] brojacSlova = new int[26];
		if(txt1.length()!=txt2.length()) return false;
		for(int i = 0;i < txt1.length();i++)
			brojacSlova[txt1.charAt(i)-'a']++;
		for(int i = 0;i < txt2.length();i++)
			brojacSlova[txt2.charAt(i)-'a']--;
		for(int i = 0;i < 26;i++)
			if(brojacSlova[i] != 0) return false;
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String str1 = sc.next();
		System.out.println("String 2:");
		String str2 = sc.next();
		if(suAnagrami(str1,str2)) System.out.println("Jesu anagrami");
		else System.out.println("Nisu anagrami");
		sc.close();
	}
}
