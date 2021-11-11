package Test;

public class Program {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		if (i == 1) {
			
			try{
			throw new Exceptionn("Erro key");
			}
			catch(Exceptionn e) {
				System.out.print(e.getMessage());
			}
		}
	}

}
