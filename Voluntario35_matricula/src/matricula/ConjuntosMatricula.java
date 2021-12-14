package matricula;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntosMatricula {


	private TreeSet<Matricula> treeset = new TreeSet<Matricula>((s1, s2) -> Long.compare(s1.getData().getTime(), s2.getData().getTime()));
	
	private Map<Integer, Matricula> maps = new HashMap<Integer, Matricula>();

	
	
	public void adiciona(Matricula o) {
		treeset.add(o);
		maps.put(o.getId(), o);
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
	            sb.append("number " + me.getKey() + ": ");
	            sb.append(me.getValue().toString() + "\n");
	        }
		return "" + sb;
	}
	
	
	
	



}
