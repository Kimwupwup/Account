
public class ValuableTest {

	public static void main(String[] args) {
				
		Account[] account = new Account[2];
		account[0] = new CheckingAccount(100.0, 50.0, 0.01, 0.07);
		account[1] = new SavingsAccount(100.0, 0.05);
		Human human = new Human("Mark", 20);
		Car car = new Car("MyCar", 5000);
		
		Valuable[] objectList = new Valuable[4];
		objectList[0] = account[0];
		objectList[1] = account[1];
		objectList[2] = human;
		objectList[3] = car;
		
		
		for(Valuable objectItem : objectList) {
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("6 month later Valuable : %.2f\n", objectItem.EstimateValue(6));
			System.out.println();
		}
	}
}	
