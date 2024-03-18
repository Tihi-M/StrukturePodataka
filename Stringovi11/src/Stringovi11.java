import java.util.Scanner;
public class Stringovi11 {
	public static boolean isValidString(String txt) {
		int countA=0;
		int countB=0;
		int countC=0;
		int m=1;
		int n=1;
		boolean foundM1= false;
		boolean foundN= false;
		boolean foundM2 = false;
		int i = 0;
		while(i < txt.length()) {
			switch(txt.charAt(i)) {
			case 'a':
				if(countA != 0) return false;
				while(i<txt.length() && txt.charAt(i) == 'a') {
					countA++;
					i++;
				}
				while(m < countA) {
					if(countA % (m*2) == 0) {foundM1 = true;break;}
					m++;
				}
				if(!foundM1) return false;
				break;
			case 'b':
				if(countB != 0) return false;
				while(i<txt.length() && txt.charAt(i) == 'b') {
					countB++;
					i++;
				}
				while(n <= countB) {
					if(countB % n == 0) foundN = true;
					n++;
				}
				if(!foundN) return false;
				break;
			case 'c':
				if(countC != 0) return false;
				while(i < txt.length() && txt.charAt(i) == 'c') {
					countC++;
					i++;
				}
				while(m < countC) {
					if(countC % (m*2) == 0) {foundM2 = true; break;}
					m++;
				}
				if(!foundM2) return false;
				break;
			default:
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String txt = sc.next();
		if(isValidString(txt)) System.out.println("Da");
		else System.out.println("Ne");
		sc.close();
	}
}
