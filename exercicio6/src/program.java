
import java.util.Locale;
import java.util.Scanner;
import entities.Product;
public class program {
public static void main(String[] args) {
    
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
    
 System.out.println()
 System.out.print("Bem vindo ! Porfavor digite seu nome : ");
 sc.nextLine();
 String nameUsu = sc.nextLine();

System.out.println("Enter product data: ");
System.out.print("olá " + nameUsu + ", digite o Name do produto:");
String name = sc.nextLine();
System.out.print("Price: ");
double price = sc.nextDouble();

Product product = new Product(name, price);

System.out.println();
System.out.println("Product data: " + product); //Aqui coloquei product, pois java automaticamente vai procurar dentro dessa classe, o método toString.
System.out.println();
System.out.print("Enter the number of products to be added in stock: ");
int quantity = sc.nextInt();
product.addProducts(quantity);
System.out.println("Porfavor digite novamente seu nome kkkk : ");
sc.nextLine();
String name1 = sc.nextLine();
System.out.println();
System.out.println("Updated data: " + product);
System.out.println();
System.out.print("Enter the number of products to be removed from stock: ");
quantity = sc.nextInt();
product.removeProducts(quantity);
System.out.println();
System.out.println("Updated data: " + product);
sc.close();
}
}
