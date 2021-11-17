import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		File file = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\programação\\java\\voluntario\\oii.txt");
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// sc = new Scanner(file);	
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String row = br.readLine();
			
			while (row != null) {
				
				System.out.println(row);
				row = br.readLine();
			}	
		}
		catch(IOException e) {
			System.out.println("Error : " + e.getMessage());
		}
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
