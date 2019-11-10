package design.templateMethod;

public class HyundMotor2 extends Motor{
	
	public HyundMotor2(Door door) {
		super(door);
	}
	
	//moveMotor 메소드만 Hyund모터에 맞게 재정의
	protected void moveMotor(String direction) {
		System.out.println("HYUNDAI모터 : "+direction+" 움직여라");
	}
	
}
