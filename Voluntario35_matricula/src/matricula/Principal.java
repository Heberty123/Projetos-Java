package matricula;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Excepetion.DomainException;

public class Principal {

	public static void main(String[] args) throws ParseException, DomainException{
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ConjuntosMatricula conjuntos = new ConjuntosMatricula();

		Matricula mat1 = new Matricula(sdf.parse("12/10/2010"), "Java", 24.90);
		Matricula mat2 = new Matricula(sdf.parse("04/04/1999"), "Python", 54.90);
		Matricula mat3 = new Matricula(sdf.parse("12/10/2010"), "Jaava", 24.90);
		Matricula mat4 = new Matricula(sdf.parse("04/04/1999"), "Python", 55.90);
		Matricula mat5 = new Matricula(sdf.parse("04/04/1999"), "Pythonn", 54.90);
		Matricula mat6 = new Matricula(sdf.parse("04/04/1999"), "Pythonn", 56.90);
		
		
		
			try {
				conjuntos.adiciona(mat1);
				conjuntos.adiciona(mat2);
				conjuntos.adiciona(mat3);
				conjuntos.adiciona(mat4);
				conjuntos.adiciona(mat5);
				conjuntos.adiciona(new Matricula(sdf.parse("01/09/2004"), "Ruby", 100.90));
			} catch (DomainException e) {
				System.out.println(e);
			}
			


		
		System.out.println(conjuntos.mostraTreeset());
		
		System.out.println("\n\n");
		
	//	System.out.println(conjuntos.mostraHashMap());
		
		conjuntos.remove(2);
		conjuntos.remove(1);
		
		System.out.println(conjuntos.mostraTreeset());
		
		System.out.println("\n\n");
		

		
	}

}
