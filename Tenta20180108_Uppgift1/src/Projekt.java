
public class Projekt {
	private String namn;
	private double budget;
	private Dotterbolag tillh�r;
	
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
	public void setTillh�r(Dotterbolag setTillh�r) {
		tillh�r = setTillh�r;
	}
	public Dotterbolag getTillh�r() {
		return tillh�r;
	}
}
