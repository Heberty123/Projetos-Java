package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private int number;
	private Date date;
	private double totalValue;
	List<Installment> installments = new ArrayList<>();
	
	public Contract(){
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Contract(int number, Date date, double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Installment installment : installments) {
			sb.append(sdf.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()) + "\n");
		}
		return "" + sb;
	}
	
	
}
