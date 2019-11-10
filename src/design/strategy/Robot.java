package design.strategy;

public abstract class Robot {
	private String name;
	public Robot(String name ) { this.name=name;}
	public String getName() { return name;}
	
	//1. 추상메소드로 정의
	public abstract void attack();
	public abstract void move();
	
	
	
	// 2. 전략을 쉽게 바꿀 수 있는 디자인패턴 
	/*private AttackStrategy attackStrategy; 
	private MovingStrategy movingStrategy;
	
	public void setAttackStratgy(AttackStrategy attackStrategy){
		this.attackStrategy = attackStrategy;
	}
	public void setMovingStratgy(MovingStrategy movingStrategy){
		this.movingStrategy = movingStrategy;
	}
	
	public void attack() {
		attackStrategy.attack(this.getName());
	};
	public void move() {
		movingStrategy.moving(this.getName());
	};
	*/
	
}

 class TaekwonV extends Robot {
	public TaekwonV(String name) {
		super(name);//Robot의 
	}
	//1. 기본
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("나는 미사일 쏠 수 있다!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("나는 걸어다닌다!");
		
	}
 }
 
 class Atom extends Robot {

	public Atom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	//1. 기본
	@Override
	public void attack() {
		System.out.println("강한펀치!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		System.out.println("날라다니기!");
		// TODO Auto-generated method stub
		
	}
	 
 }