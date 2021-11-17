import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program_MelhorTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\programação\\java\\voluntario\\oii.txt");

		
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String row = br.readLine();
			
			while (row != null) {
				
				System.out.println(row);
				row = br.readLine();
			}	
		}
		catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		
	}

}
