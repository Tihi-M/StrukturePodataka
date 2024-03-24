import java.util.Scanner;
public class Stringovi24 {
	public static void razlika(String txt1,String txt2) {
		int[] brojac = new int[26];
		String diff = new String();
		for(int i = 0;i < txt1.length();i++)
			brojac[txt1.charAt(i)-'a']++;
		for(int i = 0;i < txt2.length();i++)
			brojac[txt2.charAt(i)-'a']--;
		for(int i = 0; i < brojac.length;i++)
			if(brojac[i] < 0) brojac[i]*=-1;
		for(int i = 0;i < brojac.length;i++)
			if(brojac[i] != 0)
				for(int k = 0; k < brojac[i];k++) diff+=(char)(i+'a');
		System.out.println("Razlika: " + diff);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String str1 = sc.next();
		System.out.println("String 2:");
		String str2 = sc.next();
		razlika(str1,str2);
		sc.close();
	}
}
