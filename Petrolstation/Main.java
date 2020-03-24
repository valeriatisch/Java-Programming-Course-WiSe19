/**
 * Help:
 * 	Exception Handling:
 * 		https://www.geeksforgeeks.org/types-of-exception-in-java-with-examples/
 * 		https://stackoverflow.com/questions/51707887/tips-unhandled-exception-type-xxx-in-eclipse/51708334
 *	Javadoc and HTML Entities: 		
 *		https://www.oracle.com/technetwork/articles/java/index-137868.html
 * 		https://www.htmlhelp.com/de/reference/html40/entities/special.html
 * 	JUnit Asserts:	
 * 		http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 * 
 * Main class allows to run manual tests through standard output
 * 
 */
public class Main {
	
    public static void main(String[] args) {
    	
        
        System.out.println("************Testing PetrolStation***************");
        PetrolStationTest pst = new PetrolStationTest();
        pst.enterOnceForIfFillEuros();
        pst.enterOnceForElseFillEuros();
   
        
        System.out.println("************Integration Testing***************");
        
        IntegrationTest name = null;
        name = new IntegrationTest();
        System.out.println(name);
        
		IntegrationTest intest = new IntegrationTest();
		intest.testNotEnoughFuelForTravel();
		
	}
}