package design.composite;

public class Client {
	public static void main(String args[]){
		
		//1.
		//컴퓨터의 부품으로 keyboard, body, monitor객체 생성
		/*Keyboard keyboard = new Keyboard(5, 2);
		Body body = new Body(100,70);
		Monitor monitor = new Monitor(30, 30);
		
		//computer객체를 생성하고 부품들을 추가 
		Computer computer = new Computer();
		computer.addBody(body);
		computer.addKeyboard(keyboard);
		computer.addMonitor(monitor);
		
		int totalPrice = computer.getPrice();
		int totalPower = computer.getPower();
		
		System.out.println("컴퓨터 총 비용 : "+totalPrice);
		System.out.println("컴퓨터 총 전력량 : "+totalPower);
		*/
		
		//스피커가 추가될 경우 소스가 변경 되야 하는  -- ocp위반
		
		//2. 컴퓨터의 부품을 일반화한 클래스 
		Keyboard keyboard = new Keyboard(5, 2);
		Body body = new Body(100,70);
		Monitor monitor = new Monitor(30, 30);
		
		Computer computer = new Computer();
		computer.addComponent(keyboard);
		computer.addComponent(body);
		computer.addComponent(monitor);
		
		int totalPrice = computer.getPrice();
		int totalPower = computer.getPower();
		
		System.out.println("컴퓨터 총 비용 : "+totalPrice);
		System.out.println("컴퓨터 총 전력량 : "+totalPower);
		
	}
}