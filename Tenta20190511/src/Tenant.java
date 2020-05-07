
public class Tenant {
	private String nbr;
	private String name;
	private Mooring hyresägare;
	
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
	public void setHyresägare(Mooring setHyresägare) {
		hyresägare = setHyresägare;
	}
	public Mooring getHyresägare(){
		return hyresägare;
	}
	public String getMarinaName() {
		return hyresägare.getMarinaName();	
		}
	
}
