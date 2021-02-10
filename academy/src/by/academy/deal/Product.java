package by.academy.deal;

public abstract class Product {

	String name;
	Double price;
	String manufacture;
	Integer quantity = 0;

	double discount = 1;
	Product() {
		super();
	}
	Product(String name, Double price, String manufacture, Integer quantity) {
		this.name = name;
		this.price = price;
		this.manufacture = manufacture;
		this.quantity = quantity;
	}
	// create discount
	public double disount() {
		if (quantity > 5) {
			discount = 1 - 0.1;
		}
		return discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	// create discount for Wine
	public abstract double discount();
}
