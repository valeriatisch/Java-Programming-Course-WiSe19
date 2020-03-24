package cardealership;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Collections {
	
	public static void main(String[] args) {
				
		ArrayList liste = new ArrayList(); //keine Typsicherheit
				
		liste.add("a");
		liste.add('c');
		liste.add(56789);
		liste.add(40.1);
		
		System.out.println(liste);
		
		Object a = 123;
		
		String elem = (String) liste.get(0);
		int elem1 = (int) liste.get(2);
		Object elem2 = liste.get(3);
		Object elem3 = liste.get(2);
		
		//falsch: double sum = elem1 + elem2;
				
		ArrayList<String> strings = new ArrayList<String>();
				
		strings.add("abc");
		strings.add("def");
		strings.add("ghij");
		
		LinkedList<Integer> zahlen = new LinkedList<Integer>(); //use Integer instead of int here
		
		zahlen.add(3);
		zahlen.add(5);
		zahlen.add(8);
		zahlen.add(1);
		zahlen.add(3);
		
		zahlen.sort(null);
		//zahlen.remove(); //or removeFirst() //later
		
		for(int i : zahlen) {
			System.out.println(i);
		}
		
		for(int i = 0; i < zahlen.size(); i++) {
			System.out.println(zahlen.get(i));
		}
		
		for(String s : strings) {
			System.out.println(s);
		}
		
		LinkedList<Vehicle> fahrzeuge = new LinkedList<Vehicle>();
		
		Vehicle v1 = new Vehicle("BMW", "A1", 30000);
		Vehicle v2 = new Vehicle("BMW", "A2", 35000);
		Vehicle v3 = new Vehicle("BMW", "A3", 20000);
				
		fahrzeuge.add(v1);
		fahrzeuge.add(v2);
		fahrzeuge.add(v3);
		
		fahrzeuge.sort(null);
		
		System.out.println(fahrzeuge);
		
		methode(fahrzeuge);
		methode(strings);
		
		HashSet<Double> dezimalzahlen = new HashSet<Double>();
		
		dezimalzahlen.add(1234.67);
		dezimalzahlen.add(12.556);
		dezimalzahlen.add(1234.67);
		dezimalzahlen.add(43.5);
		dezimalzahlen.add(987.56);
		
		for(double d : dezimalzahlen) {
			System.out.println(d);
		}
		
		
		System.out.println(dezimalzahlen);
		
		dezimalzahlen.clear();
		
		boolean leer = dezimalzahlen.isEmpty();
		System.out.println(leer);
		System.out.println(dezimalzahlen);
		
		HashMap<String, String> db = new HashMap<String, String>();
		
		db.put("A", "wie Apfel");
		db.put("B", "wie Banane");
		
		System.out.println(db.keySet());
		
		for(Map.Entry<String, String> eintrag: db.entrySet()) {
			System.out.println(eintrag.getKey());
			System.out.println(eintrag.getValue());
		}
		
		TreeMap<String, Integer> alphabet = new TreeMap<String, Integer>();
		alphabet.put("a", 1);
		alphabet.put("e", 4);
		alphabet.put("v", 7);
		alphabet.put("a", 6);
		alphabet.put("d", 2);
		
		System.out.println(alphabet);
		
		int v = 2;
		int b = 0;
		int c = v/b;
		
	}
	
	public static void methode(List liste) {
		//System.out.println(liste.get(0));
	}

	
}
