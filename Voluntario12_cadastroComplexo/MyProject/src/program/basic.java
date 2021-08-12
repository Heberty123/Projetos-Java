
package program;
import java.util.Scanner;
import entities.cadastro;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		System.out.println("*******Sele��o por curso********");
		System.out.println();
		System.out.println("Se inscreva aqui abaixo : ");
		
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("digite o nome do canditado : ");
		String name = sc.nextLine();
		System.out.println("Sua idade : ");
		int idade = sc.nextInt();
		System.out.println("Seu CPF : ");
		int cpf = sc.nextInt();
                
                Cadastro cadastro = new cadastro();
		
		System.out.println(cadastro.TiposCurso());
		
		
		
		sc.close();
	}

}
