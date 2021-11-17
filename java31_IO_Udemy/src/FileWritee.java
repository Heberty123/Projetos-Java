import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileWritee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		File file1 = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\programação\\java\\voluntario\\oii.txt");
		File file = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\programação\\java\\voluntario\\output.txt");

		
		
		try(BufferedReader br = new BufferedReader(new FileReader(file1))){
			String line = br.readLine();
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while(line != null) {
				
				System.out.println(line);
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
