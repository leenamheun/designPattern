package design.templateMethod;

public class LGMotor2 extends Motor{
	
	public LGMotor2(Door door) {
		super(door);
	}
	
	//moveMotor �޼ҵ常 LG���Ϳ� �°� ����
	protected void moveMotor(String direction) {//-- hook�޼ҵ�
		System.out.println("LG���� : "+direction+" ��������");
	}
}
