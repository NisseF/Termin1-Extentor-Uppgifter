
public class Testmetod {
	public static void main(String[] args) {
		
		Marina Marina1 = new Marina();
		
		Mooring Mooring1 = new Mooring();
		Mooring Mooring2 = new Mooring();
		Mooring Mooring3 = new Mooring();
		Mooring Mooring4 = new Mooring();
		
		Tenant t1 = new Tenant();
		Tenant t2 = new Tenant();
		Tenant t3 = new Tenant();
		Tenant t4 = new Tenant();
		Tenant t5 = new Tenant();
		Tenant t6 = new Tenant();
		
		Marina1.setAddress("Hamngatan 1");
		Marina1.setMarinaName("Aqua");
		Marina1.add(Mooring1);
		Marina1.add(Mooring2);
		Marina1.add(Mooring3);
		Marina1.add(Mooring4);
		
		Mooring1.setNbr(1);
		Mooring1.setRent(12000);
		Mooring1.setType("Large");
		Mooring1.setTillhör(Marina1);
		Mooring1.addTenant(t1);
		Mooring1.addTenant(t2);
		
		Mooring2.setNbr(2);
		Mooring2.setRent(10000);
		Mooring2.setType("Medium");
		Mooring2.setTillhör(Marina1);
		Mooring1.addTenant(t3);
		Mooring1.addTenant(t4);
		
		Mooring3.setNbr(3);
		Mooring3.setRent(8000);
		Mooring3.setType("Small");
		Mooring3.setTillhör(Marina1);
		Mooring1.addTenant(t5);
		Mooring1.addTenant(t6);
		
		Mooring4.setNbr(4);
		Mooring4.setRent(9000);
		Mooring4.setType("Medium");
		Mooring4.setTillhör(Marina1);
		
		t1.setNbr("h1");
		t1.setName("Mats");
		t1.setHyresägare(Mooring1);
		
		t2.setNbr("h2");
		t2.setName("Viktoria");
		t2.setHyresägare(Mooring1);
		
		t3.setNbr("h3");
		t3.setName("Anders");
		t3.setHyresägare(Mooring2);
		
		t4.setNbr("h4");
		t4.setName("Anna");
		t4.setHyresägare(Mooring2);
		
		t5.setNbr("h5");
		t5.setName("Eva");
		t5.setHyresägare(Mooring3);
		
		t6.setNbr("h6");
		t6.setName("Sven");
		t6.setHyresägare(Mooring3);
		
		
		System.out.println(Marina1.nbrOfTenant());
		
		System.out.println(t4.getMarinaName());
		
		Marina1.getAllMooringsByType("Medium");
		
	}
}
