package design.singleTone;

public class User {
	private String name;
	
	public User(String name) { 
		this.name = name; //각 인스턴스 이름 부여 
	}
	
	//사용자에 따라 프린터 객체를 생성 -- 프린터기는 하나만 존재해도 상관x(싱글톤방식으로 전환)
	public void print() {
		Printer printer = new Printer();
		printer.print(this.name+" print-using "+printer.toString());
	}
	
	/*public void print() {
		Printer printer =Printer.getPrinter(); 
		//toString을 통해 동일한 instance를 확인
		printer.print(this.name+" print-using "+printer.toString());
	}*/
}



class Client{
	public static int user_num = 5;
	
	public static void main(String[] args) {
		User[] user = new User[user_num];
		
		for( int i=0; i< user.length; i++) {
			user[i] = new User(i+"");
			user[i].print();
		}
	}
 }
