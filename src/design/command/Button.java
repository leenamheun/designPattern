package design.command;

//1. 
class Lamp {
	public void turnOn() { 
		System.out.println("Lamp On");
	}	
}

class Alarm {
	public void start() {
		System.out.println("Alarming");
	}
}
/*1. 
public class Button {
	private Lamp theLamp;
	public Button(Lamp theLamp) {
		this.theLamp = theLamp;
	}
	public void pressed() {
		theLamp.turnOn();
	}
}*/
//2. 문제점 - 버튼에 대한 기능을 변경 
/*public class Button {
	private Alarm theAlarm;
	private Lamp theLamp;
	private String mode;
	
	public Button(Alarm theAlarm,Lamp theLamp) {
		this.theAlarm = theAlarm;
		this.theLamp = theLamp;
	}
	
	public void setMode(String mode) { this.mode = mode; }
	
	public void pressed() {
		switch(mode) {
			case "lamp" : theLamp.turnOn(); break;
			case "alarm" : theAlarm.start(); break;
		}
	}
}*/





//3. 
interface Command { 
	public abstract void execute();
}
public class Button {
	private Command command;
	
	public Button(Command command) {
		setCommand(command);
	}
	public void setCommand(Command newCommand) {
		this.command = newCommand;
	}
	
	public void pressed() {
		command.execute();
	}
}

class LampCommand implements Command{
	private Lamp lamp;
	public LampCommand(Lamp lamp) {
		// TODO Auto-generated constructor stub
		this.lamp = lamp;
	}

	public void setLamp(Lamp lamp) { this.lamp = lamp; } 
	
	@Override
	public void execute() {
		lamp.turnOn();
	}
}
class AlarmCommand implements Command{
	private Alarm alarm;
	public AlarmCommand(Alarm alarm) {
		this.alarm = alarm;
	}
	
	public void setAlarm(Alarm alarm) { this.alarm = alarm; } 
	
	@Override
	public void execute() {
		alarm.start();
	}
}

