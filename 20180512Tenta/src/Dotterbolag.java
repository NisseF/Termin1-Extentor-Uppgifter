import java.util.ArrayList;

public class Dotterbolag {
	
	private String nr;
	private String namn;
	ArrayList<Anstalld> anställningslista = new ArrayList<Anstalld>();
	ArrayList<Projekt> projektlista = new ArrayList<Projekt>();
	private OOAB moderbolag;
	
	public void setNr(String setNr) {
		nr = setNr;
	}
	public String getNr() {
		return nr;
	}
	public void setDotterbolagsNamn(String setDotterbolagsNamn) {
		namn = setDotterbolagsNamn;
	}
	public String getDotterbolagsNamn() {
		return namn;
	}
	public void setAnställningslista(ArrayList<Anstalld> setAnställningslista) {
		anställningslista = setAnställningslista;
	}
	public ArrayList<Anstalld> getAnställningslista(){
		return anställningslista;
	}
	public void setProjektlista(ArrayList<Projekt> setProjektlista) {
		projektlista = setProjektlista;
	}
	public ArrayList<Projekt> getProjektlista(){
		return projektlista;
	}
	public void setModerbolag(OOAB setModerbolag) {
		moderbolag = setModerbolag;
	}
	public OOAB getModerbolag() {
		return moderbolag;
	}
	public void laggTillAnstalld(Anstalld anstalld) {
		anställningslista.add(anstalld);
	}
	public double totalSalary() {
		double DotterbolagSalary = 0;
		for(Anstalld a : anställningslista) {
			DotterbolagSalary += a.getSalary();
		}
		return DotterbolagSalary;
	}
	public Anstalld hittaAnstalld(String pnr) {
		for(Anstalld a: anställningslista) {
			if(a.getPnr().equals(pnr)) {
				return a;
			}
		}
		return null;
	}

}
