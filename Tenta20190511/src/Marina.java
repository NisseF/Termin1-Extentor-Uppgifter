import java.util.ArrayList;

public class Marina {
	private String address;
	private String name;
	private ArrayList<Mooring> mooringlist = new ArrayList<Mooring>();
	
	public void setAddress(String setAddress) {
		address = setAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setMarinaName(String setMarinaName) {
		name = setMarinaName;
	}
	public String getMarinaName() {
		return name;
	}
	public void setMooringlist(ArrayList<Mooring> setMooringlist) {
		mooringlist = setMooringlist;
	}
	public ArrayList<Mooring> getMooringlist(){
		return mooringlist;
	}
	public void add(Mooring p) {
		mooringlist.add(p);
	}
	public Mooring find(int nbr) {
		for(Mooring a : mooringlist) {
			if(a.getNbr() == nbr) {
				return a;
			}
		}
		return null;
	}
	public Tenant findTenant(String TenantNbr) {
		for(Mooring temp : mooringlist) {
			for(Tenant a : temp.getTenantlist()) {
				if(a.getNbr().equals(TenantNbr)) {
					return a;
				}
			}
		}
		return null;
	}
	public int nbrOfTenant() {
		int i = 0;
		for(Mooring temp : mooringlist) {
			for(Tenant a :temp.getTenantlist()) {
				i++;	
			}
		}
		return i;	
	}
	
	public ArrayList<Mooring> getAllMooringsByType(String type){
		for(Mooring b: mooringlist) {
			if(b.getType().equals(type)) {
				System.out.println(b.getNbr());
			}
		}
	return null;
	}
	
	
	
}
