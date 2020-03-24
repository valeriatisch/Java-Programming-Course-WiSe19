package cardealership;

public class Employee {
	
	public void handleCustomer(Customer cust, boolean finance, Vehicle veh) {
		if(finance == true) {
			runCreditHistory(veh, cust);
		}
		else if(veh.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust, veh);
		}
		else {
			System.out.println("Der Kunde " + cust.getName() + " hat nicht genug Geld fuer das Auto " + veh);
		}
	}
	
	private void runCreditHistory(Vehicle veh, Customer cust) {
		System.out.println("Der Kunde " + cust.getName() + " hat das Auto " + veh + " schon bezahlt.");
	}
	
	private void processTransaction(Customer cust, Vehicle veh){
		double rest = cust.getCashOnHand() - veh.getPrice();
		System.out.println("Der Kunde "  + cust.getName() + " hat das Fahrzeug " + veh + " jetzt bezahlt.");
	}
	
}
