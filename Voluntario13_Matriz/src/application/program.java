package application;
import java.util.Scanner;

import entities.Auxi;


public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite row : ");
		int row = sc.nextInt();
		
		System.out.println("Digite column : ");
		int column = sc.nextInt();
		
		int[][]mat = new int[row][column]; 
		
		
		System.out.println();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				
				mat[i][j] = sc.nextInt();
			}
			
		}
		
		System.out.println();
		System.out.print("Enter the number to find in matriz : ");
		int x = sc.nextInt();
		
		System.out.println();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				
				if(mat[i][j] == x) {
					
					System.out.println();
					
					System.out.println("Position : "+i+","+j);
					System.out.println(Auxi.toString(mat, i, j));
					
				}
				
				
				
			}
			
		}
		
		
		
		sc.close();
	}

}
