
public class Projekt {
	
	private String namn;
	private double budget;
	private Dotterbolag projekt�gare;
	
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
	public void setProjekt�gare(Dotterbolag setProjekt�gare) {
		projekt�gare = setProjekt�gare;
	}
	public Dotterbolag getProjekt�gare() {
		return projekt�gare;
	}
}
