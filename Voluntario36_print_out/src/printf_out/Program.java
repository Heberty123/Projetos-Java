package printf_out;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		File file = new File("F:\\Documents\\Programação\\Projetos-Java\\Voluntario36_print_out\\textinhos\\valores.txt");
		FileWriter fw = new FileWriter("F:\\\\Documents\\\\Programação\\\\Projetos-Java\\\\Voluntario36_print_out\\\\textinhos\\\\valoresEscritos.txt");
		
		FileReader fr = null;

		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line = br.readLine();
		
		while (line != null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
			
			line = br.readLine();
		}
		
		fr.close();
		br.close();
		bw.close();
		sc.close();
	}

}
