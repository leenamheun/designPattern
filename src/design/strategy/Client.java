package design.strategy;

public class Client {
	public static void main(String args[]){
		Robot taekwonV = new TaekwonV("�±Ǻ���");
		Robot atom = new Atom("����");
		
		
		//1. �⺻
		System.out.println("���̸��� :"+ taekwonV.getName());
		taekwonV.attack();
		taekwonV.move();
		
		System.out.println(" ==== ");
		
		System.out.println("���̸��� :"+ atom.getName());
		atom.attack();
		atom.move();
		
		
		//2. strategy�������� ������ �����Ͽ� Robot�� ���� ��ɵ��� �����ϰ� ����
		//��������
		/*taekwonV.setAttackStratgy(new MisaileStrategy());
		atom.setAttackStratgy(new AttackStrategy() {
			@Override
			public void attack(String str) {
				//Ŭ���̾�Ʈ���� �͸��Լ��� ����
				System.out.println("client call attack! "+str);
			}
		});
		
		taekwonV.setMovingStratgy(new RunningStrategy());
		atom.setMovingStratgy(new FlyingStrategy());
		
		// ȣ��
		taekwonV.attack();
		taekwonV.move();
		
		atom.attack();
		atom.move();
		
		System.out.println("-- ���� ���� -- ");
		
		// ���� ���� �� ��ȣ��
		taekwonV.setMovingStratgy(new FlyingStrategy());
		atom.setMovingStratgy(new RunningStrategy());
		
		taekwonV.move();
		atom.move();*/
		
	}
}