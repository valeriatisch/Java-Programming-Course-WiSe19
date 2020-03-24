package Inventory;

public class Product {
	
	int id;
	String name;
	
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return "id " + id + " " + name;
	}
	
	
}
