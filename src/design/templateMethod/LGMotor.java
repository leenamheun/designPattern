package design.templateMethod;

public class LGMotor{
	private Door door;
	
	//생성자를 통한 door주입
	public LGMotor(Door door) {
		this.door = door;
	}
	
	
	private void moveLGMotor(String direction) {
		System.out.println("LG모터 : "+direction+" 움직여라");
	}
	
	
	
	public void move(String direction) {
		//엘리베이터 움직이기 전, 문이 열렸을 경우 닫음 
		if(door.getDoorStaus()==DoorStatus.OPENED) {
			door.close();
		}
		
		moveLGMotor(direction);
	}
	
}
