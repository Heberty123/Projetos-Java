package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//Fluxo de Entrada com Arquivo
		
	//	OutputStream fos = new FileOutputStream("tes2.txt");
	//	Writer osw = new OutputStreamWriter(fos);
	//	BufferedWriter bw  = new BufferedWriter(osw);
		
	//	BufferedWriter bw  = new BufferedWriter(new FileWriter("tes2.txt"));
		
	//	PrintStream ps = new PrintStream("tes2.txt");
		
		PrintWriter ps = new PrintWriter("tes2.txt");
		
		ps.println("Inglaterra (em ingl�s: England) � uma das na��es constituintes do Reino Unido.[2][3][4] O pa�s faz fronteira com a Esc�cia ao norte");
		ps.println();
		ps.println();
		ps.println("A �rea agora chamada de Inglaterra foi habitada por seres humanos pela primeira vez durante o per�odo Paleol�tico Superior, mas o seu\r\n");
		
		
		ps.close();
	}

}
