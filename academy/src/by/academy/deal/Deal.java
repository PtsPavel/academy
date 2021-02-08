package by.academy.deal;

public class Deal {

	Product seller;
	Product buyer;
	Product[] products;
	String dealDate;
	
	public Deal() {
		super();
	}

	public Product getSeller() {
		return seller;
	}

	public void setSeller(Product seller) {
		this.seller = seller;
	}

	public Product getBuyer() {
		return buyer;
	}

	public void setBuyer(Product buyer) {
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public String getDealDate() {
		return dealDate;
	}

	public void setDealDate(String dealDate) {
		this.dealDate = dealDate;
	}
	
}
