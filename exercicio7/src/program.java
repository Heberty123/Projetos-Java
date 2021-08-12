
import java.util.Locale;
import java.util.Scanner;
import entities.Contas;
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Contas contas;
        
        System.out.println("Conta bancária ");
        System.out.printf("%nDigite número da conta : ");
        int numero_da_conta = sc.nextInt();
        System.out.printf("Digite seu título da conta : ");
        String titular = sc.next();
        double deposito = 0;

        
        System.out.print("Deseja fazer o primeiro depósito? (s/n) : ");
        char resposta = sc.next().charAt(0);
        while (resposta != 'n' && resposta != 's'){
           System.out.print("Resposta inválida, Porfavor digite 's' ou 'n' ! ! ");
           resposta = sc.next().charAt(0);     
        }
        if (resposta == 's'){
        System.out.printf("Quanto deseja depositar na conta?");
        deposito = sc.nextDouble();  
            contas = new Contas(numero_da_conta , titular, deposito);
        }
        
        else {
            contas = new Contas(numero_da_conta, titular, deposito);
        }

        
        
        
        System.out.print("Há mais de 10 anos q vc criou essa conta, você está casado? deseja alterar o títuo da conta? (s/n)");
        resposta = sc.next().charAt(0);
        while (resposta != 'n' && resposta != 's'){
           System.out.print("Resposta inválida, Porfavor digite 's' ou 'n' ! ! ");
           resposta = sc.next().charAt(0);     
        }
        if (resposta == 's'){
            
            System.out.print("Digite o novo título : ");
            sc.nextLine();
            String novotitulo = sc.nextLine();
            contas.setTitular(novotitulo);
            
        }
        
        System.out.printf("%n%nUpdate account data : ");
        System.out.println(contas.toString());
        
        
        System.out.printf("%n%nenter a deposit value : ");
        double dep_value = sc.nextDouble();
        contas.addDeposit(dep_value);
        
        System.out.printf("%nUpdate account data : ");
        System.out.println(contas.toString());
        
        System.out.printf("%n%nEnter a withdraw value : ");
        dep_value = sc.nextDouble();
        contas.withdrawDeposit(dep_value);
        
        System.out.printf("%nUpdate account data : ");
        System.out.println(contas.toString());
        
                
            
        
        sc.close();
    }
    
}
