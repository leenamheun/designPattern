package design.abstractFactory;


enum MotorStatus { MOVING, STOPPED}

//���ø� �޼��� ���� : ��ü������ �����ϸ鼭 �κ������� �ٸ� �������� ������ �޼����� �ڵ��ߺ��� �ּ�ȭ �� �� ��
public abstract class Motor {
	private MotorStatus motorStatus;
	
	public Motor() { motorStatus= MotorStatus.STOPPED; }
	public MotorStatus getMotorStaus() { return motorStatus; }
	
	//hook�޼���
	public abstract void doStop();
	//���ø��޼���
	public void stop() { 
		if(motorStatus == MotorStatus.STOPPED) {
			return;
		}
		doStop();//���� �ݴ� ���ۼ���
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



