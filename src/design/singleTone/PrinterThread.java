package design.singleTone;

public class PrinterThread {
	
	//Printer.class�� �����ϳ� �׽�Ʈ�� ���� PrinterThread�� ����
	private static PrinterThread printer = null;
	private PrinterThread() {} 
	
	public static PrinterThread getPrinter() {
		/*
		 * ������ ����
		������ 1�� �����ڸ� ȣ���� �ν��Ͻ��� ����� �� !
		������ 2�� if���� ������ null���� Ȯ��, 
		�̶�  printer�� null�̹Ƿ� �ν��Ͻ��� ���� --> ������ 2
		���� ������ 1�� printer �ν��Ͻ��� �����ϸ� "���չ��� �߻�"
		*/
		if(printer == null ) {
			
			//try~catch ����� �ּ� ó����, ���� �ν��Ͻ��� �Ҵ�Ǵ� ���� Ȯ��
			try {
				//1ms�� ���� ��
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			printer = new PrinterThread();
		}
		return printer;
	}
	
	//����Ʈ ȣ�� �޼ҵ�
	public void print(String str) {
		System.out.println(str);
	}
}
