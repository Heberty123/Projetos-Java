package exercicio12;

public abstract class Contribuintes {

	protected String name;
	protected double annual_income;
	
	public Contribuintes() {
		
	}
	
	public Contribuintes(String name, double annual_income) {
		this.name = name;
		this.annual_income = annual_income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnnual_income() {
		return annual_income;
	}

	public void setAnnual_income(double annual_income) {
		this.annual_income = annual_income;
	}
	
	public abstract double valorImposto();
	
	
	public String toString() {
		return this.name + ": $ " + String.format("%.2f",valorImposto());
	}
	
	
	public double valorTotalImposto(Contribuintes cont) {
		double som = 0;
		som += cont.valorImposto();
		return som;
	}
	
}
