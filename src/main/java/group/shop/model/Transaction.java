package group.shop.model;



public class Transaction {
	private int id;
	private int status;
	private int payment;
	
	private Order order;

	public Transaction() {
	}

	public Transaction(int status, int payment, Order order) {
		this.status = status;
		this.payment = payment;
		this.order = order;
	}

	public int getId() {
		return id;
	}

	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
