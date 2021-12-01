package Service;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double paymentFee(double amount) {
		return amount * 1.02;
	}

	@Override
	public double interest(double amount, int months, int i) {
		// TODO Auto-generated method stub
		double valor = amount/months;
		return valor = valor + (valor * 0.01)*i;
	}

}
