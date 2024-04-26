import java.util.Scanner;

public class Stringovi20{
	public static boolean areEqual(String str1,String str2) {
		for(int i= 0;i < str1.length();i++)
			if(str1.charAt(i) != str2.charAt(i)) return false;
			return true;
	}
	
	public static boolean appearsTwice(String og,String sub, int ind) {
		for(int i = ind; i < og.length()-sub.length();i++) {
			String ogSub = new String();
			for(int j=0; j < sub.length();j++)
				ogSub+=og.charAt(i+j);
			if(areEqual(ogSub,sub)) return true;
		}
		return false;
	}
	
	public static void findReps(String dna,int len) {
		for(int i = 0;i < dna.length()-len;i++) {
			String toCheck = new String();
			int ind = 0;
			for(int j = i; j < len+i;j++) { 
				toCheck+=dna.charAt(j);
				ind = j;
			}
			ind++;
			if(appearsTwice(dna,toCheck,ind)) System.out.println(toCheck);			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Genom:");
		String gen = sc.next();
		System.out.println("Duzina:");
		int n = sc.nextInt();
		findReps(gen,n);
		sc.close();
	}
}