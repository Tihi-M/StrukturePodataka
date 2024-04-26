import java.util.Scanner;
public class Stringovi22 {
	public static String unija(String txt1,String txt2) {
		String union = new String();
		for(int i = 0;i<txt1.length();i++) { 
			boolean notFound = true;
			for(int k = 0; k < union.length();k++)
				if(union.charAt(k) == txt1.charAt(i)) notFound = false;
			if(notFound) union += txt1.charAt(i);
		}
		for(int i = 0;i<txt2.length();i++) { 
			boolean notFound = true;
			for(int k = 0; k < union.length();k++)
				if(union.charAt(k) == txt2.charAt(i)) notFound = false;
			if(notFound) union += txt2.charAt(i);
		}
		
		return union;
	}

	public static String presjek(String txt1,String txt2) {
		String presjek = new String();
		String foundLetters = "";
		if(txt1.length()>txt2.length()) {
			for(int i = 0;i < txt1.length();i++) 
				for(int j = 0; j < txt2.length();j++) {
					boolean notFound = true;
						for(int k = 0; k<foundLetters.length();k++)
							if(foundLetters.charAt(k) == txt1.charAt(i)) notFound = false;
					if(notFound && txt1.charAt(i) == txt2.charAt(j)) {foundLetters += txt1.charAt(i); presjek += txt1.charAt(i);}
			}
		}
		else {
			for(int i = 0;i < txt2.length();i++) 
				for(int j = 0; j < txt1.length();j++) {
					boolean notFound = true;
						for(int k = 0; k<foundLetters.length();k++)
							if(foundLetters.charAt(k) == txt2.charAt(i)) notFound = false;
					if(notFound && txt2.charAt(i) == txt1.charAt(j)) {foundLetters += txt2.charAt(i); presjek += txt2.charAt(i);}
			}
		}
		return presjek;
	}
	
	public static String simetricnaRazlika(String txt1,String txt2,String presjek) {
		String razlika = new String();
		
			for(int i = 0;i < txt1.length();i++) {
				boolean inCross = false;
				for(int j = 0;j < presjek.length();j++)
					if(presjek.charAt(j) == txt1.charAt(i)) inCross = true;
				if(!inCross) razlika+= txt1.charAt(i);
			}

			for(int i = 0;i < txt2.length();i++) {
				boolean inCross = false;
				for(int j = 0;j < presjek.length();j++)
					if(presjek.charAt(j) == txt2.charAt(i)) inCross = true;
				if(!inCross) razlika+= txt2.charAt(i);
			}
		return razlika;
	}
	
	public static void main(String[] args) {
		System.out.println("String 1: ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("String 2: ");
		String str2 = sc.next();
		String p = presjek(str1,str2);
		System.out.println("Unija: "+unija(str1,str2));
		System.out.println("Presjek: "+p);
		System.out.println("Razlika: "+simetricnaRazlika(str1,str2,p));
		sc.close();
	}
}
