
public class testklass {

	public static void main(String[] args) {
			
		OOAB OOAB1 = new OOAB();
		
		Dotterbolag Dotterbolag1 = new Dotterbolag();
		Dotterbolag Dotterbolag2 = new Dotterbolag();
		
		Projekt Projekt1 = new Projekt();
		Projekt Projekt2 = new Projekt();
		Projekt Projekt3 = new Projekt();
		
		Anstalld Anstalld1 = new Anstalld();
		Anstalld Anstalld2 = new Anstalld();
		
		// OOAB
		OOAB1.setOOABnamn("Acme AB");
		OOAB1.setOOABnr("556512");
		OOAB1.LaggTillDotterbolag(Dotterbolag1);
		OOAB1.LaggTillDotterbolag(Dotterbolag2);
		
		//Dotterbolag
		Dotterbolag1.setDotterbolagNamn("Acme Sweden");
		Dotterbolag1.setDotterbolagNr("1a");
		Dotterbolag1.setModerbolag(OOAB1);
		//Dotterbolag1.LaggTillProjekt(Projekt1);
		
		Dotterbolag2.setDotterbolagNamn("Acme Denmark");
		Dotterbolag2.setDotterbolagNr("1b");
		Dotterbolag2.setModerbolag(OOAB1);
		Dotterbolag2.LaggTillProjekt(Projekt2);
		Dotterbolag2.LaggTillProjekt(Projekt3);
		
		//Projekt
		Projekt1.setProjektNamn("Nyinvestering");
		Projekt1.setProjektBudget(1000000);
		//Projekt1.setTillhör(Dotterbolag1);
		
		Projekt2.setProjektNamn("Databaser");
		Projekt2.setProjektBudget(300000);
		Projekt2.setTillhör(Dotterbolag2);
		
		Projekt3.setProjektNamn("Underhåll");
		Projekt3.setProjektBudget(500000);
		Projekt3.setTillhör(Dotterbolag2);
		
		//Dubbelkopplar anstallda
		Anstalld1.setAnställning(Dotterbolag2);
		Anstalld2.setAnställning(Dotterbolag2);
		Dotterbolag2.LaggTillAnstalld(Anstalld1);
		Dotterbolag2.LaggTillAnstalld(Anstalld2);
		
		//Kör funktion LaggTillProjektAllt i OOAB  och fungerar då jag tagit bort setTillhör och LaggTillProjekt. 
		OOAB1.LaggTillProjektAllt("1a", Projekt1);
		
		
		System.out.println(Dotterbolag1.getDotterbolagNamn());
			for(Projekt a : Dotterbolag1.projektLista) {
				System.out.println(a.getProjektNamn());
			}
		System.out.println(Dotterbolag2.getDotterbolagNamn());
			for(Projekt b : Dotterbolag2.getProjektLista()) {
				System.out.println(b.getProjektNamn());
			}
		System.out.println(OOAB1.getTotalOOABBudget());
	}

}
