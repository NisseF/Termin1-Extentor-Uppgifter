import java.util.ArrayList;

public class Hus {
	private String address;
	private int inkopspris;
	private ArrayList<Lägenhet> bostäder = new ArrayList<Lägenhet>();
	
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
	public void setBostäder(ArrayList<Lägenhet> setBostäder) {
		bostäder = setBostäder;
	}
	public ArrayList<Lägenhet> getBostäder(){
		return bostäder;
	}
	public void LaggTillLagenhet(Lägenhet nyLägenhet) {
		bostäder.add(nyLägenhet);
	}
	public Lägenhet hittaLagenhet(int nr) {
		for(Lägenhet a : bostäder) {
			if(a.getNummer() == nr)
				return a;
		}
	return null;	
	}
	public Lägenhet vilkenLagenhetHyrHyrestagaren(String pnr) {
		for(Lägenhet a : bostäder) {
			for(Hyrestagare b : a.getHyreslista())
				if(b.getPersonnummer().equals(pnr)) {
					return b.getHyresvärd();
				}
		}
	return null;
	}
	
	
	public ArrayList<Hyrestagare> allaHyrestagareMedHyraOver(int belopp){ // Denna är knas
		ArrayList<Hyrestagare> tempHyresLista = new ArrayList<Hyrestagare>();
			for(Lägenhet TempLägenhet : bostäder) {
					if(TempLägenhet.getHyra() >= belopp) {
						for(Hyrestagare b : TempLägenhet.getHyreslista()) {
							tempHyresLista.add(b);
							
						}
					}
			}
			return tempHyresLista;			
	}
			
	public void printHyrestagare(int lagNbr) {
		for(Lägenhet a : bostäder) {
			if (a.getNummer() == lagNbr) {
				for(Hyrestagare b : a.getHyreslista()) {
					System.out.println(b.getPersonnummer() + " " + b.getHyrestagareNamn());
				}
			}
		}
	}
	
	public ArrayList<Hyrestagare> vemHyrLagenhet(int nummer){
		ArrayList<Hyrestagare> templist = new ArrayList<Hyrestagare>();
			for(Lägenhet a : bostäder) {
				if(a.getNummer() == nummer) {
					for(Hyrestagare b : a.getHyreslista()) {
						templist.add(b);
					}
				}
			}
		return templist;	
	}
	
	
}