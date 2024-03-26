import java.util.Scanner;
public class Stringovi31 {
	public static boolean hasInvalidChars(String str) {
		str+=' ';
		for(int i = 0;i < str.length();i++) {
			if(i == str.length()-1) break;
			char ch = str.charAt(i);
			if(Character.isLetter(ch) && Character.isUpperCase(ch)) {System.out.println("!"); return true;}
			if(!Character.isDigit(ch) && !Character.isLetter(ch) && ch!='_' &&  ch!='-' && ch != '.') {System.out.println("?"+i); return true;}
			if(ch=='.' && str.charAt(i+1) == '.') {System.out.println("$"); return true;}
		}
		return false;
	}
	
	public static boolean hasLetterOrNum(String str) {
		boolean hasLetter= false;
		boolean hasDigit = false;
		for(int i = 0;i < str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isLetter(ch)) hasLetter = true;
			if(Character.isDigit(ch)) hasDigit = true;
			if(hasLetter && hasDigit) return true;
		}
		
		return false;
	}
	
	public static boolean validEmail(String email) {
		String[] partsOf = email.split("[@]");
		if(partsOf.length!=2) return false;
		String prefiks = partsOf[0];
		String domen = partsOf[1];
		
		if(hasInvalidChars(prefiks)) return false;
		if(!hasLetterOrNum(prefiks)) return false;
		char chFirst = prefiks.charAt(0);
		char chEnd = prefiks.charAt(prefiks.length()-1);
		System.out.println(chFirst+ " "+chEnd);
		if((Character.isLetter(chFirst) || Character.isDigit(chFirst)) &&
		   (Character.isLetter(chEnd) || Character.isDigit(chEnd))) {System.out.println("??");  return false;}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Email:");
		String em = sc.next();
		if(validEmail(em)) System.out.println("Validan");
		else System.out.println("Nije validan");
		sc.close();
	}
}
