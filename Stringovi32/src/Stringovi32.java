import java.util.Scanner;
public class Stringovi32 {
	public static boolean hasInvalidChars(String str) {
		for(int i = 0;i < str.length();i++)
			if(!Character.isDigit(str.charAt(i))) return true;
		return false;
	}
	
	public static boolean isLeap(int year) {
		if((year % 4 == 0 && year%100 != 0) || (year % 400 == 0)) return true;
		return false;
		
	}
	
	public static int monthLength(int month, int year) {
		switch(month){
			case 1,3,5,7,8,10,12:
				return 31;
			case 4,6,9,11:
				return 30;
			case 2:
				if(isLeap(year)) return 29;
				return 28;
			default:
				return -1;
		}
	}
	
	public static boolean invalidDay(int day,int month, int year) {
		if(day < 0 || day>monthLength(month,year)) return true;
		return false;
	}
	
	public static String nextDay(String date) {
		String[] splitDate = date.split("[.]");
		if(splitDate.length != 3) { System.out.println("Invalid date"); return "0";}
		
		String danS = splitDate[0];
		String mjesecS = splitDate[1];
		String godinaS = splitDate[2];
		
		if(hasInvalidChars(danS) || hasInvalidChars(mjesecS) || hasInvalidChars(godinaS))
			{ System.out.println("Invalid date"); return "0";}
		
		int dan = Integer.parseInt(danS);
		int mjesec = Integer.parseInt(mjesecS);
		int godina = Integer.parseInt(godinaS);
		
		if(godina<0 || mjesec<0 || mjesec>12 || invalidDay(dan,mjesec,godina))
			{ System.out.println("Invalid date"); return "0";}
		
		if(dan + 1 > monthLength(mjesec,godina)) {
			dan = 1;
			if(mjesec+1 > 12) {
				mjesec = 1;
				godina++;
			}
			else
				mjesec++;
		}
		else
			dan++;
		
		String nextDate = Integer.toString(dan) + "." + Integer.toString(mjesec) + "." + Integer.toString(godina);
		
		return nextDate;
	}
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Datum: ");
		String datum = sc.next();
		String datum2 =  nextDay(datum);
		System.out.println("Dan nakon " + datum + " : " + datum2);
		sc.close();
	}
}
