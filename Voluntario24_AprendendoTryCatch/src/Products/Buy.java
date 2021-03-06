package Products;

public class Buy {

	private String name;
	private double price;
	private int quantity;
	
	public Buy(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double total() {
		
		return this.price * this.quantity;
	}
	
	public String toString() {
		
		return this.name + ", R$ " + this.price + ", " + this.quantity;
	}
	
}
