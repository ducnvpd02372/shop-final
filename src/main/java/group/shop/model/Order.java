package group.shop.model;

import java.time.LocalDate;





public class Order {
	private int id;


	private Product product;

	private int quantity;

	private Customer customer;
	private float tolalmoney;
	private LocalDate date;
	
	public Order() {
	}

	public Order(Product product, int quantity, Customer customer, float tolalmoney, LocalDate date) {
		this.product = product;
		this.quantity = quantity;
		this.customer = customer;
		this.tolalmoney = tolalmoney;
		this.date = date;
	}

	public int getId() {
		return id;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public float getTolalmoney() {
		return tolalmoney;
	}
	public void setTolalmoney(float tolalmoney) {
		this.tolalmoney = tolalmoney;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
}
