package design.singleTone;

public class UserThread extends Thread{//Thread 상속
	private String name;
	
	public UserThread(String name) { 
		this.name = name; //각 인스턴스 이름 부여 
	}
	
	public void print() {
		
		//1, 2 
		PrinterSolution printer =PrinterSolution.getPrinter();
		//toString을 통해 동일한 instance를 확인
		printer.print(this.name+" print-using "+printer.toString());
		
		
		//3. 정적클래스로 동일효과 
		//PrinterSolution.print(this.name+" print-using "+this.toString());
		
	}
	
	//Thread run을 오버라이딩 
	public void run() {
		print(); //UserThread
	}
}

class ClientThread{
	public static int user_num = 5;
	
	public static void main(String[] args) {
		UserThread[] user = new UserThread[user_num];
		
		for( int i=0; i< user.length; i++) {
			user[i] = new UserThread(i+"");
			user[i].start();
		}
	}
 }
