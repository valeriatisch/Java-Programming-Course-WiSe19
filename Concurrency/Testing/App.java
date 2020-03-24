package testing;

public class App {
	
	public static void main(String[] args) {
		
		Task task1 = new Task("Threadname x");
		task1.start();
		
		Sequence seq = new Sequence();
		
		Worker worker1 = new Worker(seq);
		worker1.start();
		Worker worker2 = new Worker(seq);
		worker2.start();
		
		
	}

}
