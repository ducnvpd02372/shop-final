package group.shop.model;


public class Category {
	private int id;
	
	private String name;
	
	
	
	public Category(String name) {
		this.name = name;
	}
	public Category() {
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
	
}
