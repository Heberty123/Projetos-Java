package matricula;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		ConjuntosMatricula conjuntos = new ConjuntosMatricula();

		Matricula mat1 = new Matricula(sdf.parse("12/10/2010"), 24, "Java", 24.90);
		Matricula mat2 = new Matricula(sdf.parse("04/04/1999"), 56, "Python", 54.90);
		
		
		
		conjuntos.adiciona(mat1);
		conjuntos.adiciona(mat2);
		conjuntos.adiciona(new Matricula(sdf.parse("01/09/2004"), 11, "Ruby", 100.90));
		
		System.out.println(conjuntos.mostraTreeset());
		
		System.out.println("\n\n");
		
		System.out.println(conjuntos.mostraHashMap());
		
		conjuntos.remove(3);
		
		System.out.println(conjuntos.mostraTreeset());
		
		System.out.println("\n\n");
		
		System.out.println(conjuntos.mostraHashMap());
		
		conjuntos.remove(2);
		
		System.out.println(conjuntos.mostraTreeset());
		
		System.out.println("\n\n");
		
		System.out.println(conjuntos.mostraHashMap());
	}

}
