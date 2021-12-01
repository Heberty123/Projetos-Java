package Service;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	
	private OnlinePaymentService onlinePayment;
	
	
	public ContractService() {
	}
	
	public void processContract(Contract contract, int months1, OnlinePaymentService onlinePayment) {
		Date date = contract.getDate();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		double total = contract.getTotalValue();
		
		for (int i = 1; i <= months1 ; i++) {
			
			double Tax = onlinePayment.interest(total, months1, i);
			double value = onlinePayment.paymentFee(Tax);
			
			cal.add(Calendar.MONTH, 1);
			Date aux = cal.getTime();
			
			contract.getInstallments().add(new Installment(aux, value));
			
			
		}
	}
}
