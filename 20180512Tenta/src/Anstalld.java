
public class Anstalld {
	private String pnr;
	private String namn;
	private double salary;
	private Dotterbolag arbetsgivare;
	
	public void setPnr(String setPnr) {
		pnr = setPnr;
	}
	public String getPnr() {
		return pnr;
	}
	public void setAnstalldNamn(String setAnstalldNamn) {
		namn = setAnstalldNamn;
	}
	public String getAnstalldNamn() {
		return namn;
	}
	public void setSalary(double setSalary) {
		salary = setSalary;
	}
	public double getSalary() {
		return salary;
	}
	public void setArbetsgivare(Dotterbolag setArbetsgivare) {
		arbetsgivare = setArbetsgivare;
	}
	public Dotterbolag getArbetsgivare() {
		return arbetsgivare;
	}
}
