package day11.inter.basic3;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 인터페이스 타입으로 선언하고 , 구현체에 따라서 다른 클래스가 호출됩니다.
		 * 
		 * ex) 
		 * 콘센트 220v - 뭐 꽂았냐에 따라 기능이 달라짐.
		 */
		
		
		Printed print = new Samsung();//new Lg(); //lg 구현체로 구현됨.
		
		print.print("hello world");
		print.colorPrint("good by...","검정");
		print.copy(5);
	}

}
