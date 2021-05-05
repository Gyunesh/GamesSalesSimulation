package Entities;

public class Product {
	private int id;
	private String productName;
	private double productPrice;
	private int unitInStock;
	
	public Product() {
		
	}

	public Product(int id, String productName, double productPrice, int unitInStock) {
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.unitInStock = unitInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
}
