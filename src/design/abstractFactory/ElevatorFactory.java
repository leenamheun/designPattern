package design.abstractFactory;

public abstract class ElevatorFactory {
	public abstract Door createDoor();
	public abstract Motor createMotor();
}





//-- 
class LgElevatorFactory extends ElevatorFactory{
	
	//教臂沛 利侩
	static LgElevatorFactory factory=null;
	public static LgElevatorFactory getInstance() {
		if(factory==null) {
			factory=new LgElevatorFactory();
		}
		return factory;
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}

	@Override
	public Motor createMotor() {
		return new LGMotor();
	}
	
}
class HyundaiElevatorFactory extends ElevatorFactory{
	
	//教臂沛 利侩
	static HyundaiElevatorFactory factory=null;
	public static HyundaiElevatorFactory getInstance() {
		if(factory==null) {
			factory=new HyundaiElevatorFactory();
		}
		return factory;
	}
	
	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}
	
	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}
	
}

class SamsungElevatorFactory extends ElevatorFactory{
	
	//教臂沛 利侩
	static SamsungElevatorFactory factory=null;
	public static SamsungElevatorFactory getInstance() {
		if(factory==null) {
			factory=new SamsungElevatorFactory();
		}
		return factory;
	}
		
	
	@Override
	public Door createDoor() {
		return new SamsungDoor();
	}
	
	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}
	
}