package design.factoryMethod;

import java.util.Calendar;
import java.util.List;


public class SchedulerFactory{
	public SchedulerFactory() {}
	
	
	//2-2 elevatorManager���� �����ϴ� '�����층 ��� ����(����)'�� ���⼭ �Ѵ�
	/*public Scheduler getScheduler(String strategyId) {
		Scheduler  scheduler;
		
		switch(strategyId) {
		case "A" : 
			scheduler = new Scheduler1();
			break;
		case "B" : 
			scheduler = new Scheduler2();
			break;
		default :
			int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			if(hour < 12) {//12�� �������� �б� 
				scheduler =new Scheduler1();
			}else {
				scheduler =new Scheduler2();
			}
			break;
			
		}
		return scheduler;
	}*/
	
	
/*	//2-3���� ����� �Ź� �����층�� ���� --> �̱��� ������� ����
	public Scheduler getScheduler(String strategyId) {
		Scheduler  scheduler;
		
		switch(strategyId) {
		case "A" : 
			scheduler = Scheduler1.getInstance();
			break;
		case "B" : 
			scheduler = Scheduler2.getInstance();
			break;
		default :
			int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			if(hour < 12) {//12�� �������� �б� 
				scheduler =Scheduler1.getInstance();
			}else {
				scheduler =Scheduler2.getInstance();
			}
			break;
			
		}
		//System.out.println("���� ���� Ȯ��  ::"+scheduler.toString());
		
		return scheduler;
	}*/
	
}
