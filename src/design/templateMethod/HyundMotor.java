package design.templateMethod;

public class HyundMotor{
	private Door door;
	
	//생성자를 통한 door주입
	public HyundMotor(Door door) {
		this.door = door;
	}
	//--다름
	private void moveHyundMotor(String direction) {
		System.out.println("현대 모터 : "+direction+" 움직여라");
	}
	
	
	
	public void move(String direction) {
		//엘리베이터 움직이기 전, 문이 열렸을 경우 닫음 
		if(door.getDoorStaus()==DoorStatus.OPENED) {
			door.close();
		}
		//--다름
		moveHyundMotor(direction);
	}
	
}
