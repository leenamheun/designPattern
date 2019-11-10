package design.singleTone;

public class User {
	private String name;
	
	public User(String name) { 
		this.name = name; //�� �ν��Ͻ� �̸� �ο� 
	}
	
	//����ڿ� ���� ������ ��ü�� ���� -- �����ͱ�� �ϳ��� �����ص� ���x(�̱��������� ��ȯ)
	public void print() {
		Printer printer = new Printer();
		printer.print(this.name+" print-using "+printer.toString());
	}
	
	/*public void print() {
		Printer printer =Printer.getPrinter(); 
		//toString�� ���� ������ instance�� Ȯ��
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
