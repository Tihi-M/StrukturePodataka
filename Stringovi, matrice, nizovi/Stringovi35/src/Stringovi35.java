import java.util.Scanner;
public class Stringovi35 {
	public static String snake_to_camel(String str) {
		String camel = new String();
		for(int i = 0;i < str.length();i++) {
			char ch = str.charAt(i);
			if(i+1<str.length() && ch == '_') {
				camel+=Character.toUpperCase(str.charAt(i+1));
				i++;
			}
			else if(ch != '_') camel+=ch;
		}
		return camel;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String txt = sc.next();
		txt = snake_to_camel(txt);
		System.out.println(txt);
		sc.close();
	}
}
