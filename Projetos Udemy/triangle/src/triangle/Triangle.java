/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle;
import java.util.Scanner;
import java.util.Locale;
import entities.TriangleMedidas;
/**
 *
 * @author heber
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Locale.setDefault(Locale.US);
        
Scanner sc = new Scanner(System.in);

TriangleMedidas x,y;

x = new TriangleMedidas();
y = new TriangleMedidas();

System.out.println("Enter the measures of triangle X: ");
x.a = sc.nextDouble();
x.b = sc.nextDouble();
x.c = sc.nextDouble();
System.out.println("Enter the measures of triangle Y: ");
y.a = sc.nextDouble();
y.b = sc.nextDouble();
y.c = sc.nextDouble();

double areaX = x.area();
double areaY = y.area();

System.out.printf("Triangle X area: %.4f%n", areaX);
System.out.printf("Triangle Y area: %.4f%n", areaY);
if (areaX > areaY) {
System.out.println("Larger area: X");
}
else {
System.out.println("Larger area: Y");
}
sc.close();
    }
    
}
