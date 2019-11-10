package design.singleTone;

public class PrinterSolution {
	//Printer.class와 동일
	
	
	//1. static변수에 외부에 제공할 인스턴스를 초기화
	private static PrinterSolution printer = new PrinterSolution();
	private PrinterSolution() {} // -- 클래스 내에서만 생성 가능한 생성자
	
	public static PrinterSolution getPrinter() {
		//
		if(printer == null ) {
			printer  = new PrinterSolution();
		}
		return printer;
	}
	
	//프린트 호출 메소드
	public void print(String str) {
		System.out.println(str);
	}
	
	//2. 임계영역
	/*private static PrinterSolution printer = new PrinterSolution();
	private PrinterSolution() {} // -- 클래스 내에서만 생성 가능한 생성자
	
	public static synchronized PrinterSolution getPrinter() {
		if(printer == null ) {
			printer  = new PrinterSolution();
		}
		return printer;
	}
	
	//프린트 호출 메소드
	public void print(String str) {
		synchronized(this) { //임계영역 블록
			System.out.println(str);
		}
	}
	*/
	
	// 싱글톤 동일효과 - 정적메소드로만 구성된 정적class로 구성
	/*private static int count =0;
	
	public synchronized static void print(String str) {
		//메소드 동기화-임계구역
		//쓰레드가 하나씩 임계구역에 접근한다는 것을 카운팅을 통해 확인
		System.out.println(str+"_"+(count++));
	}*/
	
	
	
	
	
}
