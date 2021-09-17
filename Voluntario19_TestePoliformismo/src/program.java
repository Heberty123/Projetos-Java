import entities.Funcionario;
import entities.Gerente;

public class program {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Heberty", 3620373, 1234);
		
		Gerente g1 = new Gerente("Aline", 65747, 3421, 7654);
		
		
		System.out.println(f.getBonificacao());
		System.out.println(g1.getBonificacao());
		
		

	}

}
