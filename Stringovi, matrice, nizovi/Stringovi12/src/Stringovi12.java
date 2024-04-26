import java.util.Scanner;
//s1, s2 ... sn bitni kod razlicitih k bitnih nizova tako da se s1 i s2 razlikuju u jednom bitu
public class Stringovi12 {
	public static String transform(String txt) {
		String newTxt= new String();
		int i = 0;
		while(i < txt.length() && txt.charAt(i) == '#') {
			i++;
		}
		while(i < txt.length()-1) {
			if(txt.charAt(i+1) != '#') 
				newTxt+=Character.toString(txt.charAt(i));
			else i++;
			i++;
		}
		if(txt.charAt(txt.length()-1) != '#')
			newTxt+=txt.charAt(txt.length()-1);
		return newTxt;
	}
	public static boolean areEqual(String text1,String text2) {
		text1 = transform(text1);
		text2 = transform(text2);
		System.out.println(text1 + " " + text2);
		if(text1.length() != text2.length()) return false;
		for(int i = 0;i < text1.length();i++)
			if(text1.charAt(i) != text2.charAt(i)) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1: ");
		String txt1 = sc.next();
		System.out.println("String 2: ");
		String txt2 = sc.next();
		
		if(areEqual(txt1,txt2)) System.out.println("Da");
		else System.out.println("Ne");
		sc.close();
	}
}
