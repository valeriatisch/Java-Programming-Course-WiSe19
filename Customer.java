package cardealership;

public class Customer {
	
	private String name;
	private int number;
	private String address;
	private double cashOnHand;
	private boolean finance;
	
	public Customer(String name, String address, double cashOnHand, boolean finance) {
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
		this.finance = finance;
	}
	
	public void purchaseCar(Vehicle veh, Employee emp) {
		emp.handleCustomer(this, finance, veh);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		address += " Berlin";
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	
}
