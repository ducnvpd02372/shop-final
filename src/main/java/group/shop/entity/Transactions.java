package group.shop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class Transactions {
	@TableGenerator(
		    name="tranGen", 
		    table="ID_TRAN", 
		    pkColumnName="GEN_KEY", 
		    valueColumnName="GEN_VALUE", 
		    pkColumnValue="EMP_ID", 
		    allocationSize=1)
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE, generator="tranGen")
	private int id;
	@Column(columnDefinition="tinyint")
	private int status;
	@Column(columnDefinition="tinyint")
	private int payment;
	@OneToOne()
    @JoinColumn(name = "orders_id",insertable=true, updatable=true)
	private Orders orders;
	
	public Transactions(int status, int payment, Orders orders) {
		this.status = status;

		this.payment = payment;
		this.orders = orders;
	}
	public Transactions() {
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
	public Orders getOrders() {
		return orders;
	}
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	
	
	
}
