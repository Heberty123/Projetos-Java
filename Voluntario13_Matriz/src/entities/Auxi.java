package entities;

public class Auxi {

	
	public static String toString(int[][]mat, int row, int column) {
		
		int findLeft;
		int findRight;
		int findTop;
		int findBottom;
		
		
		if (column > 0) {
			findLeft = mat[row][column-1];
		}
		else {
			findLeft = 0;
		}
		
		
		if (column < mat[0].length-1) {
			findRight = mat[row][column+1];
		}
		else {
			findRight = 0;
		}
		
		if (row > 0) {
			findTop = mat[row-1][column];
		}
		else {
			findTop = 0;
		}
		
		
		if (row < mat.length-1) {
			findBottom = mat[row+1][column];
		}
		else {
			findBottom = 0;
		}
		
		
		
		return "Left : "+findLeft+
			   "\nRight : "+findRight+
			   "\nTop : "+findTop+
			   "\nBottom : "+findBottom;
	}
}
