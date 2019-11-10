package design.strategy;

public class Client {
	public static void main(String args[]){
		Robot taekwonV = new TaekwonV("태권브이");
		Robot atom = new Atom("아톰");
		
		
		//1. 기본
		System.out.println("내이름은 :"+ taekwonV.getName());
		taekwonV.attack();
		taekwonV.move();
		
		System.out.println(" ==== ");
		
		System.out.println("내이름은 :"+ atom.getName());
		atom.attack();
		atom.move();
		
		
		//2. strategy전략에선 전략을 주입하여 Robot에 대한 기능들을 간편하게 변경
		//전략주입
		/*taekwonV.setAttackStratgy(new MisaileStrategy());
		atom.setAttackStratgy(new AttackStrategy() {
			@Override
			public void attack(String str) {
				//클라이언트에서 익명함수로 주입
				System.out.println("client call attack! "+str);
			}
		});
		
		taekwonV.setMovingStratgy(new RunningStrategy());
		atom.setMovingStratgy(new FlyingStrategy());
		
		// 호출
		taekwonV.attack();
		taekwonV.move();
		
		atom.attack();
		atom.move();
		
		System.out.println("-- 전략 변경 -- ");
		
		// 전략 변경 후 재호출
		taekwonV.setMovingStratgy(new FlyingStrategy());
		atom.setMovingStratgy(new RunningStrategy());
		
		taekwonV.move();
		atom.move();*/
		
	}
}