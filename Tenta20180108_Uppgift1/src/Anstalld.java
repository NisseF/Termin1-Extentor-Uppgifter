
public class Anstalld {
	private String pnr;
	private String name; 
	private Dotterbolag anst�llning;
	
	public void SetPnr(String nyPnr) {
		pnr = nyPnr;
	}
	public String getPnr() {
		return pnr;
	}
	public void setAnstalldNamn(String AnstalldNamn) {
		name = AnstalldNamn;
	}
	public void setAnst�llning(Dotterbolag setAnst�llning) {
		anst�llning = setAnst�llning;
	}
	public Dotterbolag getAnst�llning() {
		return anst�llning;
	}

}