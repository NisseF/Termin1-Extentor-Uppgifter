
public class Tenant {
	private String nbr;
	private String name;
	private Mooring hyres�gare;
	
	public void setNbr(String setNbr) {
		nbr = setNbr;
	}
	public String getNbr() {
		return nbr;
	}
	public void setName(String setName) {
		name = setName;
	}
	public String getName() {
		return name;
	}
	public void setHyres�gare(Mooring setHyres�gare) {
		hyres�gare = setHyres�gare;
	}
	public Mooring getHyres�gare(){
		return hyres�gare;
	}
	public String getMarinaName() {
		return hyres�gare.getMarinaName();	
		}
	
}
