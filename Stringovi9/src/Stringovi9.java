import java.util.Scanner;
public class Stringovi9 {
	public static void translateNumber(String rimski) {
		int arapski=0;
		int j = 0;
		rimski+="  ";
		while(j < rimski.length()-2) {
			switch(rimski.charAt(j)){
			case 'M':
				while(j<rimski.length() && rimski.charAt(j) == 'M') {
					if(rimski.charAt(j+1) == 'C' && rimski.charAt(j+2)=='M')
						{arapski+=900;j++;}
					else arapski+=1000;
					j++;
				}
				break;
			case 'D':
				while(j<rimski.length() && rimski.charAt(j) == 'D') {
					if(rimski.charAt(j+1) == 'C' && rimski.charAt(j+2)=='D')
						{arapski+=400;j++;}
					else arapski+=500;
					j++;
				}
				break;
			case 'C':
				while(j<rimski.length() && rimski.charAt(j) == 'C') {
					if(rimski.charAt(j+1) == 'X' && rimski.charAt(j+2)=='C')
						{arapski+=90;j++;}
					else arapski+=100;
					j++;
				}
				break;
			case 'L':
				while(j<rimski.length() && rimski.charAt(j) == 'L') {
					if(rimski.charAt(j+1) == 'X' && rimski.charAt(j+2)=='L')
						{arapski+=40; j++;}
					else arapski+=50;
					j++;
				}
				break;
			case 'X':
				while(j<rimski.length() && rimski.charAt(j) == 'X') {
					if(rimski.charAt(j+1) == 'I' && rimski.charAt(j+2)=='X')
						{arapski+=9; j++;}
					else arapski+=10;
					j++;
				}
				break;
			case 'V':
				while(j<rimski.length() && rimski.charAt(j) == 'V') {
					if(rimski.charAt(j+1) == 'I' && rimski.charAt(j+2)=='V')
						{arapski+=4; j++;}
					else arapski+=5;
					j++;
				}
			case 'I':
				while(j<rimski.length() && rimski.charAt(j) == 'I') {
					if(rimski.charAt(j) == 'I' && rimski.charAt(j+1) == 'V')
						{arapski+=4; j++;}
					else if(rimski.charAt(j) == 'I' && rimski.charAt(j+1) == 'X')
						{arapski+=9; j++;}
					else arapski++;
					j++;
				}
				break;
			default:
				break;
			}
		}
		System.out.println("Arapski broj: " + arapski);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Rimski broj:");
		String broj = sc.next();
		translateNumber(broj);
		sc.close();
	}
}
