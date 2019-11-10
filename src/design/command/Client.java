package design.command;

public class Client {
	public static void main(String[] args) {
		
		//1. 
		/*Lamp lamp = new Lamp();
		Button lampBtn = new Button(lamp);
		lampBtn.pressed();
		*/
		
		Lamp lamp = new Lamp();
		LampCommand lCommand = new LampCommand(lamp);
		
		Button btn = new Button(lCommand);
		
		//버튼 누름 -- 램프 켜기 
		btn.pressed();
		
		AlarmCommand aCommand = new AlarmCommand(new Alarm());
		
		//버튼에 커멘드를 변경
		btn.setCommand(aCommand);

		//버튼 누름 -- 알람울리기 
		btn.pressed();
		
		
		
		
	}
}
