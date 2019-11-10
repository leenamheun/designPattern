package design.factoryMethod;

public class ElevatorController {
	private int id;
	private int currFloor;
	
	public ElevatorController(int id) {
		this.id = id;
		this.currFloor =1; 
	}
	
	
	public void gotoFloor(int dest) {
		System.out.print("Elevator["+id+"] : "+ currFloor);
		
		currFloor = dest; //현재 층 - 목적지로 변경
		System.out.println(" ===> " +currFloor);
	}
	
}
