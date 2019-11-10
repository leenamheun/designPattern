package design.composite;

public class Client {
	public static void main(String args[]){
		
		//1.
		//��ǻ���� ��ǰ���� keyboard, body, monitor��ü ����
		/*Keyboard keyboard = new Keyboard(5, 2);
		Body body = new Body(100,70);
		Monitor monitor = new Monitor(30, 30);
		
		//computer��ü�� �����ϰ� ��ǰ���� �߰� 
		Computer computer = new Computer();
		computer.addBody(body);
		computer.addKeyboard(keyboard);
		computer.addMonitor(monitor);
		
		int totalPrice = computer.getPrice();
		int totalPower = computer.getPower();
		
		System.out.println("��ǻ�� �� ��� : "+totalPrice);
		System.out.println("��ǻ�� �� ���·� : "+totalPower);
		*/
		
		//����Ŀ�� �߰��� ��� �ҽ��� ���� �Ǿ� �ϴ�  -- ocp����
		
		//2. ��ǻ���� ��ǰ�� �Ϲ�ȭ�� Ŭ���� 
		Keyboard keyboard = new Keyboard(5, 2);
		Body body = new Body(100,70);
		Monitor monitor = new Monitor(30, 30);
		
		Computer computer = new Computer();
		computer.addComponent(keyboard);
		computer.addComponent(body);
		computer.addComponent(monitor);
		
		int totalPrice = computer.getPrice();
		int totalPower = computer.getPower();
		
		System.out.println("��ǻ�� �� ��� : "+totalPrice);
		System.out.println("��ǻ�� �� ���·� : "+totalPower);
		
	}
}