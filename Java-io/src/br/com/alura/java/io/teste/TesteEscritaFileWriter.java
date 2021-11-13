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
import java.io.Reader;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		//Fluxo de Entrada com Arquivo
		
	//	OutputStream fos = new FileOutputStream("tes2.txt");
	//	Writer osw = new OutputStreamWriter(fos);
	//	BufferedWriter bw  = new BufferedWriter(osw);
		
		BufferedWriter bw  = new BufferedWriter(new FileWriter("tes2.txt"));
		
		bw.write("Inglaterra (em ingl�s: England) � uma das na��es constituintes do Reino Unido.[2][3][4] O pa�s faz fronteira com a Esc�cia ao norte");
		bw.newLine();
		bw.newLine();
		bw.write("A �rea agora chamada de Inglaterra foi habitada por seres humanos pela primeira vez durante o per�odo Paleol�tico Superior, mas o seu\r\n");
		
		bw.close();
	}

}
