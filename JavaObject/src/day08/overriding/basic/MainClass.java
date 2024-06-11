package day08.overriding.basic;

public class MainClass {
	public static void main(String[] args) {
		Child c = new Child(); 
			c.method01(); //물려받은 메서드
			c.method02(); //오버라이딩 된 메서드 
			//-- 똑같은 메서드 이름이나 , 자식 클래스가 임의로 수정한 값.
		

	}
	
}
