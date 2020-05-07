
public class Projekt {
	
	private String namn;
	private double budget;
	private Dotterbolag projektägare;
	
	public void setProjektNamn(String setProjektNamn) {
		namn = setProjektNamn;
	}
	public String getProjektNamn() {
		return namn;
	}
	public void setBudget(double setBudget) {
		budget = setBudget;
	}
	public double getBudget() {
		return budget;
	}
	public void setProjektägare(Dotterbolag setProjektägare) {
		projektägare = setProjektägare;
	}
	public Dotterbolag getProjektägare() {
		return projektägare;
	}
}
