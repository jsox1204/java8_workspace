package workshop06.sub01;

public class Vehicle {
	
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	public Vehicle() {
	
	}

	public Vehicle(int maxWeight, double oilTankSize, double efficiency) {
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}
	
	public String toString() {
		return String.format("%d\t\t%.1f", maxWeight, oilTankSize);
	}

	public int getMaxWeight() {
		return maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	
}
