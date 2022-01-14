import java.util.Set;
import java.util.TreeSet;

public class UmaClass {

	private Set<String> treeset = new TreeSet<String>();

	public Set<String> getTreeset() {
		return treeset;
	}

	public void setTreeset(Set<String> treeset) {
		this.treeset = treeset;
	}
	
	public boolean contem(Object o) {
		for (String s : treeset) {
			if(s == o) {
				return true;
			}
		}
		return false;
	}
}
