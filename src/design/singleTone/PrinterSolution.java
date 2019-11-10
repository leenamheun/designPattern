package design.singleTone;

public class PrinterSolution {
	//Printer.class�� ����
	
	
	//1. static������ �ܺο� ������ �ν��Ͻ��� �ʱ�ȭ
	private static PrinterSolution printer = new PrinterSolution();
	private PrinterSolution() {} // -- Ŭ���� �������� ���� ������ ������
	
	public static PrinterSolution getPrinter() {
		//
		if(printer == null ) {
			printer  = new PrinterSolution();
		}
		return printer;
	}
	
	//����Ʈ ȣ�� �޼ҵ�
	public void print(String str) {
		System.out.println(str);
	}
	
	//2. �Ӱ迵��
	/*private static PrinterSolution printer = new PrinterSolution();
	private PrinterSolution() {} // -- Ŭ���� �������� ���� ������ ������
	
	public static synchronized PrinterSolution getPrinter() {
		if(printer == null ) {
			printer  = new PrinterSolution();
		}
		return printer;
	}
	
	//����Ʈ ȣ�� �޼ҵ�
	public void print(String str) {
		synchronized(this) { //�Ӱ迵�� ���
			System.out.println(str);
		}
	}
	*/
	
	// �̱��� ����ȿ�� - �����޼ҵ�θ� ������ ����class�� ����
	/*private static int count =0;
	
	public synchronized static void print(String str) {
		//�޼ҵ� ����ȭ-�Ӱ豸��
		//�����尡 �ϳ��� �Ӱ豸���� �����Ѵٴ� ���� ī������ ���� Ȯ��
		System.out.println(str+"_"+(count++));
	}*/
	
	
	
	
	
}
