package logic;

import gui.Controller;

public class Player {
	private Crop testPlant;
	
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
	
	public void game() {
		this.testPlant = new Crop("Test", 1, 25, 120);
		gameLoop();
	}
	
	public void logic(long delta) {
		String status = testPlant.getStatus();
		
	}
	

}
