package design.singleTone;

public class Printer {

	//1. 외부호출 가능한 생성자
	public Printer() { } 
	
	
	
	//2. singleTone - 외부에 제공할 자신의 인스턴스 
	/*private static Printer printer = null;
	public static Printer getPrinter() {
		if(printer == null ) {
			printer  = new Printer();
		}
		return printer;
	}*/
	
	
	
	//프린트 호출 메소드
	public void print(String str) {
		System.out.println(str);
	}
}
