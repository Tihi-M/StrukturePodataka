import java.util.Scanner;
//Suglasnici pa samoglasnici
public class Stringovi6 {
	public static boolean jeSamoglasnik(char c) {
		char[] samoglasnici = {'a','e','i','o','u','A','E','I','O','U'};
		for(int i = 0;i < samoglasnici.length;i++)
			if(c == samoglasnici[i]) return true;
		return false;
	}
	
	public static void premjestiSuglasnike(String txt) {
		String suglasnici=new String();
		String samoglasnici = new String();
		for(int i = 0; i < txt.length();i++)
			if(jeSamoglasnik(txt.charAt(i)))
				samoglasnici += Character.toString(txt.charAt(i));
			else suglasnici += Character.toString(txt.charAt(i));
		System.out.println(suglasnici+samoglasnici);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String text = sc.next();
		premjestiSuglasnike(text);
		sc.close();
	}
}
