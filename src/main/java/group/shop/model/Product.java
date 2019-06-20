package group.shop.model;



;

public class Product {
	private int id;
	
	private String name;
	
	private byte[] image;
	
	private float prices;
	
	private int quantity;

	private String mota;

	private Category categorys;

	public Product() {
	}
	
	
	public Product(String name, byte[] image, float prices, int quantity, String mota, Category categorys) {
		this.name = name;
		this.image = image;
		this.prices = prices;
		this.quantity = quantity;
		this.mota = mota;
		this.categorys = categorys;
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

	public Category getCategorys() {
		return categorys;
	}

	public void setCategorys(Category categorys) {
		this.categorys = categorys;
	}
	
	
}
