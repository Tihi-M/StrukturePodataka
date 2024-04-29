
public class Posao {
	private String nazivPoslodavca;
	private Datum datumZaposlenja;
	private Datum datumPrestankaZaposlenja;
	
	public String getNazivPoslodavca() {
		return this.nazivPoslodavca;
	}
	public Datum getDatumZaposlenja() {
		return this.datumZaposlenja;
	}
	public Datum getDatumPrestankaZaposlenja() {
		return this.datumPrestankaZaposlenja;
	}
	
	public Posao(String nazivPoslodavca_,Datum datumZaposlenja_,Datum datumPrestankaZaposlenja_) {
		this.nazivPoslodavca = nazivPoslodavca_;
		this.datumZaposlenja = datumZaposlenja_;
		this.datumPrestankaZaposlenja = datumPrestankaZaposlenja_;
	}
	
	@Override
	public String toString() {
		return "Ime poslodavca: "+ this.nazivPoslodavca + " Pocetak: " + this.datumZaposlenja + " Kraj: "+ this.datumPrestankaZaposlenja;
	}
	
}
