import java.util.Scanner;
public class Stringovi27 {
	public static boolean nijeBroj(String txt) {
		for(int i = 0; i< txt.length();i++)
			if(!Character.isDigit(txt.charAt(i))) return true;
		return false;
	}

	public static boolean isValid(String address) {
		String[] partsOf = address.split("[.]");
		if(partsOf.length != 4) return false;
		
		for(int i = 0; i < 4;i++) {
			if(partsOf[i].length() == 0) return false;
			if(partsOf[i].length() > 1 && partsOf[i].charAt(0) == '0') return false;
			if(nijeBroj(partsOf[i])) return false;
			int num = Integer.parseInt(partsOf[i]);
			if(num < 0 || num > 255) return false;
		}
		return true;
	}
	public static void findNumOfIpAddress(String num) {
		int count = 0;
		if(num.length()>12 || num.length()<4) {System.out.println(0);return;}
		
		int n = num.length();
		String newIp = num;
		for(int i = 1;i < n-2;i++)
			for(int j = i+1;j < n-1;j++) {
				for(int k = j+1;k < n;k++) {
					
					newIp = newIp.substring(0,k)+"."+newIp.substring(k);
					newIp = newIp.substring(0,j)+"."+newIp.substring(j);
					newIp = newIp.substring(0,i)+"."+newIp.substring(i);
					if(isValid(newIp)) {
					count++;
					System.out.println(newIp);
					}
					
					newIp = num;

				}
			}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String: ");
		String adresa = sc.next();
		findNumOfIpAddress(adresa);
		sc.close();
	}
}
