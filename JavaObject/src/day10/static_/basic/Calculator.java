package day10.static_.basic;

public class Calculator {
	
	//언제 static 멤버를 쓰면 좋을까?
	
	/*
	 * 계산기마다 다른 값을 가져야하면 , 일반 멤버 변수가 됩니다.
	 * 계산기마다 원주율은 동일하기 때문에 , static으로 선언하면 좋습니다.
	 */
	
	private String color; //계산기 색상
	private int result; // 계산기의 값
	
	public static double pi; // PI
	
	
	static {
		//클래스가 호출될 때 딱 한번만 실행되는 특징을 가집니다.
		pi = 3.14; // static 변수의 초기화
		System.out.println("static 블록 실행됨!!!");
	}
	
	
	/*
	 * 일반 멤버변수 , 메서드를 사용하는 메서드는 일반 메서드로 만듭니다.
	 */
	
	public void setColor(String color) {
		this.color = color;
		
	}
	public String getColor() {
		return color;
	}
	
	/*
	 * 메서드 내부에서 일반 멤버변수를 쓰지 않고,
	 * 범용성 있게 사용할 메서드는 static을 붙이면 좋습니다.
	 */
	
	
	public static double circle(int r) {
		return pi*r*r;
	}
	//위와 같이 범용성이 좋은 메서드는 static을 붙여주면 좋다.
	
	

}
