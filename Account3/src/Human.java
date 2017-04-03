
public class Human implements Valuable{
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public double EstimateValue(int time) {

		return Double.POSITIVE_INFINITY;
	}
	
	public String toString() {
		return String.format("HumanName: " + name + "\nregitstered age: " + age);
	}
}
