import java.util.Scanner;
public class Stringovi4 {
	public static void checkOddEvenChars(String txt) {
		String txt2 = new String();
		for(int i = 0;i<txt.length();i++)
			if(Character.isDigit(txt.charAt(i))){
				if((txt.charAt(i)-'0') % 2 == 0) {
					txt2+=Character.toString(txt.charAt(i));
					txt2+="P";
				}
				else {
					txt2+=Character.toString(txt.charAt(i));
					txt2+="N";
				}
			}
			else txt2+=Character.toString(txt.charAt(i));
		System.out.println(txt2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = new String();
		System.out.println("String:");
		text = sc.next();
		checkOddEvenChars(text);
		sc.close();
	}
}
