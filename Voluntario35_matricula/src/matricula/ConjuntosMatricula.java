package matricula;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Excepetion.DomainException;

public class ConjuntosMatricula {


	private static TreeSet<Matricula> treeset = new TreeSet<Matricula>((s1, s2) -> Long.compare(s1.getData().getTime(), s2.getData().getTime()));
	
	private static Map<Integer, Matricula> maps = new HashMap<Integer, Matricula>();
	
	
	public TreeSet<Matricula> getTreeset() {
		return treeset;
	}
	

	public void adiciona(Matricula o) throws DomainException {
		if(containsValue(o)) {
			throw new DomainException("Inválido: Esse matricula já existe na Lista");
		}else {
			treeset.add(o);
			maps.put(o.getId(), o);
		}
	}
	
	public void remove(Integer number) {
		Matricula matricula = maps.get(number);
		treeset.remove(matricula);
		maps.remove(number, matricula);
	}
	
	
/*	@Override
	public boolean contains(Object o) {
		Matricula m = (Matricula) o;
		for(Matricula test: treeset) {
			if(m.equals(test)) {
				return true;
			}
		}   
		return false;
    }
*/
	
	
	
	public String mostraTreeset() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de matricula ordenada: \n");
		
		for (Matricula matricula : treeset) {
			sb.append(matricula.toString());
		}
		return "" + sb;
	}
	
	
	public static boolean containsValue(Object value) {
		Matricula m = (Matricula) value;
		for (Entry<Integer, Matricula> me : maps.entrySet()) {
            if(m.ehIgual(me.getValue())){
            	return true;
            }
        }
		return false;
	}
	
	

	
	
/*	public String mostraHashMap() {
		StringBuilder sb = new StringBuilder();
		sb.append("Maps de matricula: \n");
		
		
		 for (Entry<Integer, Matricula> me : maps.entrySet()) {
	            sb.append("Id: " + me.getKey() + " ");
	            sb.append(me.getValue().toString() + "\n");
	        }
		return "" + sb;
	}
*/	
	
	
	



}
