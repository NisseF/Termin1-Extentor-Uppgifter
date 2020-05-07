import java.util.ArrayList;

public class Hus {
	private String address;
	private int inkopspris;
	private ArrayList<L�genhet> bost�der = new ArrayList<L�genhet>();
	
	public void setAddress(String setAddress) {
		address = setAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setInkopspris(int setInkopspris) {
		inkopspris = setInkopspris;
	}
	public int getInkopspris() {
		return inkopspris;
	}
	public void setBost�der(ArrayList<L�genhet> setBost�der) {
		bost�der = setBost�der;
	}
	public ArrayList<L�genhet> getBost�der(){
		return bost�der;
	}
	public void LaggTillLagenhet(L�genhet nyL�genhet) {
		bost�der.add(nyL�genhet);
	}
	public L�genhet hittaLagenhet(int nr) {
		for(L�genhet a : bost�der) {
			if(a.getNummer() == nr)
				return a;
		}
	return null;	
	}
	public L�genhet vilkenLagenhetHyrHyrestagaren(String pnr) {
		for(L�genhet a : bost�der) {
			for(Hyrestagare b : a.getHyreslista())
				if(b.getPersonnummer().equals(pnr)) {
					return b.getHyresv�rd();
				}
		}
	return null;
	}
	
	
	public ArrayList<Hyrestagare> allaHyrestagareMedHyraOver(int belopp){ // Denna �r knas
		ArrayList<Hyrestagare> tempHyresLista = new ArrayList<Hyrestagare>();
			for(L�genhet TempL�genhet : bost�der) {
					if(TempL�genhet.getHyra() >= belopp) {
						for(Hyrestagare b : TempL�genhet.getHyreslista()) {
							tempHyresLista.add(b);
							
						}
					}
			}
			return tempHyresLista;			
	}
			
	public void printHyrestagare(int lagNbr) {
		for(L�genhet a : bost�der) {
			if (a.getNummer() == lagNbr) {
				for(Hyrestagare b : a.getHyreslista()) {
					System.out.println(b.getPersonnummer() + " " + b.getHyrestagareNamn());
				}
			}
		}
	}
	
	public ArrayList<Hyrestagare> vemHyrLagenhet(int nummer){
		ArrayList<Hyrestagare> templist = new ArrayList<Hyrestagare>();
			for(L�genhet a : bost�der) {
				if(a.getNummer() == nummer) {
					for(Hyrestagare b : a.getHyreslista()) {
						templist.add(b);
					}
				}
			}
		return templist;	
	}
	
	
}