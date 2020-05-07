
public class Hyrestagare {
	
	private String nr;
	private String namn;
	private Batplats hyr;
	
	public void setHyrestagareNr(String setHyrestagareNr) {
		nr = setHyrestagareNr;
	}
	public String getHyrestagareNr() {
		return nr;
	}
	
	public void setHyrestagareNamn(String setHyrestagareNamn) {
		namn = setHyrestagareNamn;
	}
	public String getHyrestagareNamn() {
		return namn;
	}
	public void setHyresÄgare(Batplats setHyresÄgare) {
		hyr = setHyresÄgare;
	}
	public Batplats getHyresÄgare() {
		return hyr;
	}

}
