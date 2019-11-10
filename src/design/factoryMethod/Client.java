package design.factoryMethod;

public class Client {
	public static void main(String args[]){
		//1.5���� ���������� ����
		ElevatorManager manager = new ElevatorManager(5);
		
		//���Ƿ� ���õ� ���������� - 5������ ���� 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(2);
		manager.reqElevator(7);
		
		
		
		 //2-1.���������� ���� �������� ����
		/*ElevatorManager manager = new ElevatorManager(3); //A�����층 ����
		//���Ƿ� ���õ� ���������� - 5������ ���� 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(7);
		
		System.out.println("===========================");
		
		ElevatorManager manager1 = new ElevatorManager(3); 
		//���Ƿ� ���õ� ���������� -  
		manager1.reqElevator(2);
		manager1.reqElevator(7);
		manager1.reqElevator(1);
		*/
		
		/*//2-2.��������- ���丮 ����
		ElevatorManager manager = new ElevatorManager(3,"A"); //A�����층 ����
		//���Ƿ� ���õ� ���������� - 5������ ���� 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(7);
		
		System.out.println("===========================");
		
		ElevatorManager manager1 = new ElevatorManager(3,"B");//B�����층 ����
		//���Ƿ� ���õ� ���������� -  
		manager1.reqElevator(2);
		manager1.reqElevator(7);
		manager1.reqElevator(1);*/
		
		
		
		// 3. ���ø��޼��� ���� �߰� 
	/*	ElevatorManager manager = new ElevatorWithScheduler1(3);
		//���Ƿ� ���õ� ���������� - 5������ ���� 
		manager.reqElevator(5);
		manager.reqElevator(4);
		manager.reqElevator(7);
		
		System.out.println("===========================");
		
		ElevatorManager manager1 = new ElevatorWithScheduler2(3);
		//���Ƿ� ���õ� ���������� -  
		manager1.reqElevator(2);
		manager1.reqElevator(7);
		manager1.reqElevator(1);
		*/
		
	}
}