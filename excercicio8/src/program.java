import java.util.Scanner;
import java.util.Locale;
import blocos.quartos;

public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.printf("Pensionato%n%n");
        
        
        
        System.out.printf("Digite quantos estudantes desejam alugar quartos : ");
        int qtd_alunos = sc.nextInt();
        
        quartos[] quarto = new quartos[10];
        
        for (int i= 1 ; i<qtd_alunos + 1 ; i++){
            System.out.println();
            System.out.printf("Digite nome de aluno %d : ", i);
            sc.nextLine();
            String name = sc.nextLine();
            System.out.printf("Digite o email do aluno %d : ", i);
            String email = sc.nextLine();
            System.out.print("Qual o quarto foi escolhido por aluno, de 0 até "+ (quarto.length-1) +" ? : ");

            int room = sc.nextInt();
            
            quarto[room] = new quartos(name, email, room);
        }
   
        for (int i= 0 ; i< quarto.length ; i++){           
            if (quarto[i] != null) {
                System.out.println();
                System.out.println("Room : " + i + ": nome - " + quarto[i].getName() + " email : - " + quarto[i].getEmail());
            }
        
        
        
        sc.close();
    }
    
    }
}
