package classes;

import java.util.Date;

public class Photographer extends Employee {

	public Photographer(String name, double salario, String nascimento, String position) {
		super(name, salario, nascimento, position);
		
	}
	
		@Override
		public double Bonificacao() {
			
			return super.salario * 0.07;
		}

	
	}
