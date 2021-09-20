package entities;


public abstract class People {

	private String name;
	private int age;
	protected double wage;
	
	public People() {
		
	}
	

	public People(String name, int age, double wage) {
		super();
		this.name = name;
		this.age = age;
		this.wage = wage;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public String toString() {
		return this.name + " idade: " + this.age + " sal�rio: " + this.wage;
	}
	



	

}
