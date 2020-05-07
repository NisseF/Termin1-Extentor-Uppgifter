
public class Testmetod {
	public static void main(String[] args) {
		
		Hamn Hamn1 = new Hamn();
		
		Batplats B1 = new Batplats();
		Batplats B2 = new Batplats();
		Batplats B3 = new Batplats();
		
		Hyrestagare hyrestagare1 = new Hyrestagare();
		Hyrestagare hyrestagare2 = new Hyrestagare();
		Hyrestagare hyrestagare3 = new Hyrestagare();
		Hyrestagare hyrestagare4 = new Hyrestagare();
		Hyrestagare hyrestagare5 = new Hyrestagare();
		Hyrestagare hyrestagare6 = new Hyrestagare();
		
		Hamn1.setHamnAdress("Hamngatan 1");
		Hamn1.setHamnNamn("Aqua");
		Hamn1.laggTillBatplats(B1);
		Hamn1.laggTillBatplats(B2);
		Hamn1.laggTillBatplats(B3);
		
		B1.setBatplatsNr(1);
		B1.setHyra(12000);
		B1.laggTillHyrestgare(hyrestagare1);
		B1.laggTillHyrestgare(hyrestagare2);
		B1.setTillhör(Hamn1);
		
		B2.setBatplatsNr(2);
		B2.setHyra(10000);
		B2.laggTillHyrestgare(hyrestagare3);
		B2.laggTillHyrestgare(hyrestagare4);
		B2.setTillhör(Hamn1);
		
		B3.setBatplatsNr(3);
		B3.setHyra(8000);
		B3.laggTillHyrestgare(hyrestagare5);
		B3.laggTillHyrestgare(hyrestagare6);
		B3.setTillhör(Hamn1);
		
		hyrestagare1.setHyrestagareNr("h1");
		hyrestagare1.setHyrestagareNamn("Mats");
		hyrestagare1.setHyresÄgare(B1);
		
		hyrestagare2.setHyrestagareNr("h2");
		hyrestagare2.setHyrestagareNamn("Viktoria");
		hyrestagare2.setHyresÄgare(B1);
		
		hyrestagare3.setHyrestagareNr("h3");
		hyrestagare3.setHyrestagareNamn("Anders");
		hyrestagare3.setHyresÄgare(B2);
		
		hyrestagare4.setHyrestagareNr("h4");
		hyrestagare4.setHyrestagareNamn("Anna");
		hyrestagare4.setHyresÄgare(B2);
		
		hyrestagare5.setHyrestagareNr("h5");
		hyrestagare5.setHyrestagareNamn("Eva");
		hyrestagare5.setHyresÄgare(B3);
		
		hyrestagare6.setHyrestagareNr("h6");
		hyrestagare6.setHyrestagareNamn("Sven");
		hyrestagare6.setHyresÄgare(B3);
		
		System.out.println(Hamn1.hittaHyretagareBatplats(hyrestagare5.getHyrestagareNr()));
		//System.out.println(Hamn1.hittaHyretagareBatplats("h5"); fungerar också. 
		
		for(Batplats a : Hamn1.getHamnensbatplatser()) { 
			for(Hyrestagare b : a.getHyresLista()) {
				System.out.println(b.getHyrestagareNamn());
			}		
		}	
	}
}


