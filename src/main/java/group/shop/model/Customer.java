package group.shop.model;

import java.time.LocalDate;


public class Customer {
	private int id;

	private String name;

	private LocalDate birthday;

	private String province;

	private String address;

	private String phone;

	private String email;
	private String pass;
	
	public Customer() {
	}

	public Customer(String name, LocalDate birthday, String province, String address, String phone, String email,
			String pass) {
		this.name = name;
		this.birthday = birthday;
		this.province = province;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.pass = pass;
	}

	public int getId() {
		return id;
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

	
}
