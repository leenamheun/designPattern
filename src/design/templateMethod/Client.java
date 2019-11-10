package design.templateMethod;

public class Client{
	public static void main (String[] args) {
		Door door = new Door();
		HyundMotor hm = new HyundMotor(door);
		
		hm.move("UP");
		
		//동일하게 LGMotor로 변경할 경우 HyndMotor와 동일하게 LGMotor를 작성
		LGMotor lg = new LGMotor(door);
		lg.move("DOWN");
		
		/*System.out.println("===팩토리 템플릿 메소드 적용===");
		
		//동일한 메소드를 Motor클래스로 정의해놓고, 각자 모터클래스에 맞게끔 구현
		LGMotor2 lg2 = new LGMotor2(door); //--ConcreteClass 구현클래스
		HyundMotor2 hm2 = new HyundMotor2(door);
		
		lg2.move("RIGHT"); //--Motor의 move : 템플릿메서드
		lg2.move("LEFT");
		hm2.move("DOWN");*/
		
	}
	
}
