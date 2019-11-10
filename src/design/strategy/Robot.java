package design.strategy;

public abstract class Robot {
	private String name;
	public Robot(String name ) { this.name=name;}
	public String getName() { return name;}
	
	//1. �߻�޼ҵ�� ����
	public abstract void attack();
	public abstract void move();
	
	
	
	// 2. ������ ���� �ٲ� �� �ִ� ���������� 
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
		super(name);//Robot�� 
	}
	//1. �⺻
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("���� �̻��� �� �� �ִ�!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("���� �ɾ�ٴѴ�!");
		
	}
 }
 
 class Atom extends Robot {

	public Atom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	//1. �⺻
	@Override
	public void attack() {
		System.out.println("������ġ!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		System.out.println("����ٴϱ�!");
		// TODO Auto-generated method stub
		
	}
	 
 }