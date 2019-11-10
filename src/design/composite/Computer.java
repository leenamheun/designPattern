package design.composite;

import java.util.ArrayList;
import java.util.List;

//1.
//3개의 Leaf
/*class Keyboard{
	private int price;
	private int power;
	
	public Keyboard(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	public int getPrice() { return this.price; }
	public int getPower() { return this.power; }
	
}
class Body{
	private int price;
	private int power;
	
	public Body(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	public int getPrice() { return this.price; }
	public int getPower() { return this.power; }
	
}
class Monitor{
	private int price;
	private int power;
	
	public Monitor(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	public int getPrice() { return this.price; }
	public int getPower() { return this.power; }
}

//composite
public class Computer {
	private Keyboard keyboard;
	private Monitor monitor;
	private Body body;
	
	
	public void addKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}
	public void addMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public void addBody(Body body) {
		this.body = body;
	}
	
	public int getPrice() {
		int kPrice = keyboard.getPrice();
		int mPrice = monitor.getPrice();
		int bPrice = body.getPrice();
		
		return kPrice + mPrice + bPrice; 
	}
	
	public int getPower() {
		return keyboard.getPower()+monitor.getPower()+body.getPrice();
	}

}*/



//2.
//component
abstract class ComputerDevice {
	public abstract int getPrice();
	public abstract int getPower();
	
}

//3개의 leaf
class Keyboard extends ComputerDevice{
	private int price;
	private int power;
	
	public Keyboard(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	//
	public int getPrice() { return this.price; }
	public int getPower() { return this.power; }
	
}
class Body extends ComputerDevice {
	private int price;
	private int power;
	
	public Body(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	public int getPrice() { return this.price; }
	public int getPower() { return this.power; }
	
}
class Monitor extends ComputerDevice {
	private int price;
	private int power;
	
	public Monitor(int price, int power) {
		this.price = price;
		this.power = power;
	}
	
	public int getPrice() { return this.price; }
	public int getPower() { return this.power; }
}

//composite
public class Computer extends ComputerDevice{
	List<ComputerDevice> components = new ArrayList<ComputerDevice>();
	
	public void addComponent(ComputerDevice component) {
		components.add(component);
	}
	
	public int getPrice() {
		int totalPrice=0;
		for(ComputerDevice component : components) {
			totalPrice += component.getPrice();
		}
		
		return totalPrice;
	}
	
	public int getPower() {
		int totalPower=0;
		for(ComputerDevice component : components) {
			totalPower += component.getPower();
		}
		
		return totalPower;
	}

}

