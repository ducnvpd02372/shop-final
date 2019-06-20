package group.shop.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Customers")
public class Customers {
	@TableGenerator(
		    name="customerGen", 
		    table="ID_Customer", 
		    pkColumnName="GEN_KEY", 
		    valueColumnName="GEN_VALUE", 
		    pkColumnValue="EMP_ID", 
		    allocationSize=1)
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE, generator="customerGen")
	private int id;
	@Column(columnDefinition="nvarchar(200)")
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate birthday;
	@Column(columnDefinition="nvarchar(200)")
	private String province;
	@Column(columnDefinition="nvarchar(500)")
	private String address;
	@Column (columnDefinition="varchar(11)")
	private String phone;
	@Column(columnDefinition="nvarchar(50)")
	private String email;
	private String pass;
	
	public Customers() {
	}

	public Customers(String name, LocalDate birthday, String province, String address, String phone, String email,
			String pass) {
		this.name = name;
		this.birthday = birthday;
		this.province = province;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getId() {
		return id;
	}

	
}
