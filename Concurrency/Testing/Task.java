package testing;

public class Task extends Thread {
	
	String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + " " + name);
		}
	}

}
