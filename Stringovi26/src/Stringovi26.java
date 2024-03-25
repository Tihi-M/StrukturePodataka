import java.util.Scanner;
public class Stringovi26 {
	public static boolean nijeBroj(String txt) {
		for(int i = 0; i< txt.length();i++)
			if(!Character.isDigit(txt.charAt(i))) return true;
		return false;
	}

	public static boolean isValid(String adress) {
		String[] partsOf = adress.split("[.]");
		if(partsOf.length != 4) return false;
		
		for(int i = 0; i < 4;i++) {
			if(partsOf[i].length() == 0) return false;
			if(partsOf[i].length() > 1 && partsOf[i].charAt(0) == '0') return false;
			if(nijeBroj(partsOf[i])) return false;
			int num = Integer.parseInt(partsOf[i]);
			if(num < 0 || num > 255) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ip adresa: ");
		String adresa = sc.next();
		if(isValid(adresa)) System.out.println("Validna");
		else System.out.println("Nije validna");
		sc.close();
	}
}
