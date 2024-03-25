import java.util.Scanner;
public class Stringovi30 {
	public static String reverse(String txt) {
		String reverse = new String();
		for(int i = txt.length()-1;i >= 0; i--)
			reverse += txt.charAt(i);
		return reverse;
	}
	
	public static String reverseWords(String str) {
		String[] word = str.split("[ ]");
		String newTxt = new String();
		for(int i = 0;i < word.length;i++) {
			newTxt+= reverse(word[i]);
			newTxt+=" ";
		}
		return newTxt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Recenica: ");
		String txt = sc.nextLine();
		txt = reverseWords(txt);
		System.out.println("Nakon poziva funkcije: ");
		System.out.println(txt);
		sc.close();
	}
}
