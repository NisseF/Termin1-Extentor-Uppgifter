import java.util.ArrayList;

public class Dotterbolag {
	
	private String nr;
	private String namn;
	ArrayList<Anstalld> anst�llningslista = new ArrayList<Anstalld>();
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
	public void setAnst�llningslista(ArrayList<Anstalld> setAnst�llningslista) {
		anst�llningslista = setAnst�llningslista;
	}
	public ArrayList<Anstalld> getAnst�llningslista(){
		return anst�llningslista;
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
		anst�llningslista.add(anstalld);
	}
	public double totalSalary() {
		double DotterbolagSalary = 0;
		for(Anstalld a : anst�llningslista) {
			DotterbolagSalary += a.getSalary();
		}
		return DotterbolagSalary;
	}
	public Anstalld hittaAnstalld(String pnr) {
		for(Anstalld a: anst�llningslista) {
			if(a.getPnr().equals(pnr)) {
				return a;
			}
		}
		return null;
	}

}
