
public class Radnik {
	private String maticniBroj;
	private String ime;
	private int staz;
	private int plata;
	private Posao[] zaposlenja = new Posao[3];
	
	
	public Posao[] getZaposlenja() {
		return zaposlenja;
	}

	public String getMaticniBroj() {
		return maticniBroj;
	}

	public String getIme() {
		return ime;
	}

	public int getPlata() {
		return plata;
	}

	public Radnik(String maticniBroj_,String ime_,int staz_,int plata_,Posao[] zaposlenja_) {
		this.maticniBroj = maticniBroj_;
		this.ime = ime_ ;
		this.staz = staz_;
		this.plata = plata_;
		for(int i = 0; i < 5;i++)
			this.zaposlenja[i] = zaposlenja_[i];
	}
	
	@Override
	public String toString() {
		return "JMBG: "+this.maticniBroj + " Ime: " + 
				this.ime + " God staza: "+ this.staz+
				" Plata: "+ this.plata + "\n"+"Zaposlenja: "+
				zaposlenja[0].toString()+ "\n"+zaposlenja[1].toString()+
				"\n" +zaposlenja[2].toString()+"\n############################################";
	}
}
