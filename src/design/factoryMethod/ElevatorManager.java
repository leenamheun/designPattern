package design.factoryMethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


//3.템플릿 메서드 패턴을 정의
//public abstract class ElevatorManager {

//1,2  기본
public class ElevatorManager {
	private List<ElevatorController> controllers;
	private Scheduler scheduler ; 
	private String strategyId;
	
	//1. 기본엘레베이터 스케쥴러 생성
	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//엘리베이터 객체를 만듬
		for(int i=0; i<count;i++) {
			controllers.add( new ElevatorController(i)) ;
		}
		
		scheduler = new Scheduler();
		
	}

	public List<ElevatorController> getContollers(){
		return controllers;
	}

	
	//요청에 의해 엘레베이터 선택, 목적지로 이동! 
	void reqElevator(int dest) {
	
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}

//2-1. startegy 전략
/*	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//엘리베이터 객체를 만듬
		for(int i=0; i<count;i++) {
			controllers.add( new ElevatorController(i)) ;
		}
		
		
		2-1 startegy 전략
		전략이 변경됨에 따라 전략클래스(SchedulerX)를 생성해야 할 뿐만 아니라 
		소스를 수정해야 한다. 
		더 나아가 reqElevator까지도 변경이 가능할 수 있기에 좋은 방식X - selectElevator변경시 
		
	
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour < 12) {//12시 이전으로 분기 
			scheduler =new Scheduler1();
		}else {
			scheduler =new Scheduler2();
		}
		
	}
	//스케쥴러에서 추출
	public List<ElevatorController> getContollers(){
		return controllers;
	}

	
	//요청에 의해 엘레베이터 선택, 목적지로 이동! 
	void reqElevator(int dest) {
	
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}
*/
	
//2-2. startegy 전략 - 팩토리로구성
/*	private SchedulerFactory factory;
	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//엘리베이터 객체를 만듬
		for(int i=0; i<count;i++) {
			controllers.add( new ElevatorController(i));
		}
		//factor객체생성
		factory = new SchedulerFactory();
	}
	public ElevatorManager(int count, String strategyId) {
		this(count);
		this.strategyId = strategyId;
	}
	
	public void setStrategy(String strategyId) {
		this.strategyId = strategyId;
	} 
	
	//스케쥴러에서 추출
	public List<ElevatorController> getContollers(){
		return controllers;
	}

	
	//요청에 의해 엘레베이터 선택, 목적지로 이동! 
	void reqElevator(int dest) {
		scheduler = factory.getScheduler(strategyId);
	
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}
	 */
	
	
	
//3.팩토리 메소드로 구현 -- 해당 클래스 abstract로 변경
/*	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//엘리베이터 객체를 만듬
		for(int i=0; i<count;i++) {
			controllers.add( new ElevatorController(i)) ;
		}
	}
	
	public ElevatorManager(int count, String strategyId) {
		this(count);
		this.strategyId = strategyId;
	}
	
	public void setStrategy(String strategyId) {
		this.strategyId = strategyId;
	} 
			
	//스케쥴러에서 추출
	public List<ElevatorController> getContollers(){
		return controllers;
	}

	//--- 팩토리 메서드 : 스케줄링 전략 객체를 제공.
	protected abstract Scheduler getScheduler();
	
	//요청에 의해 엘레베이터 선택, 목적지로 이동! 
	void reqElevator(int dest) {
		
		Scheduler scheduler = getScheduler();//hook메소드
		
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}
*/	
}
	
	
