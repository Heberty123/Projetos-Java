package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File source = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\Projetos-Java\\exercicio16\\source.txt");
		File destiny = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\Projetos-Java\\exercicio16\\out\\Summary.csv");
		
		FileReader fr = null;
		BufferedReader br = null;
			
		try {
			fr = new FileReader(source);
			br = new BufferedReader(fr);	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
		try {
			
			boolean sucess = new File("C:\\Users\\heber\\OneDrive\\Documentos\\programação\\Projetos-Java\\exercicio16" + "\\out").mkdir();
			FileWriter fw = new FileWriter(destiny);
			BufferedWriter bw = new BufferedWriter(fw);
			
			String line = br.readLine();
			while (line != null){
				
				String [] lines = line.split(",");
				
				lines[1].replace
				
			//	for(String string: lines) {
			//		string.replaceAll("\s+"," ");
			//	}
				
				
				double stringdouble = Double.parseDouble(lines[1]);
				double stringint = Double.parseDouble(lines[2]);
				 
				bw.write(lines[0] + ", " + stringdouble * stringint);
				bw.newLine();
				line = br.readLine();
			}
			
			bw.close();
			br.close();
			fr.close();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
