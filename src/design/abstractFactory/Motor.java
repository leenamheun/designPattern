package design.abstractFactory;


enum MotorStatus { MOVING, STOPPED}

//템플릿 메서드 패턴 : 전체적으로 동일하면서 부분적으로 다른 구문으로 구성된 메서드의 코드중복을 최소화 할 수 있
public abstract class Motor {
	private MotorStatus motorStatus;
	
	public Motor() { motorStatus= MotorStatus.STOPPED; }
	public MotorStatus getMotorStaus() { return motorStatus; }
	
	//hook메서드
	public abstract void doStop();
	//템플릿메서드
	public void stop() { 
		if(motorStatus == MotorStatus.STOPPED) {
			return;
		}
		doStop();//문을 닫는 동작수행
		motorStatus= MotorStatus.STOPPED; 
	}
	
	
	public abstract void doMove();
	public void move() {
		if(motorStatus == MotorStatus.MOVING) {
			return;
		}
		doMove();
		motorStatus = MotorStatus.MOVING; 
	}
	
}


class LGMotor extends Motor{

	@Override
	public void doStop() {
		// TODO Auto-generated method stub
		System.out.println("stop LG motor");
	}

	@Override
	public void doMove() {
		// TODO Auto-generated method stub
		System.out.println("move LG motor");
	}
	
}

class HyundaiMotor extends Motor{
	
	@Override
	public void doStop() {
		// TODO Auto-generated method stub
		System.out.println("stop Hyundai motor");
	}

	@Override
	public void doMove() {
		// TODO Auto-generated method stub
		System.out.println("move Hyundai motor");
	}
}



