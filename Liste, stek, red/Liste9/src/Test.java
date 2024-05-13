
public class Test {
	public static void main(String[] args) {
		Album al1 = new Album();
		Slicica s1 = new Slicica("Messi","Argentina",10);
		Slicica s2 = new Slicica("Martinez","Argentina",17);
		Slicica s3 = new Slicica("Alvarez","Argentina",9);
		Slicica[] paket1 = {s1,s2,s3};
		al1.dodajPaketSlicica(paket1);
		Slicica s4 = new Slicica("Mbappe","Francuska",11);
		Slicica s5 = new Slicica("Griezmann","Francuska",7);
		Slicica s6 = new Slicica("Giroud","Francuska",5);
		Slicica[] paket2 = {s4,s5,s6};
		al1.dodajPaketSlicica(paket2);
		
		Album al2 = new Album();
		//Slicica s0 = new Slicica("Messi","Argentina",10);
		//al1.dodajSlicicuKraj(s0);
		//al1.dodajSlicicuKraj(s0);
		al1.dodajSlicicuKraj(s1);
		Slicica s10 = new Slicica("Luka Popovic","Crna Gora",10);
		al1.dodajSlicicuKraj(s10);
		//al1.dodajSlicicuKraj(s3);
		al1.dodajSlicicuKraj(s2);
		al1.sortirajAlbum();
		al1.prikaziAlbum();
		al1.prikaziDuplikate();
		//al1.pronadjiNedostajuce();
		al1.razmijeniDuplikate(al2);
		al2.prikaziAlbum();
	}
}
