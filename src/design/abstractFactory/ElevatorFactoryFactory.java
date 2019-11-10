package design.abstractFactory;

public  class ElevatorFactoryFactory {
	
	/*public static ElevatorFactory getFactory(String vender) {
	
		ElevatorFactory elevator = null;
		switch(vender) {
			case "LG": elevator= new LgElevatorFactory(); break;
			case "Hyundai": elevator= new HyundaiElevatorFactory(); break;
			default: elevator= new SamsungElevatorFactory(); break;
		}
		return elevator;
	}*/
	
	
	//�߰� ���� - ���ø��޼��� + �̱��� ����
	public static ElevatorFactory getFactory(String vender) {
		
		ElevatorFactory elevator = null;
		switch(vender) {
			case "LG": elevator=LgElevatorFactory.getInstance(); break;
			case "Hyundai": elevator= HyundaiElevatorFactory.getInstance();  break;
			default: elevator= SamsungElevatorFactory.getInstance(); break;
		}
		return elevator;
	}
	
}



