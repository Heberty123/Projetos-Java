package br.com.bytebank.banco.modelo;

public class Conexao implements AutoCloseable{

	/**
	 * Classe que representa uma conex�o para testar com a exce��o personalizada
	 * 
	 * @version 9.1
	 * @author heberty
	 */
    public Conexao() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();
    }

    /**
     * M�todo que simula recebimento de dados atrav�s da web, com ideia de jogar exce��o quando 
     * m�todo � executado
     */
    public void leDados() {
        System.out.println("Recebendo dados");
            throw new IllegalStateException();
    }


    /**
     * M�todo que fecha a conex�o entre servidor a file
     */
	@Override
	public void close() {
		System.out.println("Fechando conexao");
	}
}