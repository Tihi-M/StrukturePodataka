
public class DblLista {
	Cvor glava;
	Cvor next;
	Cvor prev;
	
	public DblLista(Radnik r) {
		Cvor prvi = new Cvor(r);
		this.glava = prvi;
		this.prev = null;
		this.next = null;
	}
	
	public void dodajNaPocetak(Radnik r) {
		Cvor novi = new Cvor(r);
		novi.next = this.glava;
		this.glava = novi;
	}
	
	public void printList() {
		Cvor temp = this.glava;
		while(temp != null) {
			System.out.println(temp.toString());
			temp = temp.next;
		}
		System.out.println("Kraj liste");
	}
	
	public void obrisi(String jmbg) {
		Cvor temp = this.glava;
		Cvor prev = null;
		while(temp != null) {
			if(temp.info.getMaticniBroj().equals(jmbg)) {
				if(prev == null) {
					this.glava = this.glava.next;
					temp = temp.next;
				}
				else {
					prev.next = temp.next;
					temp = temp.next;
				}
			}
			else {
				prev = temp;
				temp = temp.next;
			}
		}
	}
	public void stampajSveURadnomOdnosu(Datum d) {
		Cvor temp = this.glava;
		while(temp != null) {
			for(int i = 0; i < 3 ;i++)
				if(temp.info.getZaposlenja()[i].getDatumZaposlenja().compareTo(d) <= 0 &&
					temp.info.getZaposlenja()[0].getDatumZaposlenja().compareTo(d) > 0) {
					System.out.println(temp.info.getIme());
					break;
				}
			temp = temp.next;
		}
	}
	

}