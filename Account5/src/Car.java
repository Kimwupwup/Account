
public class Car implements Valuable{
	private String name;
	private double price;
	private int count;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		this.count = 0;
	}

	public double EstimateValue() {
		if (count == 0) {
			price *= 0.8;
			count++;
		}
		price *= 0.99;
		return price;
	}
	
	public double EstimateValue(int time) {
		if (count == 0) {
			price *= 0.8;
			count++;
		}
		price *= Math.pow(0.99,time);
		return price;
	}
	
	public String toString() {
		return String.format("CarName: " + name + "\ninitial price: " + price);
	}
}
