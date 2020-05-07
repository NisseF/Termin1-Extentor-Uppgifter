import java.util.ArrayList;

public class Dotterbolag {
	private String nr;
	private String namn;
	private OOAB moderbolag;
	ArrayList <Anstalld> anställningsLista = new ArrayList<Anstalld>();
	ArrayList<Projekt> projektLista = new ArrayList<Projekt>();
	
	public void setDotterbolagNr(String setDotterbolagNr) {
		nr = setDotterbolagNr;
	}
	public String getDotterBolagNr() {
		return nr;
	}
	public void setDotterbolagNamn(String setDotterbolagNamn) {
		namn = setDotterbolagNamn;
	}
	public String getDotterbolagNamn() {
		return namn; 
	}
	public void setModerbolag(OOAB setModerbolag) {
		moderbolag = setModerbolag;
	}
	public OOAB getModerbolag() {
		return moderbolag;
	}
	
	public ArrayList<Anstalld> getAnställningsLista(){
		return anställningsLista;
	}
	
	public void setAnställningsLista(ArrayList<Anstalld> newAnställningsLista) {
		anställningsLista = newAnställningsLista;
	}	
	
	public void LaggTillAnstalld(Anstalld nyAnstalld) {
		anställningsLista.add(nyAnstalld);
	}
	
	public ArrayList<Projekt> getProjektLista(){
		return projektLista;
	}
	
	public void setProjektLista(ArrayList<Projekt> newProjektLista) {
		projektLista = newProjektLista;
	}
	
	public void LaggTillProjekt(Projekt nyttProjekt) {
		projektLista.add(nyttProjekt);
	}
	
	public double getTotalBudget() {
		double TotalBudget = 0;
			for(Projekt ProjektTemp: projektLista) {
				if(ProjektTemp.getProjektBudget() == 0) {
				}
				else {
					TotalBudget += ProjektTemp.getProjektBudget();
				}
			}
		return TotalBudget;	
	}
}

