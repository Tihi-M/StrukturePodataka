import java.util.Scanner;
public class Stringovi19 {
	public static void findGen(String dna,int len) {
		for(int i = 0;i < dna.length()-len+1;i++) {
			boolean hasG= false;
			boolean hasA= false;
			boolean hasT= false;
			boolean hasC= false;
			String gen = new String();
			for(int j=i;j <len+i;j++) {
				gen+=dna.charAt(j);
				switch(dna.charAt(j)) {
				case 'A':
					hasA = true;
					break;
				case 'C':
					hasC = true;
					break;
				case 'T':
					hasT = true;
					break;
				case 'G':
					hasG = true;
					break;
					default:
						return;
				}
			}
			if(hasG && hasT && hasA && hasC) System.out.println(gen);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Genom: ");
		String dna = sc.next();
		System.out.println("Duzina: ");
		int n = sc.nextInt();
		findGen(dna,n);
		sc.close();
	}
}
