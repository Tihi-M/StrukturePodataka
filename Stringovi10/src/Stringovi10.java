import java.util.Scanner;
public class Stringovi10 {
	public static boolean prisutan(String prisustvo) {
		int countO=0;
		int countZ=0;
		int i =0;
		while(i < prisustvo.length()) {
			switch(prisustvo.charAt(i)) {
			case 'P':
				i++;
				break;
			case 'O':
				while(i < prisustvo.length() && prisustvo.charAt(i) == 'O') {
					countO++;
					i++;
					if(countO > 2) return false;
				}
				countO =0;
				break;
			case 'Z':
				while(i < prisustvo.length() && prisustvo.charAt(i) == 'Z') {
					countZ++;
					i++;
					if(countZ > 3) return false;
				}
				countZ=0;
				break;
			default:
				System.out.println("Invalid input");
				return false;
		}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String txt = sc.next();
		if(prisutan(txt)) System.out.println("Ima poene za prisustvo");
		else System.out.println("Nema poene za prisustvo");
		sc.close();
	}
}
