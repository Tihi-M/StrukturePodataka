
public class Datum implements Comparable<Datum>{
	private int dan;
	private int mjesec;
	private int godina;
	

	public int getDan() {
		return dan;
	}

	public int getMjesec() {
		return mjesec;
	}

	public int getGodina() {
		return godina;
	}
	
	private boolean jeParna(int godina) {
		if((godina % 4 == 0 && godina % 100 != 0) || godina %400 == 0)
			return true;
		return false;
	}
	
	private int duzinaMjeseca(int mjesec,int godina) {
		int[] dana30 = {4,6,9,11};
		int[] dana31 = {1,3,5,7,8,10,12};
		
		for(int i = 0;i < 7;i++)
			if(dana31[i] == mjesec)
				return 31;
		for(int i = 0;i < 4;i++) 
			if(dana30[i] == mjesec)
				return 30;
		if(jeParna(godina))
			return 29;
		return 28;
	}
	
	public Datum(int dan_,int mjesec_,int godina_) {
		if(godina_ < 0) {
			System.out.println("Error");
			return;
		}
		if(mjesec_ < 0 || mjesec_ > 12) {
			System.out.println("Error");
			return;
		}
		if(dan_ < 0 || dan_ > duzinaMjeseca(mjesec_,godina_)) {
			System.out.println("Error");
			return;
		}
		this.dan = dan_;
		this.mjesec = mjesec_;
		this.godina = godina_;
	}
	
	@Override
	public int compareTo(Datum d) {
		if(this.godina > d.getGodina())
			return 1;
		else if (godina < d.getGodina())
			return -1;
		else if(this.mjesec > d.getMjesec())
			return 1;
		else if(this.mjesec < d.getMjesec())
			return -1;
		else if(this.dan > d.getDan())
			return 1;
		else if(this.dan < d.getDan())
			return -1;
		return 0;
	}
	
	@Override
	public String toString() {
		return this.dan +"."+this.mjesec+"."+this.godina+".";
	}
}
