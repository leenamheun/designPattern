package design.strategy;


//�������̽�
public interface AttackStrategy {
	public void attack(String str);
}




//��ü���� Ŭ����
class MisaileStrategy implements AttackStrategy {
	public void attack(String str) {
		System.out.println("MisailAttack :"+str);
	}
}

class PunchStrategy implements AttackStrategy {
	public void attack(String str) {
		System.out.println("PunchAttack :"+str);
	}
}
