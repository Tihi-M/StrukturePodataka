import java.util.Scanner;
public class Stringovi8 {
	public static void combine(String txt1,String txt2) {
		String txt3 = new String();
		for(int i = 0;i<txt1.length();i++) 
			txt3 += Character.toString(txt1.charAt(i))+Character.toString(txt2.charAt(i));
		System.out.println(txt3);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String text1 = sc.next();
		System.out.println("String 2:");
		String text2 = sc.next();
		combine(text1,text2);
		sc.close();
	}
}
