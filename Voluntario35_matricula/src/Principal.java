import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> treeset = new UmaClass().getTreeset();
		
		
		
		
		treeset.add("OI");
		treeset.add("nunca");
		treeset.add("sempre");
		treeset.add("sempre");
		
		
		if(treeset.contains(treeset)) {
			System.out.println("Contém");
		}
		
	}

}
