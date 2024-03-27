import java.util.Scanner;
public class Stringovi33 {
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
	
	public static boolean hasInvalidMonthName(String month,int type) {
		String[] fullName = {"januar","februar","mart","april",
		"maj","jun","jul","avgust","septembar","oktobar","novembar","decembar"};
		String[] shortName = {"jan","feb","mar","apr",
				"maj","jun","jul","avg","sep","okt","nov","dec"};
			if(type == 3) {
				for(int i = 0; i < fullName.length;i++)
					if(fullName[i].equals(month)) return false;
				return true;
			}
			else {
				for(int i = 0; i < shortName.length;i++) 
					if(shortName[i].equals(month)) return false;
				return true;
			}
		}
	
	public static int monthToInt(String month,int type) {
		String[] fullName = {"januar","februar","mart","april","maj",
				"jun","jul","avgust","septembar","oktobar","novembar","decembar"};
		String[] shortName = {"jan","feb","mar","apr","maj","jun",
				"jul","avg","sep","okt","nov","dec"};
		if(type == 3) {
			for(int i = 0; i < fullName.length;i++)
				if(fullName[i].equals(month)) return i+1;
			return -1;
		}
		else {
			for(int i = 0; i < shortName.length;i++) 
				if(shortName[i].equals(month)) return i+1;
			return -1;
		}
	}
	
		
	public static int findType(String day,String month) {
		if((day.length() == 2 && day.charAt(0)== '0') || 
		   (month.length() == 2 && month.charAt(0)== '0')) return 2;
		else if(!hasInvalidChars(month)) return 1;
		else if(month.length() != 3) return 3;
		else return 4;
	}
	
	public static boolean isValidDate(String date) {
		String[] splitDate = date.split("[.]");
		int typeOfDate;
		if(splitDate.length != 3) {
			splitDate = date.split("[/]");
			if(splitDate.length != 3) {
				splitDate = date.split("[-]");
				if(splitDate.length != 3) return false;
				if(hasInvalidChars(splitDate[1])) return false;
				else typeOfDate=findType(splitDate[0],	splitDate[1]);
			}
			else if(hasInvalidChars(splitDate[1])) return false;
			else typeOfDate=findType(splitDate[0],	splitDate[1]);
		}
		else typeOfDate=findType(splitDate[0],	splitDate[1]);
		
		String danS = splitDate[0];
		String mjesecS = splitDate[1];
		String godinaS = splitDate[2];
		
		if(hasInvalidChars(danS) || hasInvalidChars(godinaS)) return false;
		if(typeOfDate == 1 || typeOfDate == 2) {
			if(hasInvalidChars(mjesecS)) return false;
			if(typeOfDate==2 && (mjesecS.length()!=2 || danS.length()!=2)) return false;
			}
		else if(hasInvalidMonthName(mjesecS,typeOfDate)) return false;
			
		int dan = Integer.parseInt(danS);
		int mjesec;
		if(typeOfDate== 4 || typeOfDate == 3) {
			mjesec = monthToInt(mjesecS,typeOfDate);
		}
		else mjesec = Integer.parseInt(mjesecS);
		int godina = Integer.parseInt(godinaS);
		
		
		if(godina<0 || mjesec<0 || mjesec>12 || invalidDay(dan,mjesec,godina))
			return false;
		return true;
	}
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Datum: ");
		String datum = sc.next();
		if(isValidDate(datum)) System.out.println("Validan");
		else System.out.println("Nije validan");
		sc.close();
	}
}
