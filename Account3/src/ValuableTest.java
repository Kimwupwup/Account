
public class ValuableTest {

	public static void main(String[] args) {
				
		Valuable[] objectList = new Valuable[4];
		objectList[0] = new CheckingAccount(100.0, 50.0, 0.01, 0.07);
		objectList[1] = new SavingsAccount(100.0, 0.05);
		objectList[2] = new Human("Mark", 20);
		objectList[3] = new Car("MyCar", 5000);
		
		
		for(Valuable objectItem : objectList) {		//for(자료형 자료형이름 : 배열이름) - objectList에 있는 것을 순서대로 objectItem에 넣어줌
			System.out.printf("%s \n", objectItem.toString());	//objectItem에 들어잇는 objectList를 참조하는 것
			System.out.printf("6 month later Valuable : %.2f\n", objectItem.EstimateValue(6));
			System.out.println();
		}
	}
}	
