
public class Anstalld {
	private String pnr;
	private String name; 
	private Dotterbolag anställning;
	
	public void SetPnr(String nyPnr) {
		pnr = nyPnr;
	}
	public String getPnr() {
		return pnr;
	}
	public void setAnstalldNamn(String AnstalldNamn) {
		name = AnstalldNamn;
	}
	public void setAnställning(Dotterbolag setAnställning) {
		anställning = setAnställning;
	}
	public Dotterbolag getAnställning() {
		return anställning;
	}

}