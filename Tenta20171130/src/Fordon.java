
public class Fordon {
	private String marke;
	private String regNr;
	private int arsmodell;
	private Agare ägsAv;
	private Register tillhör;
	
	public void setMarke(String setMarke) {
		marke = setMarke;
	}
	public String getMarke() {
		return marke;
	}
	public void setRegNr(String setRegNr) {
		regNr = setRegNr;
	}
	public String getRegNr() {
		return regNr;
	}
	public void setArsmodell(int setArsmodell) {
		arsmodell = setArsmodell;
	}
	public int getArsmodell() {
		return arsmodell;
	}
	public void setÄgsAv(Agare setÄgsAv) {
		ägsAv = setÄgsAv;
	}
	public Agare getÄgsAv() {
		return ägsAv;
	}
	public void setTillhör(Register setTillhör) {
		tillhör = setTillhör;
	}
	public Register getTillhör() {
		return tillhör;
	}


}
