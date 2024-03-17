import java.util.Scanner;
public class Stringovi7 {
	public static boolean isValidPassword(String password) {
		if(password.length()<8) return false;
		boolean hasUpper = false;
		boolean hasLower = false;
		for(int i = 0; i < password.length();i++)
			if(Character.isUpperCase(password.charAt(i))) { hasUpper = true; break;}
		if(!hasUpper) return false;
		
		for(int i = 0; i < password.length();i++)
			if(Character.isLowerCase(password.charAt(i))) { hasLower = true; break;}
		if(!hasLower) return false;
		
		char[] specChars = {'$','#','@'};
		boolean hasSpecChar = false;
		for(int i = 0; i < password.length();i++)
			for(int j = 0;j < specChars.length;j++)
				if(specChars[j] == password.charAt(i)) {
					hasSpecChar = true;
					break;
				}
		if(!hasSpecChar) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String");
		String text = sc.next();
		if(isValidPassword(text)) System.out.println("Password is good");
		else System.out.println("Password is too weak");
		sc.close();
	}
}
