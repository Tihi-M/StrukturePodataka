import java.util.Scanner;
public class Stringovi2 {
	public static void addLowercaseLetter(String txt) {
		String txt2 = new String();
		for(int i = 0;i < txt.length();i++)
			if(Character.isUpperCase(txt.charAt(i))) {
				txt2+=Character.toString(txt.charAt(i));
				txt2+=(Character.toString(txt.charAt(i))).toLowerCase();
			}
			else txt2+=Character.toString(txt.charAt(i));
		System.out.println(txt2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String text = new String();
		text = sc.next();
		addLowercaseLetter(text);
		sc.close();
	}
}
