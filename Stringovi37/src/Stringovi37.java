import java.util.Scanner;
public class Stringovi37 {
	public static Scanner sc = new Scanner(System.in);
	public static void fillArr(String[] arr) {
		for(int i = 0; i < arr.length;i++)
			arr[i] = sc.next();
	}
	
	public static void brPenzionera(String[] jmbgs,String date) {
		int count = 0;
		String[] splitDate = date.split("[.]");
		int dan_ =Integer.parseInt(splitDate[0]);
		int mjesec_ =Integer.parseInt(splitDate[1]);
		int godina_ =Integer.parseInt(splitDate[2]);

		for(int i = 0;i < jmbgs.length;i++) {
			int dan =Integer.parseInt(jmbgs[i].substring(0,2));
			int mjesec =Integer.parseInt(jmbgs[i].substring(2,4));
			int godina =Integer.parseInt(jmbgs[i].substring(4,7))+1000;
			int pol =Integer.parseInt(jmbgs[i].substring(9,12));
			
			if(pol<500) {
				if(godina_-godina > 66) count++;
				else if(godina_-godina == 66) {
					if(mjesec_ - mjesec > 0) count++;
					else if(mjesec_ - mjesec == 0) {
						if(dan_ - dan >= 0) count++;
					}
				}
			}else {
				if(godina_-godina > 64) count++;
				else if(godina_-godina == 66) {
					if(mjesec_ - mjesec > 0) count++;
					else if(mjesec_ - mjesec == 0) {
						if(dan_ - dan >= 0) count++;
					}
				}
			}
		}
		System.out.println("Broj ljudi koji ispunjava uslov: " + count);
	}
	
	public static void main(String[] args) {
		System.out.println("Dimenzija niza:");
		int n = sc.nextInt();
		String[] maticniBrojevi = new String[n];
		fillArr(maticniBrojevi);
		System.out.println("Danasnji datum:");
		String datum = sc.next();
		brPenzionera(maticniBrojevi,datum);
		sc.close();
	}
}
