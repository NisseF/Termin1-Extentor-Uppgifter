
public class Projekt {
	private String namn;
	private double budget;
	private Dotterbolag tillhör;
	
	public void setProjektNamn(String setProjektNamn) {
		namn = setProjektNamn;
	}
	public String getProjektNamn() {
		return namn;
	}
	public void setProjektBudget(double setProjektBudget) {
		budget = setProjektBudget;
	}
	public double getProjektBudget() {
		return budget;
	}
	public void setTillhör(Dotterbolag setTillhör) {
		tillhör = setTillhör;
	}
	public Dotterbolag getTillhör() {
		return tillhör;
	}
}
