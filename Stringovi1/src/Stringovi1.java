import java.util.Scanner;

public class Stringovi1 {
	public static void addUnderscores(String txt) {
		String txt2=new String();
		for(int i = 0;i<txt.length()-1;i++)
			if(Character.isUpperCase(txt.charAt(i)) && Character.isUpperCase(txt.charAt(i+1))) {
				txt2+=Character.toString(txt.charAt(i));
				txt2+="_";
			}
			else
				txt2+=Character.toString(txt.charAt(i));
		txt2+=Character.toString(txt.charAt(txt.length()-1));
		System.out.println(txt2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String text = new String();
		text = sc.next();
		addUnderscores(text);
		sc.close();
	}
}
