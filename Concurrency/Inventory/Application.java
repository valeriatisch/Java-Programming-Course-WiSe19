package Inventory;

public class Application {
	
	public static void main(String[] args) {
		
		InventoryManager manager = new InventoryManager();
		
		Thread task = new Thread(new Runnable() {
			@Override
			public void run(){
				manager.populateSoldProduct();
			}
		});
		
		Thread task2 = new Thread(new Runnable() {
			@Override
			public void run(){
				manager.displaySoldProducts();
			}
		});
		
		task.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		task2.start();
	}
	

}
