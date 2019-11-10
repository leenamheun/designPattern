package design.singleTone;

public class PrinterThread {
	
	//Printer.class와 동일하나 테스트를 위해 PrinterThread로 변경
	private static PrinterThread printer = null;
	private PrinterThread() {} 
	
	public static PrinterThread getPrinter() {
		/*
		 * 문제의 원인
		스레드 1이 새성자를 호출해 인스턴스를 만들기 전 !
		스레드 2가 if문을 실행해 null인지 확인, 
		이때  printer는 null이므로 인스턴스가 생성 --> 스레드 2
		이후 스레드 1도 printer 인스턴스를 생성하며 "경합문제 발생"
		*/
		if(printer == null ) {
			
			//try~catch 블록을 주석 처리시, 여러 인스턴스가 할당되는 것을 확인
			try {
				//1ms의 텀을 줌
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			printer = new PrinterThread();
		}
		return printer;
	}
	
	//프린트 호출 메소드
	public void print(String str) {
		System.out.println(str);
	}
}
