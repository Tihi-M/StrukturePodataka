
public class Vozac implements Comparable<Vozac>{
	String ime;
	String tim;
	int[] trening = new int[20];
	int[] pobjede = new int[20];
	public Vozac(String ime_,String tim_,int[] trening_,int[] pobjede_) {
		this.ime = ime_;
		this.tim = tim_;
		for(int i  =0 ;i < 20; i++) {
			this.trening[i] = trening_[i];
			this.pobjede[i] = pobjede_[i];
		}
	}
	
	public Vozac() {
		this.ime = "";
		this.tim = "";
		for(int i = 0; i<20;i++) {
			this.trening[i] = 0;
			this.pobjede[i] = 0;
		}
	}
	
	public int sumaBodova(int n) {
		if(n < 0)
			return 0;
		return this.pobjede[n] + sumaBodova(--n);
	}
	
	public int brojPrvihMjesta(int n) {
		if(n < 0)
			return 0;
		if(this.trening[n] == 1)
			return 1 + brojPrvihMjesta(--n);
		else return brojPrvihMjesta(--n);
	}
	
	@Override
	public int compareTo(Vozac v) {
		int b1 = this.sumaBodova(19);
		int b2 = v.sumaBodova(19);
		
		int p1 = this.brojPrvihMjesta(19);
		int p2 = this.brojPrvihMjesta(19);
		if(b1 == b2) {
			if(p1 == p2) {
				if(this.ime.compareTo(v.ime) > 0)
					return 1;
				return -1;
			}else if(p1 > p2)
				return 1;
			else return -1;
		}
		else if (b1 > b2)
			return 1;
		else return -1;
	}
	@Override
	public String toString() {
		return this.ime + " " + this.tim +" Points: "+ this.sumaBodova(19)+ " Wins: "+ this.brojPrvihMjesta(19); 
	}
}
