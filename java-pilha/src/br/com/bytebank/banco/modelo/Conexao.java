package br.com.bytebank.banco.modelo;

public class Conexao implements AutoCloseable{

	/**
	 * Classe que representa uma conexão para testar com a exceção personalizada
	 * 
	 * @version 9.1
	 * @author heberty
	 */
    public Conexao() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();
    }

    /**
     * Método que simula recebimento de dados através da web, com ideia de jogar exceção quando 
     * método é executado
     */
    public void leDados() {
        System.out.println("Recebendo dados");
            throw new IllegalStateException();
    }


    /**
     * Método que fecha a conexão entre servidor a file
     */
	@Override
	public void close() {
		System.out.println("Fechando conexao");
	}
}