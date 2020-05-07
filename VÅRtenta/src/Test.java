
public class Test {
	public static void main(String[] args) {
	
	Parking parkering1 = new Parking();
	
	Parkingspace p1 = new Parkingspace();
	Parkingspace p2 = new Parkingspace();
	Parkingspace p3 = new Parkingspace();
	Parkingspace p4 = new Parkingspace();
	
	Car c1 = new Car();
	Car c2 = new Car();
	
	parkering1.setAddress("Hamngatan 1");
	parkering1.setName("Aqua");
	parkering1.add(p1);
	parkering1.add(p2);
	parkering1.add(p3);
	parkering1.add(p4);
	
	p1.setNbr(1);
	p1.setRent(6000);
	p1.setType("liten");
	p1.setParkingspaceOwner(c1);
	p1.setParkingplaceAddress(parkering1);
	
	p2.setNbr(2);
	p2.setRent(6000);
	p2.setType("liten");
	p2.setParkingspaceOwner(c1);
	p2.setParkingplaceAddress(parkering1);
	
	p3.setNbr(3);
	p3.setRent(10000);
	p3.setType("stor");
	p3.setParkingspaceOwner(c2);
	p3.setParkingplaceAddress(parkering1);
	
	p4.setNbr(4);
	p4.setRent(5000);
	p4.setType("stor");
	p4.setParkingplaceAddress(parkering1);
	
	c1.setRegNbr("ABC123");
	c1.setBrandName("Volvo");
	
	c2.setRegNbr("AAA222");
	c2.setBrandName("SAAB");
	
	for(Parkingspace a : parkering1.getAlAvailableParkingspaces()) {
		System.out.println(a.getNbr());
		
		System.out.println(parkering1.findParkingspaceForCar("ABC123"));
	}
	
	/*System.out.println(parkering1.totalRent());
	
	for(Parkingspace b : parkering1.getParklist()) {
		if(b.getParkingspaceOwner() != null) {
			System.out.println("RegNr: " + b.getParkingspaceOwner().getRegNbr() + ", " + b.getParkingspaceOwner().getBrandName());
		}
	}*/
	
	

	}
}
