package group.shop.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Min;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class Orders {
	@TableGenerator(
		    name="orderGen", 
		    table="ID_ORDER", 
		    pkColumnName="GEN_KEY", 
		    valueColumnName="GEN_VALUE", 
		    pkColumnValue="EMP_ID", 
		    allocationSize=1)
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE, generator="orderGen")
	private int id;
	@ManyToOne()
	@JoinColumn(name="products_id",insertable=true, updatable=true)
	private Products products;
	@Min(value=1)
	private int quantity;
	@ManyToOne
	@JoinColumn(name="customers_id",insertable=true, updatable=true)
	private Customers customers;
	@Min(value=0)
	private float tolalmoney;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate date;
	@OneToOne(mappedBy = "orders")
	private Transactions transactions;
	public Orders() {
	}
	public Orders(Products products, @Min(1) int quantity, Customers customers, @Min(0) float tolalmoney,
			LocalDate date) {
		this.products = products;
		this.quantity = quantity;
		this.customers = customers;
		this.tolalmoney = tolalmoney;
		this.date = date;
	}
	public int getId() {
		return id;
	}
	
	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
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
