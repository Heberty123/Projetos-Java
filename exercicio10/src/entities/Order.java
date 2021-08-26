package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;


public class Order {
	
	private Date moment;
	private OrderStatus status;
	private Client cliente;
	private List <OrderItem> product = new ArrayList<>();
	
	
	public Order() {
		
	}


	public Order(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}




	
	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Client getCliente() {
		return cliente;
	}


	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}


	public List<OrderItem> getProduct() {
		return product;
	}



	public void addItem(OrderItem products) {
		product.add(products);
	}
	
	public void removeItem(OrderItem products) {
		product.add(products);
	}
	
	

	
	
	
	
	public double total() {
		int somTotal = 0;
		for(OrderItem o : product) {
			somTotal += o.subTotal();
		}
		return somTotal;
	}
	
	
	public String ToString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("OrderMoment : "+ getMoment());
		sb.append("\nOrderStatus: "+ getStatus());
		sb.append("\nCliente: "+ getCliente().getName() + " " + getCliente().getBithDate() + " - " + getCliente().getEmail());
		sb.append("\nOrder items: ");
		for (OrderItem c : product) {
			sb.append("\n" + c.getProduct().getName()+ ", $"+ c.getProduct().getPrice()+ ", Quantity: "+ c.getQuantity()+ " Subtotal: "+ c.subTotal());
		}
		sb.append("Total price: "+ total());
		
		return "OI";
	}

}
