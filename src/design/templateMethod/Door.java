package design.templateMethod;


enum DoorStatus { CLOSED, OPENED }
enum MotorStats { MOVING, STOPPEDV}


public class Door {
	private DoorStatus doorStatus;
	
	public Door() { doorStatus= DoorStatus.CLOSED; }
	
	public DoorStatus getDoorStaus() { return doorStatus; }
	public void close() { doorStatus = DoorStatus.CLOSED; }
	public void open() {doorStatus = DoorStatus.OPENED; }
	
}



