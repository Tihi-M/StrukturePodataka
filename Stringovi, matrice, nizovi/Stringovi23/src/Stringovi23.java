import java.util.Scanner;
public class Stringovi23 {
	public static String deleteDuplicates(String str) {
		String newStr = new String();
		for(int i = 0;i < str.length();i++) {
			boolean notFound = true;
			for(int j = 0;j < newStr.length();j++)
				if(newStr.charAt(j) == str.charAt(i)) notFound = false;
			if(notFound) newStr += str.charAt(i);
		}
		return newStr;
	}
	
	public static void countReps(String txt1,String txt2) {
		int count=0;
		txt1 = deleteDuplicates(txt1);
		for(int i = 0;i < txt1.length();i++)
			for(int k = 0;k < txt2.length();k++)
				if(txt1.charAt(i) == txt2.charAt(k)) count++;
		System.out.println(count);
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("String 1:");
		String str1 = sc.next();
		System.out.println("String 2:");
		String str2 = sc.next();
		countReps(str1,str2);
		sc.close();
	}
}
