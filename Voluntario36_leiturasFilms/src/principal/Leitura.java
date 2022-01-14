package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\Projetos-Java\\Voluntario36_leiturasFilms"
				+ "\\texto.txt");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(null, "C:\\Users\\heber\\OneDrive\\Documentos\\programação\\Projetos-Java\\Voluntario36_leiturasFilms"
				+ "\\texto.txt"));
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(null, "test.txt"));
		
		String line = reader.readLine();
		
		while(line != null) {
			System.out.println(line);
			
			line = reader.readLine();
		}
		
	/*	
		FileWriter os = new FileWriter("test.txt");  
		  Scanner myReader = new Scanner(file);
		  BufferedWriter out = null;
	      while (myReader.hasNextLine()) {
	        
	    	  out = new BufferedWriter(os);
	    	  out.write("oi");
	    	  
	      }

	      myReader.close();
	      os.close();
	      out.close();
	      
	    */
	}

}
