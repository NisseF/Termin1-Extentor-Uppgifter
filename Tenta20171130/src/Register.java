import java.util.ArrayList;

public class Register {
	
	private ArrayList<Fordon> fordonsregister = new ArrayList<Fordon>();
	
	public void setFordonsregister(ArrayList<Fordon> setFordonsregister) {
		fordonsregister = setFordonsregister;
	}
	public ArrayList<Fordon> getFordonregister(){
		return fordonsregister;
	}
	
	public void laggTillFordonRegister(Fordon fordon) {
		fordonsregister.add(fordon);
	}
	public Fordon hittaFordonRegister(String regNr) {
		for(Fordon b : fordonsregister) {
			if(b.getRegNr().contentEquals(regNr))
				return b;
		}
	return null;	
	}

	public void skrivutAgarensAllaFordon(String pnr) {
		for(Fordon a : fordonsregister) {
			if(a.getÄgsAv().getPnr().equals(pnr)) {
				System.out.println(a.getRegNr() + " " + a.getMarke());
			}
		}
	}
	
	
}
