
public class Hyrestagare {
	private String personnummer;
	private String namn;
	private L�genhet hyresv�rd;
	
	public void setHyrestagareNamn(String setHyrestagareNamn) {
		namn = setHyrestagareNamn;
	}
	public String getHyrestagareNamn() {
		return namn;
	}
	public void setPersonnummer(String setPersonnummer) {
		personnummer = setPersonnummer;
	}
	public String getPersonnummer() {
		return personnummer;
	}
	public void setHyresv�rd(L�genhet setHyresv�rd) {
		hyresv�rd = setHyresv�rd;
	}
	public L�genhet getHyresv�rd() {
		return hyresv�rd;
	}
	public String adress() {
		if(getHyresv�rd().getHusAdress() != null) {
			return getHyresv�rd().getHusAdress();
		}
	return null;
	}
	
}
