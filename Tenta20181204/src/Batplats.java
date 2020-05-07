import java.util.ArrayList;

public class Batplats {
	
	private int nr;
	private double hyra;
	private Hamn tillhör; 
	private ArrayList<Hyrestagare> hyresLista = new ArrayList<Hyrestagare>();
	
	public void setBatplatsNr(int setBatplatsNr) {
		nr = setBatplatsNr;
	}
	public int getBatplatsNr() {
		return nr;
	}
	public void setHyra(double setHyra) {
		hyra = setHyra;
	}
	public double getHyra() {
		return hyra;
	}
	public void setTillhör(Hamn setTillhör) {
		tillhör = setTillhör;
	}
	public Hamn getTillhör() {
		return tillhör;
	}
	public ArrayList<Hyrestagare> getHyresLista(){
		return hyresLista;
	}
	public void setHyresLista(ArrayList<Hyrestagare> setHyresLista) {
		hyresLista = setHyresLista;
	}
	public void laggTillHyrestgare(Hyrestagare nyHyrestagare) {
		hyresLista.add(nyHyrestagare);
	}
	public Hyrestagare hittaHyrestagare(String nr) {
		for(Hyrestagare a : hyresLista) {
			if(a.getHyrestagareNr().equals(nr)) {
				return a;
			}		
		}
	return null;
	}
	
}
