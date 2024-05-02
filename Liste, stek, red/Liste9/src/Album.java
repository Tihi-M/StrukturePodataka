public class Album {
	ListaSlicica album;
	ListaSlicica duplikati;
	
	public Album() {
		this.album = new ListaSlicica();
		this.duplikati = new ListaSlicica();
	}
	
	public void prikaziAlbum() {
		this.album.printList();
	}
	
	
	
	public void prikaziDuplikate() {
		this.duplikati.printList();
	}
	
	public void dodajSlicicuKraj(Slicica s) {
		if(isDuplicate(s))
			this.duplikati.add(s);
		else
			this.album.add(s);
	}
	
	public void dodajPaketSlicica(Slicica[] paket) {
		for(int i = 0; i < paket.length;i++)
			this.dodajSlicicuKraj(paket[i]);

	
	}
	
	public boolean isDuplicate(Slicica s) {
		Cvor temp = this.album.glava;
		while(temp != null) {
			if(temp.info.compareTo(s)==0)
				return true;
			temp = temp.next;
		}
		return false;
	}
	
	
	
	public void dodajSlicicu(Slicica s) {
		this.album.glava = this.album.mergeSort(this.album.glava);
		if(isDuplicate(s))
			this.duplikati.add(s);
			
		Cvor temp = this.album.glava;
		Cvor prev = null;
		Cvor novi = new Cvor(s);
		while(temp != null && temp.info.compareTo(s) > 0) {
			prev = temp;
			temp = temp.next;
		}
		
		if(prev == null) {
			this.album.glava = novi;
			novi.next = temp;
		}
		else {
			prev.next = novi;
			novi.next = temp;
		}
	}
	
	public void pronadjiNedostajuce() {
		Cvor temp = this.album.glava;
		Cvor temp2 = this.album.glava;
		String currentRep = temp2.info.reprezentacija;
		while(temp != null) {
			int i = 1;	
			while(i<=20) {
					if(temp2.info.br != i)
						System.out.println("ime: ? " + temp2.info.reprezentacija + " br: "+i);
					else if(temp2.next != null && temp2.next.info.reprezentacija.equals(currentRep)) 
						temp2 = temp2.next;
					i++;
				}
			while(temp != null && temp.info.reprezentacija.equals(currentRep))
				temp = temp.next;
			temp2 = temp;
			if(temp != null)
				temp=temp.next;
			else return;
				temp2 = temp;
				currentRep =temp2.info.reprezentacija;
			}
		}
	
	
	public void ukloniSlicicu(Cvor c) {
		this.duplikati.del(c.info);
	}
	
	public void razmijeniDuplikate(Album al2) {
		Cvor temp = this.duplikati.glava;
		while(temp != null) {
			if(!al2.isDuplicate(temp.info)) {
				al2.dodajSlicicu(temp.info);
				this.ukloniSlicicu(temp);
			}
			temp = temp.next;
		}
		
	}
	
	public void sortirajAlbum() {
		this.album.glava = this.album.mergeSort(this.album.glava);
	}
}
