package group.shop.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name="Categorys")
public class Categorys {
	@TableGenerator(
		    name="categoryGen", 
		    table="ID_Cate", 
		    pkColumnName="GEN_KEY", 
		    valueColumnName="GEN_VALUE", 
		    pkColumnValue="EMP_ID", 
		    allocationSize=1)
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE, generator="categoryGen")
	private int id;
	@Column(columnDefinition="nvarchar(200)")
	private String name;
	@OneToMany(mappedBy="categorys")
	private Set<Products> products;
	
	public Categorys(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Categorys() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
