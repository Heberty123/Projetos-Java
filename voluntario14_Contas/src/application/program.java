package application;
import entities.Conta;
import entities.Cliente;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta ContaofGustavo = new Conta();
		Cliente Gustavo = new Cliente();
		
		ContaofGustavo.setAgencia(1234);
		ContaofGustavo.setAgencia(6547);
		
		ContaofGustavo.setTitular(Gustavo);
		
		Gustavo.setName("Gustavo Oliveira");
		Gustavo.setCpf("222-222-222-22");
		Gustavo.setProfissao("Medico");
		
		
		System.out.println(ContaofGustavo.getTitular().getName());
		
		/*  olá mundo  */
		
	}

}
