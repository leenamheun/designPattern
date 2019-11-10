package design.templateMethod;

//
public abstract class Motor{
	private Door door;
	
	public Motor(Door door) {
		this.door = door;
	}
	
	//lg, hyundai모터 클래스에서 구현
	protected abstract void moveMotor(String direction);
	
	
	public void move(String direction) {
		//엘리베이터 움직이기 전, 문이 열렸을 경우 닫음 
		if(door.getDoorStaus()==DoorStatus.OPENED) {
			door.close();
		}
		moveMotor(direction);
	}
	
}
