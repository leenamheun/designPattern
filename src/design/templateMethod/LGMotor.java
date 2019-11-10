package design.templateMethod;

public class LGMotor{
	private Door door;
	
	//�����ڸ� ���� door����
	public LGMotor(Door door) {
		this.door = door;
	}
	
	
	private void moveLGMotor(String direction) {
		System.out.println("LG���� : "+direction+" ��������");
	}
	
	
	
	public void move(String direction) {
		//���������� �����̱� ��, ���� ������ ��� ���� 
		if(door.getDoorStaus()==DoorStatus.OPENED) {
			door.close();
		}
		
		moveLGMotor(direction);
	}
	
}
