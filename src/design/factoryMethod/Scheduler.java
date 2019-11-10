package design.factoryMethod;

import java.util.List;
//1.
public class Scheduler { 
	
	public Scheduler() {
	}
	
	//스케쥴링에 의해 엘레베이터 선택!
	public ElevatorController selectElevator(ElevatorManager manager, int dest) {
		List<ElevatorController> list = manager.getContollers();
		//..스케줄링 방식 
		return list.get(0); //임의로 선택
	}
}



//2,3. statagy전략 적용
/*public interface Scheduler{
	
	public ElevatorController selectElevator(ElevatorManager manager, int dest) ;
}

class Scheduler1 implements Scheduler{
	
	public Scheduler1() {}
	public ElevatorController selectElevator(ElevatorManager manager, int dest) {
		List<ElevatorController> list = manager.getContollers();
		
		return list.get(1); //임의로 선택
	}	
	
	//3.singleTone전략
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
		
		return list.get(2); //임의로 선택
	}	
	
	//싱글톤 방식을 위한
	public static Scheduler scheduler = null;
	public static Scheduler getInstance() {
		if(scheduler == null) {
			scheduler  =new Scheduler2();
		}
		return scheduler;
	}
}*/


//3. 팩토리 메소드
//scheduler1에 대한 하위 클래스
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

//scheduler2에 대한 하위 클래스
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










