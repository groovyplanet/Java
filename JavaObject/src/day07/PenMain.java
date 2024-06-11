package day07;

public class PenMain {

	public static void main(String[] args) {
		
		//클래스명 변수명 = new 클래스명 ();
		Pen black = new Pen();
		black.ink="검정색";
		black.price=2000;
		black.company="모나미";
		
		black.write();
		
		//빨간펜 "new"라는 키워드를 만날때마다 완전 새로운 객체가 생성된 것.
		//위와 아래는 완전히 다른 객체이다.
		Pen red = new Pen();
		red.ink = "빨간색";
		red.price = 1000;
		red.company="하이테크";
		
		red.write();
		
		black.info();
		red.info();
		

		///////////////////////
		Variable v = new Variable();
		v.printNum(10);
		
		
	}

}
