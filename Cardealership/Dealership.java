package cardealership;

import java.util.Scanner;

/*
 * Erstelle ein Programm, was ein Autohaus simuliert.
 * Es gibt MitarbeiterInnen, die Fahrzeuge an Kunden verkaufen.
 * 
 * Klasse Fahrzeuge
 * Klasse Mitarbeiter
 * Klasse Kunden
 */

public class Dealership {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gib mir bitte den Namen, die Adresse und die Menge an Bargeld des Kunden:");
		String name = scan.nextLine();
		String address = scan.nextLine();
		double cashOnHand = scan.nextDouble();
		System.out.println("Gib 'true' ein, wenn der Kunde das Auto bereits bezahlt hat, ansonsten 'false'.");
		boolean finance = scan.nextBoolean();
		
		System.out.println("Gib mir bei Bedarf die Telefonnnummer des Kunden:");
		int number = 0;
		number = scan.nextInt();
		
		Customer cust1;
		cust1 = new Customer(name, address, cashOnHand, finance);
		
		Vehicle car1 = new Vehicle("BMW", "Q1", 8000);
		
		Employee emp = new Employee();
		
		cust1.purchaseCar(car1, emp);
		
		cust1.setNumber(number);
		
		Vehicle car2 = new Vehicle("BMW", "Q1", 8000);
		
		if(car1 == car2) {
			System.out.println("true");
		}
		else if(car1 != car2) {
			System.out.println("false");
		}
		
		boolean vergleich = car1.equals(car2);
		
		System.out.println(vergleich);
	}

}
