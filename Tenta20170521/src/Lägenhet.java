import java.util.ArrayList;

public class L�genhet {
	private int nummer;
	private int hyra;
	private int yta;
	private Hus tillh�r;
	private ArrayList<Hyrestagare> hyreslista = new ArrayList<Hyrestagare>();
	
	public void setNummer(int setNummer) {
		nummer = setNummer;
	}
	public int getNummer() {
		return nummer;
	}
	public void setHyra(int setHyra) {
		hyra = setHyra;
	}
	public int getHyra() {
		return hyra;
	}
	public void setYta(int setYta) {
		yta = setYta;
	}
	public int getYta() {
		return yta;
	}
	public void setTillh�r(Hus setTillh�r) {
		tillh�r = setTillh�r;
	}
	public Hus getTillh�r() {
		return tillh�r;
	}
	
	public void setHyreslista(ArrayList<Hyrestagare> setHyreslista) {
		hyreslista = setHyreslista;
	}
	public ArrayList<Hyrestagare> getHyreslista(){
		return hyreslista;
	}
	public void laggTillHyrestagare(Hyrestagare person) {
		hyreslista.add(person);
	}
	public Hyrestagare hittaHyrestagare(String pnr) {
		for(Hyrestagare b : hyreslista) {
			if(b.getPersonnummer().equals(pnr))
				return b;
		}
	return null;	
	}
	public String getHusAdress() {
	 return getTillh�r().getAddress();
	}
		
	}


