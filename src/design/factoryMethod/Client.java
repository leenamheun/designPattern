package design.factoryMethod;

public class Client {
	public static void main(String args[]){
		//1.5개의 엘레베이터 생성
		ElevatorManager manager = new ElevatorManager(5);
		
		//임의로 선택된 엘레베이터 - 5층으로 가기 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(2);
		manager.reqElevator(7);
		
		
		
		 //2-1.전략주입을 통해 동적으로 변경
		/*ElevatorManager manager = new ElevatorManager(3); //A스케쥴링 주입
		//임의로 선택된 엘레베이터 - 5층으로 가기 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(7);
		
		System.out.println("===========================");
		
		ElevatorManager manager1 = new ElevatorManager(3); 
		//임의로 선택된 엘레베이터 -  
		manager1.reqElevator(2);
		manager1.reqElevator(7);
		manager1.reqElevator(1);
		*/
		
		/*//2-2.전략주입- 팩토리 구성
		ElevatorManager manager = new ElevatorManager(3,"A"); //A스케쥴링 주입
		//임의로 선택된 엘레베이터 - 5층으로 가기 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(7);
		
		System.out.println("===========================");
		
		ElevatorManager manager1 = new ElevatorManager(3,"B");//B스케쥴링 주입
		//임의로 선택된 엘레베이터 -  
		manager1.reqElevator(2);
		manager1.reqElevator(7);
		manager1.reqElevator(1);*/
		
		
		
		// 3. 템플릿메서드 패턴 추가 
	/*	ElevatorManager manager = new ElevatorWithScheduler1(3);
		//임의로 선택된 엘레베이터 - 5층으로 가기 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(7);
		
		System.out.println("===========================");
		
		ElevatorManager manager1 = new ElevatorWithScheduler2(3);
		//임의로 선택된 엘레베이터 -  
		manager1.reqElevator(2);
		manager1.reqElevator(7);
		manager1.reqElevator(1);
		*/
		
	}
}