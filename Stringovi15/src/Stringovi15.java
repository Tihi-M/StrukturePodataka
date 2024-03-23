import java.util.Scanner;
public class Stringovi15 {
	public static String desifruj(String password,int key) {
		key = key%26;
		String msg = new String();
		for(int i = 0;i < password.length();i++) {
			char decodedCh = password.charAt(i);
			if(Character.isLetter(decodedCh))
				if(Character.isUpperCase(decodedCh))
					decodedCh = (char)((decodedCh-'A'-key+26)%26+'A');
				else decodedCh = (char)((decodedCh-'a'-key+26)%26+'a');
			msg+=decodedCh;
		}
		return msg;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sifra: ");
		String sifra = sc.nextLine();
		System.out.println("Kljuc: ");
		int kljuc = sc.nextInt();
		System.out.println("Poruka: "+desifruj(sifra,kljuc));
		sc.close();
	}
}
