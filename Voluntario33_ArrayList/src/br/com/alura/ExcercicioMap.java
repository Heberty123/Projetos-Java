package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExcercicioMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");
        
        pessoas.keySet().forEach(idade -> {
        	System.out.println(pessoas.get(idade));
        });
        
        
        Set<Integer> chaves = pessoas.keySet();    
        for (Integer key : chaves) {
            System.out.println(key);
        }
        
        
        Collection<String> valores = pessoas.values();
        for (String nome : valores) {
            System.out.println(nome);
        }
        
        
        Set<Entry<Integer,String>> associacoes = pessoas.entrySet();    
        for (Entry<Integer, String> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
        
        
        
        
	}

}
