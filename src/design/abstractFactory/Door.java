package design.abstractFactory;


enum DoorStatus { CLOSED, OPENED }

//���ø� �޼��� ���� : ��ü������ �����ϸ鼭 �κ������� �ٸ� �������� ������ �޼����� �ڵ��ߺ��� �ּ�ȭ �� �� ��
public abstract class Door {
	private DoorStatus doorStatus;
	
	public Door() { doorStatus= DoorStatus.CLOSED; }
	public DoorStatus getDoorStaus() { return doorStatus; }
	
	//hook�޼���
	public abstract void doClose();
	//���ø��޼���
	public void close() { 
		if(doorStatus == DoorStatus.CLOSED) {
			return;
		}
		doClose();//���� �ݴ� ���ۼ���
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


//--���ο� ��ü �߰� 
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



