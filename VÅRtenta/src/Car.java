import java.util.ArrayList;

public class Car {
	private String regNbr;
	private String brandName;
	private ArrayList<Parkingspace> carPark = new ArrayList<Parkingspace>();
	
	public void setRegNbr(String setRegNbr) {
		regNbr = setRegNbr;
	}
	public String getRegNbr() {
		return regNbr;
	}
	public void setBrandName(String setBrandName) {
		brandName = setBrandName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setCarPark(ArrayList<Parkingspace> setCarPark) {
		carPark = setCarPark;
	}
	public ArrayList<Parkingspace> getCarPark(){
		return carPark;
	}

}
