package design.templateMethod;

public class HyundMotor2 extends Motor{
	
	public HyundMotor2(Door door) {
		super(door);
	}
	
	//moveMotor �޼ҵ常 Hyund���Ϳ� �°� ������
	protected void moveMotor(String direction) {
		System.out.println("HYUNDAI���� : "+direction+" ��������");
	}
	
}
