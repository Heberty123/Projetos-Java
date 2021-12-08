package matricula;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntosMatricula implements Comparator<Matricula> {
	
	private static int id = 1;

	private TreeSet<Matricula> treeset = new TreeSet<Matricula>(new Comparator<Matricula>() {
        @Override
        public int compare(Matricula s1, Matricula s2) {
        	if(s1.getNumber() > s2.getNumber()) {
    			return 1;
    		}
    		if(s1.getNumber() < s2.getNumber()) {
    			return -1;
    		}
    		
    		return 0;
        }
    });
	
	private Map<Integer, Matricula> maps = new HashMap<Integer, Matricula>();


	
	public void adiciona(Matricula o) {
		treeset.add(o);
		maps.put(id, o);
		id++;
	}
	
	public void remove(Integer number) {
		Matricula matricula = maps.get(number);
		treeset.remove(matricula);
		maps.remove(number, matricula);
	}
	
	public String mostraTreeset() {
		StringBuilder sb = new StringBuilder();
		sb.append("Lista de matricula não ordenada: \n");
		
		for (Matricula matricula : treeset) {
			sb.append(matricula.toString());
		}
		return "" + sb;
	}
	
	
	public String mostraHashMap() {
		StringBuilder sb = new StringBuilder();
		sb.append("Maps de matricula: \n");
		
		 for (Entry<Integer, Matricula> me : maps.entrySet()) {
	            sb.append(me.getKey() + ": ");
	            sb.append(me.getValue().toString() + "\n");
	        }
		return "" + sb;
	}


	@Override
	public int compare(Matricula s1, Matricula s2) {
		if(s1.getNumber() < s2.getNumber()) {
			return 1;
		}
		if(s1.getNumber() > s2.getNumber()) {
			return -1;
		}
		
		return 0;
	}


}
