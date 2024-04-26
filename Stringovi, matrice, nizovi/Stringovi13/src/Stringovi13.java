import java.util.Scanner;
//Cezarovo sifrovanje 1 smjer
public class Stringovi13 {
	public static String sifriraj(String txt,int key) {
		key = key % 26;
		String code = new String();
		for(int i = 0;i < txt.length();i++) {
			char ch = txt.charAt(i);
			char codedCh = (char)(ch+key);
			System.out.println(ch+" "+codedCh+"  "+(ch+key));
			if(Character.isLowerCase(codedCh) || codedCh > 'z')
					codedCh = (char)((ch-'a'+key)%26+'a');
			else
				if(codedCh > 'Z')
					codedCh = (char)((ch-'A'+key)%26+'A');
			code+=codedCh;
		}
		return code;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String:");
		String unos = sc.next();
		System.out.println("Kljuc:");
		int kljuc = sc.nextInt();
		System.out.println("Nakon sifriranja: "+sifriraj(unos,kljuc));
		sc.close();
	}
}
