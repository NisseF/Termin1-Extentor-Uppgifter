import java.util.ArrayList;

public class Hamn {
	private String adress;
	private String namn;
	private ArrayList<Batplats> hamnensBatplatser = new ArrayList<Batplats>();
	
	public void setHamnAdress(String setHamnAdress) {
		adress = setHamnAdress;
	}
	public String getHamnAdress() {
		return adress;
	}
	public void setHamnNamn(String setBatNamn) {
		namn = setBatNamn;
	}
	public String getHamnNamn() {
		return namn;
	}
	public void setHamnensBatplatser(ArrayList<Batplats> setHamnensBatplatser) {
		hamnensBatplatser = setHamnensBatplatser;
	}
	public ArrayList<Batplats> getHamnensbatplatser(){
		return hamnensBatplatser;
	}
	public void laggTillBatplats(Batplats nyBatplats) {
		hamnensBatplatser.add(nyBatplats);
	}
	public Batplats HittaBatplats(int nr) {
		for(Batplats a : hamnensBatplatser) {
			if(a.getBatplatsNr() == nr) {
				return a;
			}
		}
	return null;
	}
	public void laggTillHyrestagare(Hyrestagare h, int batplatsNr) {
		Batplats tmp = HittaBatplats(batplatsNr);
			if (tmp!= null) {
				tmp.laggTillHyrestgare(h);
			}	
	}
	public int hittaHyrestagareBatplats(String hyrestagareNr) {
		for(Batplats b: hamnensBatplatser) {
			Hyrestagare H = b.hittaHyrestagare(hyrestagareNr);
			if(H != null) {
				return b.getBatplatsNr();
			}
		}
	return 0; 
	}
	

	public int hittaHyretagareBatplats(String hyrestagareNr) { // Variant på den ovanför. 
		for(Batplats a : hamnensBatplatser) {
			for(Hyrestagare b : a.getHyresLista()) {
				if(b.getHyrestagareNr().equals(hyrestagareNr)){
					return a.getBatplatsNr();
				}
			}
		}
		return 0;
	}
	

	}


