import java.util.ArrayList;

public class Agare {
	private String pnr;
	private String namn;
	private ArrayList<Fordon> fordonslista = new ArrayList<Fordon>();
	
	public void setPnr(String setPnr) {
		pnr = setPnr;
	}
	public String getPnr() {
		return pnr;
	}
	public void setNamn(String setNamn) {
		namn = setNamn;
	}
	public String getNamn() {
		return namn;
	}
	public void setFordonlista(ArrayList<Fordon> setFordonlista) {
		fordonslista = setFordonlista;
	}
	public ArrayList<Fordon> getFordonslista(){
		return fordonslista;
	}
	public void laggTillFordon(Fordon fordon) {
		fordonslista.add(fordon);
	}
	public Fordon hittaFordon(String regNr) {
		for(Fordon a : fordonslista) {
			if(a.getRegNr().equals(regNr)) {
				return a;
			}
		}
		return null;	
	}
}
