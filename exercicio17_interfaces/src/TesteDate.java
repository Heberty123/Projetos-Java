import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TesteDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date d = new SimpleDateFormat("dd/MM/yyyy").parse("10/06/2013");


		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//System.out.println(cal.getTime()); //data atual
		cal.add(Calendar.MONTH, 1);
		//System.out.println(cal.getTime());
		cal.add(Calendar.MONTH, 1);
		//System.out.println(cal.getTime()); 
		
		Date d1 = cal.getTime();
		
		System.out.println(d1);
		
		/*
		d.setTime(d.getTime() + 2_628_000_000L);
		d.setTime(d.getTime() + 2_628_000_000L);
		d.setTime(d.getTime() + 2_628_000_000L);
		System.out.println(d);
		*/

	}

}
