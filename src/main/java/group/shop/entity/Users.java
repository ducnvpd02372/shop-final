package group.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "Users")

public class Users {
	@TableGenerator(
		    name="userGen", 
		    table="ID_User", 
		    pkColumnName="GEN_KEY", 
		    valueColumnName="GEN_VALUE", 
		    pkColumnValue="EMP_ID", 
		    allocationSize=1)
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE, generator="userGen")
	private int id;
	@Column(columnDefinition="nvarchar(200)")
	private String name;
	@Column(columnDefinition="nvarchar(200)")
	private String username;
	@Column(columnDefinition="nvarchar(200)")
	private String password;
	public Users(String name, String username, String password) {
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public Users() {
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
