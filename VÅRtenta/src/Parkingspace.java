
public class Parkingspace {
	private int nbr;
	private double rent;
	private String type;
	private Car parkingspaceOwner;
	private Parking parkingplaceAddress;
	
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
	public void setParkingspaceOwner(Car setParkingspaceOwner) {
		parkingspaceOwner = setParkingspaceOwner;
	}
	public Car getParkingspaceOwner() {
		return parkingspaceOwner;
	}
	public void setParkingplaceAddress(Parking setParkingplaceAddress) {
		parkingplaceAddress = setParkingplaceAddress;
	}
	public Parking getParkingplaceAddress() {
		return parkingplaceAddress;
	}
	public void addCar(Car c) {
		if(this.getParkingspaceOwner().isEmpty()) {
			this.setParkingspaceOwner(c);
		}
	}
	public String getParkingName() {
		if(this.getParkingplaceAddress() != null) {
			return this.getParkingplaceAddress().getName();
		}
	return null;	
	}
	
}
