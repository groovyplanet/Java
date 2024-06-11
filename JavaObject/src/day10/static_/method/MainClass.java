package day10.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.a=10;
		c.method01();
		c.method02();
		
		//static 메서드의 사용 - 클래스명.메서드명()
		Count.method02();
		
		
		MainClass m = new MainClass(); // 객체로 생성 . 
		m.test(); // void 메서드 사용.
		
		//비밀
		Math.random(); //static 메서드
		Arrays.toString(new int [3]);
		String.valueOf(false);
		Integer.parseInt("3");
		
		
		

	}
	
	public void test() {
		//반환 불가 void 바로 static 사용 불가.
		
		
		
	}

}
