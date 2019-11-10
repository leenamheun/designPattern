package design.abstractFactory;

public class DoorFactory {
	
	public static Door createDoor(String vender) {
		Door door=null ;
		
		switch(vender) {
			case "LG": door = new LGDoor(); break;
			case "Hyundai": door = new HyundaiDoor(); break;
		}
		return door;
	}

}

