package Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

			Scanner leia = new Scanner(new File("file2.txt"));
			
			
			
			while (leia.hasNextLine()) {
				System.out.println(leia.nextLine());
			}
			
			
	}

}
