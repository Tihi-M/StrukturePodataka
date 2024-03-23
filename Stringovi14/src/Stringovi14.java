import java.util.Scanner;
//Cezarovo sifrovanje 2. nacin
public class Stringovi14 {
	public static String sifruj(String msg, int key) {
		key=key%26;
		String password = new String();
		for(int i =0; i < msg.length();i++) {
			char codedCh = msg.charAt(i);
			if(Character.isLetter(codedCh))
				if(Character.isUpperCase(codedCh))  
					codedCh = (char)((codedCh+key-'A')%26+'A');
				else codedCh = (char)((codedCh+key-'a')%26+'a');

			password+=codedCh;
		}
		return password;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String poruka = sc.nextLine();
		System.out.println("Kljuc: ");
		int kljuc = sc.nextInt();
		System.out.println("Sifra: "+sifruj(poruka,kljuc));
		sc.close();
	}
}
