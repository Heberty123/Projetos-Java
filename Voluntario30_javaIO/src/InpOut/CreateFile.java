package InpOut;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.nio.charset.Charset;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStream fis = System.in;
		Reader r = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(r);
		
		String linha = br.readLine();
		
		
		FileOutputStream fos = new FileOutputStream("file2.txt");
		OutputStreamWriter ro = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(ro);
		
		while (linha != null) {	
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
		}
		
		br.close();
		bw.close();
		
	//	PrintStream bw = new PrintStream("file2.txt");
	//	PrintWriter bw = new PrintWriter(new File("file2.txt"));
		
	//	while (linha != null) {	
	//		System.out.println(linha);
	//		bw.println(linha);
	//		linha = br.readLine();
	//	}
		
		
	}

}
