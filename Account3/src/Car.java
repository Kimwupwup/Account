
public class Car implements Valuable{
	private String name;
	private double price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public double EstimateValue(int time) {
		price = (price * 0.8);
		price = price * Math.pow(0.99,time);
		return price;
	}
	
	public String toString() {
		return String.format("CarName: " + name + "\ninitial price: " + price);
	}
}
