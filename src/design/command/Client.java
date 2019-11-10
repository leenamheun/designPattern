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
		
		//��ư ���� -- ���� �ѱ� 
		btn.pressed();
		
		AlarmCommand aCommand = new AlarmCommand(new Alarm());
		
		//��ư�� Ŀ��带 ����
		btn.setCommand(aCommand);

		//��ư ���� -- �˶��︮�� 
		btn.pressed();
		
		
		
		
	}
}
