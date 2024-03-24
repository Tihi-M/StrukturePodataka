import java.util.Scanner;
public class Stringovi18 {
	public static boolean jePalindrom(String txt) {
		for(int i = 0;i < txt.length()/2;i++)
			if(txt.charAt(i) != txt.charAt(txt.length()-1-i))return false;
		return true;
	}
	
	public static String maxPalindrom(String txt) {
		String max = new String();
		for(int i = 0; i < txt.length();i++) {
			for(int j = 0; j<txt.length()-i;j++) {
				String temp = new String();
				for(int k = j; k<txt.length()-i;k++) 
					temp+=txt.charAt(k);
				if(jePalindrom(temp) && temp.length() > max.length())max = temp;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String txt = sc.next();
		System.out.println("Najveci palindrom: "+maxPalindrom(txt));
		sc.close();
	}
}
