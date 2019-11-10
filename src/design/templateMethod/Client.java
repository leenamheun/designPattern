package design.templateMethod;

public class Client{
	public static void main (String[] args) {
		Door door = new Door();
		HyundMotor hm = new HyundMotor(door);
		
		hm.move("UP");
		
		//�����ϰ� LGMotor�� ������ ��� HyndMotor�� �����ϰ� LGMotor�� �ۼ�
		LGMotor lg = new LGMotor(door);
		lg.move("DOWN");
		
		/*System.out.println("===���丮 ���ø� �޼ҵ� ����===");
		
		//������ �޼ҵ带 MotorŬ������ �����س���, ���� ����Ŭ������ �°Բ� ����
		LGMotor2 lg2 = new LGMotor2(door); //--ConcreteClass ����Ŭ����
		HyundMotor2 hm2 = new HyundMotor2(door);
		
		lg2.move("RIGHT"); //--Motor�� move : ���ø��޼���
		lg2.move("LEFT");
		hm2.move("DOWN");*/
		
	}
	
}
