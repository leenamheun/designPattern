package design.abstractFactory;

public class Client {
	
	public static void main (String[] args) {
		
		//1.문제점 
		//door, motor 등등 부품이 늘어난다면 부품에 대한 Factory가 생성
		//또한 업체가 늘어날 경우 부품factory도 변경을 해줘야 한다.*/
		
		Door lgdoor = DoorFactory.createDoor("LG");
	
		lgdoor.open();
		lgdoor.close();
		
		Motor hyundaiMotor = MotorFactory.createMotor("Hyundai");
		
		hyundaiMotor.move();
		hyundaiMotor.stop();
		
		
		//2. 업체별 팩토리를 추상화 시킴
		/*ElevatorFactory elevatorFactory = null;
		String vendor=args[0];
		
		if(vendor.equalsIgnoreCase("LG")) {
			 elevatorFactory = new LgElevatorFactory();
		}else if(vendor.equalsIgnoreCase("HYUNDAI")) {
			 elevatorFactory = new HyundaiElevatorFactory();
		}else {
			 elevatorFactory = new SamsungElevatorFactory();
		}
		
		Door door = elevatorFactory.createDoor();
		Motor motor = elevatorFactory.createMotor();
		
		door.open();
		door.close();
		
		motor.move();
		motor.stop();*/

		
		//3.추상 팩토리 패턴을 이용한 방법을 사용.
		/*ElevatorFactory elevatorFactory=ElevatorFactoryFactory.getFactory(args[0]);
		
		Door door = elevatorFactory.createDoor();
		Motor motor = elevatorFactory.createMotor();
		
		door.open();
		door.close();
		
		motor.move();
		motor.stop();*/
		
	}

}
