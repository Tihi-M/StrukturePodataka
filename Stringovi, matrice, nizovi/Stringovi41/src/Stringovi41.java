import java.util.Scanner;
public class Stringovi41 {
	
	public static boolean hasInvalidChar(String str,int k) {
		if(k == 1) {
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(i == 0 && ch == '.')return true;
				if(!Character.isLetter(ch) && !Character.isDigit(ch) &&
					ch!='.' && ch!='_' && ch!='-') return true;
			}
			return false;
		}
		else {
			boolean hasDot=false;
			for(int i = 0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch == '.') hasDot = true;
				if(!Character.isLetter(ch) && ch!='.') return true;
			}
			if(!hasDot) return true;
			return false;
		}
	}
	
	public static boolean validEmail(String em) {
		String[] splitEm = em.split("[@]");
		if(splitEm.length != 2) return false;
		String personalInfo = splitEm[0];
		String domen = splitEm[1];
		if(personalInfo.length()<3 || domen.length()<=3) return false;
		
		if(hasInvalidChar(personalInfo,1) || hasInvalidChar(domen,2))
			return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Email:");
		String str = sc.next();
		if(validEmail(str)) System.out.println("Validan");
		else System.out.println("Nije validan");
		sc.close();
	}
}
