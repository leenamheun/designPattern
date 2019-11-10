package design.factoryMethod;

import java.util.Calendar;
import java.util.List;


public class SchedulerFactory{
	public SchedulerFactory() {}
	
	
	//2-2 elevatorManager에서 관장하던 '스케쥴링 방식 선택(전략)'을 여기서 한다
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
			if(hour < 12) {//12시 이전으로 분기 
				scheduler =new Scheduler1();
			}else {
				scheduler =new Scheduler2();
			}
			break;
			
		}
		return scheduler;
	}*/
	
	
/*	//2-3위의 방식은 매번 스케쥴링을 생성 --> 싱글톤 방식으로 변경
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
			if(hour < 12) {//12시 이전으로 분기 
				scheduler =Scheduler1.getInstance();
			}else {
				scheduler =Scheduler2.getInstance();
			}
			break;
			
		}
		//System.out.println("동일 전략 확인  ::"+scheduler.toString());
		
		return scheduler;
	}*/
	
}
