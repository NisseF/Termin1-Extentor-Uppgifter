
public class Testklass {
	public static void main(String[]args) {
	
	OOAB OOAB1 = new OOAB();
	
	Dotterbolag d1 = new Dotterbolag();
	Dotterbolag d2 = new Dotterbolag();
	
	Projekt p1 = new Projekt();
	Projekt p2 = new Projekt();
	Projekt p3 = new Projekt();
	
	Anstalld a1 = new Anstalld();
	Anstalld a2 = new Anstalld();
	Anstalld a3 = new Anstalld();
	
	OOAB1.setOOABnr("556512");
	OOAB1.setOOABnamn("Acme AB");
	OOAB1.laggTillDotterbolag(d1);
	OOAB1.laggTillDotterbolag(d2);
	
	d1.setNr("1a");
	d1.setDotterbolagsNamn("Acme Sweden");
	d1.setModerbolag(OOAB1);
	//d1.laggTillAnstalld(a3);
	
	d2.setNr("1b");
	d2.setDotterbolagsNamn("Acme Denmark");
	d2.setModerbolag(OOAB1);
	d2.laggTillAnstalld(a1);
	d2.laggTillAnstalld(a2);
	
	p1.setProjektNamn("Nyinvestering");
	p1.setBudget(1000000);
	p1.setProjektägare(d1);
	
	p2.setProjektNamn("Databaser");
	p2.setBudget(300000);
	p2.setProjektägare(d2);
	
	p3.setProjektNamn("Underhåll");
	p3.setBudget(500000);
	p3.setProjektägare(d2);
	
	a1.setPnr("1");
	a1.setAnstalldNamn("Mats");
	a1.setSalary(30000);
	a1.setArbetsgivare(d2);
	
	a2.setPnr("2");
	a2.setAnstalldNamn("Viktoria");
	a2.setSalary(35000);
	a2.setArbetsgivare(d2);
	
	a3.setPnr("3");
	a3.setAnstalldNamn("Anders");
	a3.setSalary(40000);
	a3.setArbetsgivare(d1);
	
	OOAB1.LäggtillAnstalld("1a", a1);
	
	System.out.println(d1.totalSalary());
	
	for(Dotterbolag a : OOAB1.getDotterbolaglista()) {
		System.out.println(a.getDotterbolagsNamn());
		for(Anstalld b : a.getAnställningslista()) {
			System.out.println("- " + b.getAnstalldNamn());
		}
	}
	System.out.println(OOAB1.totalOOABSalary());

	}
	
}
