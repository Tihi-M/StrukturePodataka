import java.util.Scanner;
public class Stringovi17 {
	public static String desifruj(String password,String key) {
		String msg = new String();
		key = key.toUpperCase();
		password=password.toUpperCase();
		for(int i = 0;i < password.length();i++) {
			char decodedCh = password.charAt(i);
			System.out.println((password.charAt(i) - key.charAt(i)) + " " + (password.charAt(i) - key.charAt(i)%26));
			if(Character.isLetter(decodedCh))
					decodedCh =(char)((password.charAt(i) - key.charAt(i)+26)%26+'a');

				msg+=decodedCh;
		}
		return msg;
	}
	
	public static String expandKey(int len,String key) {
		int j = 0;
		String copy = key;
		key = "";
		for(int i = 0; i < len;i++) {
			key += copy.charAt(j);
			j++;
			if(j>=copy.length()) j = 0;
		}
		System.out.println(key);
		return key;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sifra: ");
		String password = sc.nextLine();
		System.out.println("Kljuc: ");
		String key = sc.nextLine();
		if (password.length() > key.length()) key=expandKey(password.length(),key);
		System.out.println("Poruka: " + desifruj(password,key));
		sc.close();
	}
}
