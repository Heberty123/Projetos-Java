package model.service;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	private TaxService taxService;
	
	public RentalService() {}

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public void ProcessInvoice(CarRental carRental) {
		long tempo1 = carRental.getStart().getTime();
		long tempo2 = carRental.getFinish().getTime();
		
		long horario = (tempo2 - tempo1)/ 1000 / 60 / 60;
		double price;
		double tax;
		if(horario <= 12.00) {
			double horas = (double) Math.ceil(horario);
			price = horas * pricePerDay;
			tax = taxService.tax(price);
		}
		else {
			double horas = (double) Math.ceil(horario);
			price = horas * pricePerDay;
			tax = taxService.tax(price);
		}
		
		carRental.setInvoice(new Invoice(price, tax));
	}
	
}
