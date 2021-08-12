package entities;

public class Auxi {

	
	public static int left(int[][]mat, int x) {
		
	int find = 0;
		
		for (int i=0; i<mat.length ; i++) {
			for (int j=0; j<mat[i].length ; i++) {
				
				if(mat[i][j] == x) {
					
					find = mat[i][j];
					
				}
			}
			
		}
		return find;

		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
