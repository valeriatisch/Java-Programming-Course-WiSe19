package testing;

public class Worker extends Thread {
	
	Sequence seq = null;
	
	public Worker(Sequence seq) {
		this.seq = seq;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(seq.getNext() + " " + Thread.currentThread().getName());
		}
	}
	
}
