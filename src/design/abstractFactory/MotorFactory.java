package design.abstractFactory;

public class MotorFactory {
	
	public static Motor createMotor(String vender) {
		Motor motor=null ;
		
		switch(vender) {
			case "LG": motor = new LGMotor(); break;
			case "Hyundai": motor = new HyundaiMotor(); break;
		}
		return motor;
	}

}

