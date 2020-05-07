import java.util.ArrayList;

public class OOAB {
	private String nr;
	private String namn;
	private ArrayList <Dotterbolag> dotterbolagslista = new ArrayList<Dotterbolag>();
	
	public void setOOABnr(String setOOABnr) {
		nr = setOOABnr;
	}
	public String getOOABnr() {
		return nr;
	}
	public void setOOABnamn(String setOOABnamn) {
		namn = setOOABnamn;
	}
	public String getOOABnamn() {
		return namn;
	}
	public ArrayList<Dotterbolag> getDotterbolagslista(){
		return dotterbolagslista;
	}
	public void setDotterbolagslista(ArrayList<Dotterbolag> setDotterbolagslista) {
		dotterbolagslista = setDotterbolagslista;
	}
	public void LaggTillDotterbolag(Dotterbolag nyttDotterbolag) {
		dotterbolagslista.add(nyttDotterbolag);
	}
	public void LaggTillProjektAllt(String dotterNr, Projekt projekt) { //lösning enligt facit "bra"
		Dotterbolag tmp = this.findDotterbolag(dotterNr);
		if(tmp != null) {
			tmp.LaggTillProjekt(projekt);
		}
		
	}
	public Dotterbolag findDotterbolag(String dotterbolagsnr) {
		for(Dotterbolag a: dotterbolagslista) {
			if(a.getDotterBolagNr().equals(dotterbolagsnr))
				return a;
		}
		return null; 
	}
	public double getTotalOOABBudget() {
		double OOABbudget = 0;
			for (Dotterbolag dotterTemp : dotterbolagslista) {
				if(dotterTemp.getTotalBudget() != 0) {
					OOABbudget += dotterTemp.getTotalBudget();
				}
			}
			return OOABbudget;
	}
}

