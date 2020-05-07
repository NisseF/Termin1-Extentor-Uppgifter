import java.util.ArrayList;

public class OOAB {
	private String nr;
	private String namn;
	private ArrayList<Dotterbolag> dotterbolagslista = new ArrayList<Dotterbolag>();
	
	public void setOOABnr(String setOOABnr) {
		nr = setOOABnr;
	}
	public String getOOABnr() {
		return nr;
	}
	public void setOOABnamn(String setOOABnamn) {
		namn = setOOABnamn;
	}
	public String getOAABnamn() {
		return namn;
	}
	public void setDotterbolagslista(ArrayList<Dotterbolag> setDotterbolagslista) {
		dotterbolagslista = setDotterbolagslista;
	}
	public ArrayList<Dotterbolag> getDotterbolaglista(){
		return dotterbolagslista;
	}
	public void laggTillDotterbolag(Dotterbolag d) {
		dotterbolagslista.add(d);
	}
	public void laggTillAnstalld(String dotterNr, Anstalld anstalld) {
		Dotterbolag tmp = this.hittaDotterbolag(dotterNr);
				if(tmp != null) {
					tmp.laggTillAnstalld(anstalld);
				}
	}
	public Dotterbolag hittaDotterbolag(String nr) {
		for(Dotterbolag b : dotterbolagslista) {
			if(b.getNr().equals(nr)) {
				return b;
			}
		}
		return null;
	}
	public double totalOOABSalary() {
		double totalsaly = 0;
		for(Dotterbolag b : dotterbolagslista) {
			totalsaly += b.totalSalary();
		}
		return totalsaly;
	}
	public Anstalld hittaAnstalld(String pnr) {
		for(Dotterbolag a : dotterbolagslista) {
			for(Anstalld b: a.getAnställningslista()) {
				if(b.getPnr().equals(pnr)) {
					return b;
				}
			}
		}
	return null;	
	}
	
	public void LäggtillAnstalld(String dotterNr, Anstalld anstalld) {
		for(Dotterbolag a : dotterbolagslista) {
			if(a.getNr().equals(dotterNr)) {
				a.getAnställningslista().add(anstalld);
			}
		}
	}

}
