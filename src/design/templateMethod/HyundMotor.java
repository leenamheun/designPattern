package design.templateMethod;

public class HyundMotor{
	private Door door;
	
	//�����ڸ� ���� door����
	public HyundMotor(Door door) {
		this.door = door;
	}
	//--�ٸ�
	private void moveHyundMotor(String direction) {
		System.out.println("���� ���� : "+direction+" ��������");
	}
	
	
	
	public void move(String direction) {
		//���������� �����̱� ��, ���� ������ ��� ���� 
		if(door.getDoorStaus()==DoorStatus.OPENED) {
			door.close();
		}
		//--�ٸ�
		moveHyundMotor(direction);
	}
	
}
