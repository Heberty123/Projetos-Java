package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Teste {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date hoje = new Date();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		Date data_boleto = sdf1.parse("15/08/2021");
		
		System.out.println(data_boleto);

	}

}
