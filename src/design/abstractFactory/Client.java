package design.abstractFactory;

public class Client {
	
	public static void main (String[] args) {
		
		//1.������ 
		//door, motor ��� ��ǰ�� �þ�ٸ� ��ǰ�� ���� Factory�� ����
		//���� ��ü�� �þ ��� ��ǰfactory�� ������ ����� �Ѵ�.*/
		
		Door lgdoor = DoorFactory.createDoor("LG");
	
		lgdoor.open();
		lgdoor.close();
		
		Motor hyundaiMotor = MotorFactory.createMotor("Hyundai");
		
		hyundaiMotor.move();
		hyundaiMotor.stop();
		
		
		//2. ��ü�� ���丮�� �߻�ȭ ��Ŵ
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

		
		//3.�߻� ���丮 ������ �̿��� ����� ���.
		/*ElevatorFactory elevatorFactory=ElevatorFactoryFactory.getFactory(args[0]);
		
		Door door = elevatorFactory.createDoor();
		Motor motor = elevatorFactory.createMotor();
		
		door.open();
		door.close();
		
		motor.move();
		motor.stop();*/
		
	}

}
