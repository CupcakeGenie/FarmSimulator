package gui;

import logic.Crop;

public class Controller {
	private FarmGUI viewport;
	private Crop testCrop = new Crop("Testikasvi", 100, 100, 100);
	
	public Controller(FarmGUI viewport) {
		this.viewport = viewport;
	}
	
	public void gameLoop() {
		boolean gameRunning = true;
		long last = System.nanoTime();
		
		while (gameRunning) {
			try { Thread.sleep(4); } catch (Exception e) {};
			long delta = (System.nanoTime() - last) / 1000000;
			last = System.nanoTime();
			
			for (int i=0;i<delta / 5;i++) {
				logic(5);
			}
			if ((delta % 5) != 0) {
				logic(delta % 5);
			}
		}
	}
	
	public void logic(long delta) {
		viewport.print(testCrop.getStatus());
		
	}
	
	public void game() {
		gameLoop();
	}
	
	public static void close() {
		System.exit(0);	
	}

	public String plantSeed() {
		return testCrop.getStatus();
	}
}
