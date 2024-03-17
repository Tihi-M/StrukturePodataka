import java.util.Scanner;
public class Stringovi5 {
	public static void umetniCifre(String txt) {
		String txt2 = new String();
		for(int i = 0; i < txt.length();i++)
			if(Character.isDigit(txt.charAt(i))) {
				if(txt.charAt(i)-'0' > 0) {
					txt2+=Character.toString(txt.charAt(i));
					int digit = txt.charAt(i)-'0'- 1;
					
					txt2+=Character.toString(digit+'0');
				}
				else {
					txt2+=Character.toString(txt.charAt(i));
					txt2+=Character.toString('9');
				}
			}
			else txt2 += Character.toString(txt.charAt(i));
		System.out.println(txt2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String txt = sc.next();
		umetniCifre(txt);
	}
}
