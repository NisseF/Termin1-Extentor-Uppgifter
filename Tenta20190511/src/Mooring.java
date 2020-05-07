import java.util.ArrayList;

public class Mooring {
	private int nbr;
	private double rent;
	private String type;
	private Marina tillh�r;
	private ArrayList<Tenant> tenantlist = new ArrayList<Tenant>();
	
	public void setNbr(int setNbr) {
		nbr = setNbr;
	}
	public int getNbr() {
		return nbr;
	}
	public void setRent(double setRent) {
		rent = setRent;
	}
	public double getRent() {
		return rent;
	}
	public void setType(String setType) {
		type = setType;	
	}
	public String getType() {
		return type;
	}
	public void setTenantlist(ArrayList<Tenant> setTenantlist) {
		tenantlist = setTenantlist;
	}
	public ArrayList<Tenant> getTenantlist(){
		return tenantlist;
	}
	public void setTillh�r(Marina setTillh�r) {
		tillh�r = setTillh�r;
	}
	public Marina getTillh�r() {
		return tillh�r;
	}
	public void addTenant(Tenant tenant) {
		tenantlist.add(tenant);
	}
	public Tenant findTenant(String nbr) {
		for(Tenant a : tenantlist) {
			if(a.getNbr().equals(nbr)) {
				return a;
			}	
		}
		return null;
	}
	public String getMarinaName() {
		return this.tillh�r.getMarinaName();
	}

	
	
	
	
	
	
	
}
