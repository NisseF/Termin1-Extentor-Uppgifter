
public class Testklass {
	public static void main(String[] args) {
		
		Hus hus1 = new Hus();
		
		Lägenhet L1 = new Lägenhet();
		Lägenhet L2 = new Lägenhet();
		
		Hyrestagare H1 = new Hyrestagare();
		Hyrestagare H2 = new Hyrestagare();
		Hyrestagare H3 = new Hyrestagare();
		Hyrestagare H4 = new Hyrestagare();
		
		hus1.setAddress("Hejhej");
		hus1.LaggTillLagenhet(L1);
		hus1.LaggTillLagenhet(L2);
		
		L1.setNummer(11);
		L1.setHyra(6900);
		L1.setYta(70);
		L1.setTillhör(hus1);
		L1.laggTillHyrestagare(H1);
		L1.laggTillHyrestagare(H2);
		
		L2.setNummer(12);
		L2.setHyra(8800);
		L2.setYta(95);
		L2.setTillhör(hus1);
		L2.laggTillHyrestagare(H3);
		L2.laggTillHyrestagare(H4);
		
		H1.setPersonnummer("111");
		H1.setHyrestagareNamn("Magnus Magnusson");
		H1.setHyresvärd(L1);
		
		H2.setPersonnummer("222");
		H2.setHyrestagareNamn("Anna Magnusson");
		H2.setHyresvärd(L1);
		
		H3.setPersonnummer("333");
		H3.setHyrestagareNamn("Olle Stensson");
		H3.setHyresvärd(L2);
		
		H4.setPersonnummer("444");
		H4.setHyrestagareNamn("Greta Stensson");
		H4.setHyresvärd(L2);
		
		// Testa denna senare. 		
		
	for(Hyrestagare c : hus1.vemHyrLagenhet(12)) {
		System.out.println(c.getHyrestagareNamn() +" " + c.getPersonnummer());
	}
		
	for(Hyrestagare b: hus1.allaHyrestagareMedHyraOver(6000)) {
		System.out.println(b.getHyrestagareNamn() + " " + b.getPersonnummer());
		}
		
	
		
	hus1.printHyrestagare(12);
	
	System.out.println(L1.getHusAdress());
	
	System.out.println(H4.adress());
		
	for(Hyrestagare b : hus1.vemHyrLagenhet(12))
		System.out.println(b.getHyrestagareNamn() + " " + b.getPersonnummer());
		
	}

}
