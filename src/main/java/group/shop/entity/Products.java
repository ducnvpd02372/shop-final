package group.shop.entity;

import java.util.Base64;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="Products")
public class Products {
	@TableGenerator(
		    name="prodGen", 
		    table="ID_PROD", 
		    pkColumnName="GEN_KEY", 
		    valueColumnName="GEN_VALUE", 
		    pkColumnValue="EMP_ID", 
		    allocationSize=1)
	@Id
	@GeneratedValue(strategy= GenerationType.TABLE, generator="prodGen")
	private int id;
	@Column(columnDefinition="nvarchar(200)")
	private String name;
	@Lob
	@Column(columnDefinition="varbinary(max)")
	private byte[] image;
	@Min(value=10000)
	private float prices;
	@Min(value=0)
	private int quantity;
	@Column(columnDefinition="nvarchar(500)")
	private String mota;
	@NotNull
	@ManyToOne()
	@JoinColumn(name="categorys_id",insertable=true, updatable=true)
	private Categorys categorys;
	@OneToMany(mappedBy="products")
	private Set<Orders> orders;
	
	public Products() {
	}
	public Products(int idpro) {
		this.id = idpro;
	}
	public Products(String name, byte[] image, @Min(10000) float prices, @Min(0) int quantity, String mota,
			@NotNull Categorys categorys, Set<Orders> orders) {
		this.name = name;
		this.image = image;
		this.prices = prices;
		this.quantity = quantity;
		this.mota = mota;
		this.categorys = categorys;
		this.orders = orders;
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

	public byte[] getImage() {
		return image;
	}
	public String getBase64Image()
	{
		if(this.getImage()==null) {
			return "";
		}else {
	    return Base64.getEncoder().encodeToString(this.getImage());}
	}
	public void setImage(byte[] image) {
		this.image = image;
	}

	public float getPrices() {
		return prices;
	}

	public void setPrices(float prices) {
		this.prices = prices;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Categorys getCategorys() {
		return categorys;
	}

	public void setCategorys(Categorys categorys) {
		this.categorys = categorys;
	}

	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
	
}
