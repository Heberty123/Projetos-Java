package exercicio12;

public class physical_person extends Contribuintes {

	
	private double health_expenditure;
	
	
	public physical_person() {
		super();
	}
		
	
	public physical_person(String name, double annual_income, double health_expenditure) {
		super(name, annual_income);
		this.health_expenditure = health_expenditure;
	}


	public double getHealth_expenditure() {
		return health_expenditure;
	}


	public void setHealth_expenditure(double health_expenditure) {
		this.health_expenditure = health_expenditure;
	}


	@Override
	public double valorImposto() {
		if(super.annual_income < 20000.00) {
			return (super.annual_income * 0.15) - (this.health_expenditure * 0.5);
		} else {
			return (super.annual_income * 0.25) - (this.health_expenditure * 0.5);
		}
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
		//return super.name + ": $ " + String.format("%.2f",valorImposto());
	}

}
