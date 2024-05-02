
public class Slicica implements Comparable<Slicica>{
	String ime_fudbalera;
	String reprezentacija;
	int br;
	
	public Slicica(String ime_,String rep_, int br_) {
		this.ime_fudbalera = ime_;
		this.reprezentacija = rep_;
		this.br = br_;
	}
	@Override
	public String toString() {
		return this.ime_fudbalera + " " + this.reprezentacija + " " + this.br;
	}
	@Override
	public int compareTo(Slicica s) {
		if(this.reprezentacija.compareTo(s.reprezentacija) > 0)
			return 1;
		else if(this.reprezentacija.compareTo(s.reprezentacija) < 0)
			return -1;
		else if(this.br > s.br)
			return 1;
		else if(this.br < s.br)
			return -1;
		else if(this.ime_fudbalera.compareTo(s.ime_fudbalera)>0)
			return 1;
		else if(this.ime_fudbalera.compareTo(s.ime_fudbalera) < 0)
			return -1;
		else return 0;
	}
}
