
public class Cvor {
	String ime;
	String sadrzaj;
	Cvor next;
	public Cvor(String ime_,String sadrzaj_) {
		this.ime = ime_;
		this.sadrzaj = sadrzaj_;
		this.next = null;
	}
	
	public boolean sadrzi(String txt) {
		for(int i = 0; i< this.ime.length();i++) {
			boolean sadrziSe = true;
			for(int j = 0; j < txt.length();j++) {
				if(txt.charAt(j) != this.ime.charAt(i+j)) {
					sadrziSe = false;
					break;
				}
				if(sadrziSe) return true;
			}
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return this.ime + "(" + this.sadrzaj+")";
	}
}
