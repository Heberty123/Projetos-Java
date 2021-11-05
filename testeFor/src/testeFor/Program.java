package testeFor;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = new int[9][9];
		int valor = 10;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				
				valor+= 1;
				
				matrix[i][j] = valor;
				
			
			
			
			}
		}	
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				
			System.out.print(matrix[i][j] + " ");
				
				
			
			
			
			}
			
			System.out.println();
		}
	}

}
