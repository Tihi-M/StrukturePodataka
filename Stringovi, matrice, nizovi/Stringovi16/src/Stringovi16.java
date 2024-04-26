import java.util.Scanner;
public class Stringovi16 {
	public static String sifruj(String message,String key) {
		String password = new String();
		message = message.toUpperCase();
		key = key.toUpperCase();
		for(int i = 0;i < message.length();i++) {
			char codedCh = message.charAt(i);
			if(Character.isLetter(codedCh))
				codedCh =(char)((message.charAt(i) + key.charAt(i))%26+'a');
				password+=codedCh;
		}
		return password;
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
		System.out.println("Poruka: ");
		String msg = sc.nextLine();
		System.out.println("Kljuc: ");
		String key = sc.nextLine();
		if (msg.length() > key.length()) key=expandKey(msg.length(),key);
		System.out.println("Sifra: " + sifruj(msg,key));
		sc.close();
	}
}
