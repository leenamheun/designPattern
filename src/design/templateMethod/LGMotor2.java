package design.templateMethod;

public class LGMotor2 extends Motor{
	
	public LGMotor2(Door door) {
		super(door);
	}
	
	//moveMotor 메소드만 LG모터에 맞게 구현
	protected void moveMotor(String direction) {//-- hook메소드
		System.out.println("LG모터 : "+direction+" 움직여라");
	}
}
