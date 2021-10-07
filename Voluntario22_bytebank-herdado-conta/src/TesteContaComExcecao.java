
public abstract class TesteContaComExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        ContaCorrente cc = new ContaCorrente(111, 111);
		        cc.deposita(100.0);

		        ContaPoupanca cp = new ContaPoupanca(222, 222);
		        cp.deposita(200.0);

		        try {
		        cc.transfere(110.0, cp);
		        }
		        catch(SaldoInsuficienteException ex) {
		        	System.out.println(ex.getMessage());
		        	ex.printStackTrace();
		        }
		        
		        
		        System.out.println("CC: " + cc.getSaldo());
		        System.out.println("CP: " + cp.getSaldo());
		    }
		
	}


