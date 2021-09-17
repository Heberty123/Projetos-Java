package exercicio12;

public class Legal_person extends Contribuintes {

	private int number_of_employer;
	
	public Legal_person() {
		super();
	}
	
	
	public Legal_person(String name, double annual_income, int number_of_employer) {
		super(name, annual_income);
		this.number_of_employer = number_of_employer;
	}


	public int getNumber_of_employer() {
		return number_of_employer;
	}


	public void setNumber_of_employer(int number_of_employer) {
		this.number_of_employer = number_of_employer;
	}



	
	@Override
	public double valorImposto() {
		
		if(number_of_employer > 10) {
			return super.annual_income * 0.14;
		}else {
			return super.annual_income * 0.16;
		}
		
	}




	@Override
	public String toString() {
		return super.toString();
		//return super.name + ": $ " + String.format("%.2f",valorImposto());
	}}
