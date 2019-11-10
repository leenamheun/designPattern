package design.factoryMethod;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


//3.���ø� �޼��� ������ ����
//public abstract class ElevatorManager {

//1,2  �⺻
public class ElevatorManager {
	private List<ElevatorController> controllers;
	private Scheduler scheduler ; 
	private String strategyId;
	
	//1. �⺻���������� �����췯 ����
	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//���������� ��ü�� ����
		for(int i=0; i<count;i++) {
			controllers.add( new ElevatorController(i)) ;
		}
		
		scheduler = new Scheduler();
		
	}

	public List<ElevatorController> getContollers(){
		return controllers;
	}

	
	//��û�� ���� ���������� ����, �������� �̵�! 
	void reqElevator(int dest) {
	
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}

//2-1. startegy ����
/*	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//���������� ��ü�� ����
		for(int i=0; i<count;i++) {
			controllers.add( new ElevatorController(i)) ;
		}
		
		
		2-1 startegy ����
		������ ����ʿ� ���� ����Ŭ����(SchedulerX)�� �����ؾ� �� �Ӹ� �ƴ϶� 
		�ҽ��� �����ؾ� �Ѵ�. 
		�� ���ư� reqElevator������ ������ ������ �� �ֱ⿡ ���� ���X - selectElevator����� 
		
	
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		if(hour < 12) {//12�� �������� �б� 
			scheduler =new Scheduler1();
		}else {
			scheduler =new Scheduler2();
		}
		
	}
	//�����췯���� ����
	public List<ElevatorController> getContollers(){
		return controllers;
	}

	
	//��û�� ���� ���������� ����, �������� �̵�! 
	void reqElevator(int dest) {
	
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}
*/
	
//2-2. startegy ���� - ���丮�α���
/*	private SchedulerFactory factory;
	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//���������� ��ü�� ����
		for(int i=0; i<count;i++) {
			controllers.add( new ElevatorController(i));
		}
		//factor��ü����
		factory = new SchedulerFactory();
	}
	public ElevatorManager(int count, String strategyId) {
		this(count);
		this.strategyId = strategyId;
	}
	
	public void setStrategy(String strategyId) {
		this.strategyId = strategyId;
	} 
	
	//�����췯���� ����
	public List<ElevatorController> getContollers(){
		return controllers;
	}

	
	//��û�� ���� ���������� ����, �������� �̵�! 
	void reqElevator(int dest) {
		scheduler = factory.getScheduler(strategyId);
	
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}
	 */
	
	
	
//3.���丮 �޼ҵ�� ���� -- �ش� Ŭ���� abstract�� ����
/*	public ElevatorManager(int count) {
		controllers = new ArrayList<ElevatorController>(count);
		
		//���������� ��ü�� ����
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
			
	//�����췯���� ����
	public List<ElevatorController> getContollers(){
		return controllers;
	}

	//--- ���丮 �޼��� : �����ٸ� ���� ��ü�� ����.
	protected abstract Scheduler getScheduler();
	
	//��û�� ���� ���������� ����, �������� �̵�! 
	void reqElevator(int dest) {
		
		Scheduler scheduler = getScheduler();//hook�޼ҵ�
		
		ElevatorController elevator = scheduler.selectElevator(this, dest);
		elevator.gotoFloor(dest);
	}
*/	
}
	
	
