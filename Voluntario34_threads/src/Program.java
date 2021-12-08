import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		long result = 0;
		

		System.out.println("Vou rodar a thread, vejam: ");
		
		System.out.print("Digite primeiro valor para multiplicação: ");
		long primeiro = sc.nextInt();
		
		System.out.print("Digite segundo valor para multiplicação: ");
		long segundo = sc.nextInt();
		
		long inicio = 0;
		
		if(primeiro > 10000 && segundo > 10000) {
			
	        inicio = System.currentTimeMillis();
			
			long aux = primeiro/3;
			long aux2 = segundo/3;
			
			PrimeiroTheard pt = new PrimeiroTheard(aux, aux2);
			Thread thread = new Thread(pt);
			thread.start();
			
			
		}
		else {
			
	        inicio = System.currentTimeMillis();
			
			for (long i = 1 ; i<= primeiro ; i++) {
				for (long j = 1 ; j<= segundo ; j++) {
					result += 1;
				}
			}
			
		}

		
		System.out.printf("\n\nO resultado da multiplicação foi: %d", result);
		
		
        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("\n\nTempo gasto: " + tempoDeExecucao);
		
		sc.close();
	}

}
