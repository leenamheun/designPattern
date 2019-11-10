package design.abstractFactory;


enum DoorStatus { CLOSED, OPENED }

//템플릿 메서드 패턴 : 전체적으로 동일하면서 부분적으로 다른 구문으로 구성된 메서드의 코드중복을 최소화 할 수 있
public abstract class Door {
	private DoorStatus doorStatus;
	
	public Door() { doorStatus= DoorStatus.CLOSED; }
	public DoorStatus getDoorStaus() { return doorStatus; }
	
	//hook메서드
	public abstract void doClose();
	//템플릿메서드
	public void close() { 
		if(doorStatus == DoorStatus.CLOSED) {
			return;
		}
		doClose();//문을 닫는 동작수행
		doorStatus = DoorStatus.CLOSED; 
	}
	
	
	public abstract void doOpen();
	public void open() {
		if(doorStatus == DoorStatus.OPENED) {
			return;
		}
		doOpen();
		doorStatus = DoorStatus.OPENED; 
	}
	
}


class LGDoor extends Door{

	@Override
	public void doClose() {
		// TODO Auto-generated method stub
		System.out.println("close LG Door");
	}

	@Override
	public void doOpen() {
		// TODO Auto-generated method stub
		System.out.println("open LG Door");
	}
	
}

class HyundaiDoor extends Door{
	
	@Override
	public void doClose() {
		// TODO Auto-generated method stub
		System.out.println("close Hyundai Door");
	}

	@Override
	public void doOpen() {
		// TODO Auto-generated method stub
		System.out.println("open Hyundai Door");
	}
}


//--새로운 업체 추가 
class SamsungDoor extends Door{
	
	@Override
	public void doClose() {
		// TODO Auto-generated method stub
		System.out.println("close samsung Door");
	}
	
	@Override
	public void doOpen() {
		// TODO Auto-generated method stub
		System.out.println("open samsung Door");
	}
}



