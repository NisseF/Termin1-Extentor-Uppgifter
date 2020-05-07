
public class testmetod {
	public static void main(String [] args) {
	
	
	Register reg1 = new Register();
	
	Fordon F1 = new Fordon();
	Fordon F2 = new Fordon();
	Fordon F3 = new Fordon();
	Motorcykel M1 = new Motorcykel();
	
	Agare A1 = new Agare();
	Agare A2 = new Agare();
	
	F1.setRegNr("ABC123");
	F1.setMarke("Volvo");
	F1.setArsmodell(99);
	F1.setÄgsAv(A1);
	
	F2.setRegNr("CBA123");
	F2.setMarke("SAAB");
	F2.setArsmodell(02);
	F2.setÄgsAv(A1);
	
	F3.setRegNr("ABC321");
	F3.setMarke("Hyundai");
	F3.setArsmodell(14);
	F3.setÄgsAv(A2);
	
	M1.setRegNr("BAB222");
	M1.setMarke("BMW");
	M1.setArsmodell(15);
	M1.setÄgsAv(A2);
	
	A1.setPnr("111");
	A1.setNamn("Rolke af Sturup");
	A1.laggTillFordon(F1);
	A1.laggTillFordon(F2);
	
	A2.setPnr("222");
	A2.setNamn("Kristin af Kastrup");
	A2.laggTillFordon(F3);
	A2.laggTillFordon(M1);
	
	reg1.laggTillFordonRegister(F1);
	reg1.laggTillFordonRegister(F2);
	reg1.laggTillFordonRegister(F3);
	reg1.laggTillFordonRegister(M1);
	
	reg1.skrivutAgarensAllaFordon("111");
	
	for(Fordon a : reg1.getFordonregister()) {
		System.out.println(a.getRegNr() + " " + a.getMarke() + " " + a.getÄgsAv().getNamn());
		
	}
	
	
	}
	
}
