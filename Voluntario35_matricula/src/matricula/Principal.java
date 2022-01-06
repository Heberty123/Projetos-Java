package matricula;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Excepetion.DomainException;

public class Principal {

	public static void main(String[] args) throws ParseException  {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ConjuntosMatricula conjuntos = new ConjuntosMatricula();

		try {
			conjuntos.adiciona(new Matricula(sdf.parse("04/04/1999"), "Java", 24.90));
			conjuntos.adiciona(new Matricula(sdf.parse("04/04/1999"), "Pyython", 54.90));
			conjuntos.adiciona(new Matricula(sdf.parse("04/04/1999"), "Java", 24.90));
			conjuntos.adiciona(new Matricula(sdf.parse("04/04/1999"), "Pythonn", 54.90));
			conjuntos.adiciona(new Matricula(sdf.parse("04/04/1999"), "Python", 54.90));
			conjuntos.adiciona(new Matricula(sdf.parse("04/04/1999"), "Ruby", 100.90));
			conjuntos.adiciona(new Matricula(sdf.parse("04/04/1999"), "Rubyy", 100.90));
			
		}catch(DomainException e) {
			System.out.println(e);
		}


		
		System.out.println(conjuntos.mostraTreeset());
		System.out.println(conjuntos.mostraHashMap());
		
		System.out.println("\n\n");
		
	//	System.out.println(conjuntos.mostraHashMap());
		
		conjuntos.remove(3);
		
		System.out.println(conjuntos.mostraTreeset());
		
		System.out.println("\n\n");
		
	//	System.out.println(conjuntos.mostraHashMap());
		
		conjuntos.remove(2);
		
		System.out.println(conjuntos.mostraTreeset());
		
		System.out.println("\n\n");
		
	//	System.out.println(conjuntos.mostraHashMap());
		
		
	}

}
