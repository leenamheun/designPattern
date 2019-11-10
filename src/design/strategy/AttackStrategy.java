package design.strategy;


//인터페이스
public interface AttackStrategy {
	public void attack(String str);
}




//구체적인 클래스
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
