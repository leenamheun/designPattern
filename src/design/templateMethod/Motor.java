package design.templateMethod;

//
public abstract class Motor{
	private Door door;
	
	public Motor(Door door) {
		this.door = door;
	}
	
	//lg, hyundai���� Ŭ�������� ����
	protected abstract void moveMotor(String direction);
	
	
	public void move(String direction) {
		//���������� �����̱� ��, ���� ������ ��� ���� 
		if(door.getDoorStaus()==DoorStatus.OPENED) {
			door.close();
		}
		moveMotor(direction);
	}
	
}
