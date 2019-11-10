package design.singleTone;

public class UserThread extends Thread{//Thread ���
	private String name;
	
	public UserThread(String name) { 
		this.name = name; //�� �ν��Ͻ� �̸� �ο� 
	}
	
	public void print() {
		
		//1, 2 
		PrinterSolution printer =PrinterSolution.getPrinter();
		//toString�� ���� ������ instance�� Ȯ��
		printer.print(this.name+" print-using "+printer.toString());
		
		
		//3. ����Ŭ������ ����ȿ�� 
		//PrinterSolution.print(this.name+" print-using "+this.toString());
		
	}
	
	//Thread run�� �������̵� 
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
