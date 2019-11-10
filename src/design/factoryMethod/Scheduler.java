package design.factoryMethod;

import java.util.List;
//1.
public class Scheduler { 
	
	public Scheduler() {
	}
	
	//�����층�� ���� ���������� ����!
	public ElevatorController selectElevator(ElevatorManager manager, int dest) {
		List<ElevatorController> list = manager.getContollers();
		//..�����ٸ� ��� 
		return list.get(0); //���Ƿ� ����
	}
}



//2,3. statagy���� ����
/*public interface Scheduler{
	
	public ElevatorController selectElevator(ElevatorManager manager, int dest) ;
}

class Scheduler1 implements Scheduler{
	
	public Scheduler1() {}
	public ElevatorController selectElevator(ElevatorManager manager, int dest) {
		List<ElevatorController> list = manager.getContollers();
		
		return list.get(1); //���Ƿ� ����
	}	
	
	//3.singleTone����
	public static Scheduler scheduler = null;
	public static Scheduler getInstance() {
		if(scheduler == null) {
			scheduler  =new Scheduler1();
		}
		return scheduler;
	}
	
	
}
class Scheduler2 implements Scheduler{
	public ElevatorController selectElevator(ElevatorManager manager, int dest) {
		List<ElevatorController> list = manager.getContollers();
		
		return list.get(2); //���Ƿ� ����
	}	
	
	//�̱��� ����� ����
	public static Scheduler scheduler = null;
	public static Scheduler getInstance() {
		if(scheduler == null) {
			scheduler  =new Scheduler2();
		}
		return scheduler;
	}
}*/


//3. ���丮 �޼ҵ�
//scheduler1�� ���� ���� Ŭ����
/*class ElevatorWithScheduler1 extends ElevatorManager{
	public ElevatorWithScheduler1(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Scheduler getScheduler() {
		// TODO Auto-generated method stub
		return Scheduler1.getInstance();
	}
	
}

//scheduler2�� ���� ���� Ŭ����
class ElevatorWithScheduler2 extends ElevatorManager{
	public ElevatorWithScheduler2(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Scheduler getScheduler() {
		// TODO Auto-generated method stub
		return Scheduler2.getInstance();
	}
}*/










