package design.singleTone;

public class Printer {

	//1. �ܺ�ȣ�� ������ ������
	public Printer() { } 
	
	
	
	//2. singleTone - �ܺο� ������ �ڽ��� �ν��Ͻ� 
	/*private static Printer printer = null;
	public static Printer getPrinter() {
		if(printer == null ) {
			printer  = new Printer();
		}
		return printer;
	}*/
	
	
	
	//����Ʈ ȣ�� �޼ҵ�
	public void print(String str) {
		System.out.println(str);
	}
}
