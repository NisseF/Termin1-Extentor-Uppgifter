
public class Hyrestagare {
	private String personnummer;
	private String namn;
	private Lägenhet hyresvärd;
	
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
	public void setHyresvärd(Lägenhet setHyresvärd) {
		hyresvärd = setHyresvärd;
	}
	public Lägenhet getHyresvärd() {
		return hyresvärd;
	}
	public String adress() {
		if(getHyresvärd().getHusAdress() != null) {
			return getHyresvärd().getHusAdress();
		}
	return null;
	}
	
}
