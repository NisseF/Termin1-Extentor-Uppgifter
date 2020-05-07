import java.util.ArrayList;

public class Parking {
	private String address;
	private String name;
	private ArrayList<Parkingspace> parklist = new ArrayList<Parkingspace>();
	
	public void setAddress(String setAddress) {
		address = setAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setName(String setName) {
		name = setName;
	}
	public String getName() {
		return name;
	}
	public void setParklist(ArrayList<Parkingspace> setParklist) {
		parklist = setParklist;
	}
	public ArrayList<Parkingspace> getParklist(){
		return parklist;
	}
	
	public void add(Parkingspace p) {
		parklist.add(p);
	}
	
	public Parkingspace find(int nbr) {
		for(Parkingspace a : parklist) {
			if(a.getNbr() == nbr) {
				return a.getNbr();
			}
		}
		return null;
	}
	
	public ArrayList<Parkingspace> findParkingspaceForCar(String regNr){
		ArrayList<Parkingspace> templist = new ArrayList<Parkingspace>();
		for(Parkingspace b : parklist) {
			if(b.getParkingspaceOwner().getRegNbr().equals(regNr)) {
				templist.add(b);
			}
		}
		return templist;
	}
	
	public double totalRent() {
		double totalHyra = 0;
		for(Parkingspace a : parklist) {
			if(a.getParkingspaceOwner() != null) {
				totalHyra += a.getRent();
			}
		}
		return totalHyra;
	}
	
	
	public ArrayList<Parkingspace> getAlAvailableParkingspaces(){
		ArrayList<Parkingspace> templist = new ArrayList<Parkingspace>();
		for(Parkingspace c : parklist) {
			if(c.getParkingspaceOwner() == null) {
				templist.add(c);
			}
		}
		return templist;
	}
	

}
