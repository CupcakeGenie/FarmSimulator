package logic;

public class Crop {
	private String species;
	private String status;
	private int seedValue;
	private int fruitValue;
	private int growthTime;
	private int timeAlive;
	
	public Crop (String species, int seedValue, int fruitValue, int growthTime) {
		this.species = species;
		this.status = "Seed";
		this.seedValue = seedValue;
		this.fruitValue = fruitValue;
		this.growthTime = growthTime;
		this.timeAlive = 0;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void growPlant() {
		if (timeAlive == growthTime) {
			status = "Fully grown";		
		}
		else {
			timeAlive++;
		}
	}
	
	public void harvestPlant() {
		if (status == "Fully grown") {
			
		}
	}
}
