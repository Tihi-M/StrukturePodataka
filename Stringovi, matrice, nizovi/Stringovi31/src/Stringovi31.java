import java.util.Scanner;

public class Stringovi31 {
	public static boolean hasInvalidChar(String txt,int part) {
		for(int i = 0; i < txt.length();i++) {
			char ch = txt.charAt(i);
			if(Character.isLetter(ch) && Character.isUpperCase(ch)) return true;
			if(part == 0) {
				if(!Character.isLetter(ch) && !Character.isDigit(ch) &&
						ch != '_' && ch != '-' && ch != '.') return true;
				if(i != txt.length()-1 && ch == '.' && txt.charAt(i+1) == '.') return true;
			}
			else {
				if(!Character.isLetter(ch) && !Character.isDigit(ch) &&
						ch != '-' && ch != '.') return true;
				if(i != txt.length()-1 && ch == '.' && txt.charAt(i+1) == '.') return true;
				if(!Character.isLetter(txt.charAt(txt.length()-2)) ||
				   !Character.isLetter(txt.charAt(txt.length()-1))) return true;
			}
		}
		return false;
	}
	
	public static boolean invalidPref(String str) {
		boolean hasNum=false;
		boolean hasLetter=false;
		char first = str.charAt(0);
		char end = str.charAt(str.length()-1);
		for(int i = 0; i < str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				hasLetter = true;
				break;
			}
			if(Character.isDigit(str.charAt(i))) {
				hasNum = true;
				break;
			}
		}
		if(!hasNum && !hasLetter) return true;
		
		if(!(Character.isDigit(first) || Character.isLetter(first))
			&&!(Character.isDigit(end) || Character.isLetter(end))) return true;
		
		return false;
	}
	
	public static boolean isValid(String email) {
		String[] splited = email.split("[@]");
		if(splited.length != 2) return false;
		String prefiks = splited[0];
		String domen = splited[1];
		
		if(hasInvalidChar(prefiks,0)) return false;
		if(hasInvalidChar(domen,1)) return false;
		if(invalidPref(prefiks)) return false;
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Email:");
		String em = sc.next();
		if(isValid(em)) System.out.println("Validan");
		else System.out.println("Nije validan");
		sc.close();
	}
	
}