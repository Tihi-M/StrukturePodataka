import java.util.Scanner;
public class Stringovi3 {
	public static boolean isVowel(char c) {
		char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
		for(int i=0;i < vowels.length;i++)
			if(vowels[i] == c) return true;
		return false;
	}
	
	public static void addMiddleDash(String txt) {
		String txt2 = new String();
		for(int i = 0;i<txt.length()-1;i++)
			if(isVowel(txt.charAt(i)) && isVowel(txt.charAt(i+1))) {
				txt2 += Character.toString(txt.charAt(i));
				txt2 += "-";
			}
			else txt2 += Character.toString(txt.charAt(i));
		txt2+=Character.toString(txt.charAt(txt.length()-1));
		System.out.println(txt2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String");
		String txt = new String();
		txt = sc.next();
		addMiddleDash(txt);
		sc.close();
	}
}
