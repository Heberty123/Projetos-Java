package application;
import java.util.Scanner;
import entities.Auxi;


public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number for row of matriz : ");
		int row = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Enter the number for column of matriz : ");
		int column = sc.nextInt();
		
		int[][] mat = new int [row][row];

		
		for (int i=0; i<row ; i++) {
			for (int j=0; j<row ; i++) {
				
				System.out.println();
				System.out.println("enter the number na linha "+i+" e coluna "+j+" : ");
				mat[i][j]= sc.nextInt();
			}
			
		}
		System.out.println("enter the number na linha "+i+" e coluna "+j+" : ");;
		System.out.println("enter the number na linha "+i+" e coluna "+j+" : ");
		System.out.println("enter the number na linha "+i+" e coluna "+j+" : ");;
		System.out.println("enter the number na linha "+i+" e coluna "+j+" : ");
		
		
		System.out.println();
		System.out.println("Enter the number you want to search for in the matrix : ");
		int x = sc.nextInt();
		
		System.out.println("left of mat : " + Auxi.left(mat,x));
		
		
		
		
		sc.close();
	}

}
