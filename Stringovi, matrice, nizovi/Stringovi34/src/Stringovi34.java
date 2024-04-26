import java.util.Scanner;
public class Stringovi34 {
	public static String fromCamelToSnake(String str) {
		String snake = new String();
		for(int i = 0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				snake += '_';
				snake += Character.toLowerCase(ch);
			}
			else snake += ch;
		}
		return snake;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String txt = sc.next();
		txt = fromCamelToSnake(txt);
		System.out.println(txt);
		sc.close();
	}
}
