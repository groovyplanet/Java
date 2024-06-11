package day07;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone red = new Phone(); //new 생성자()
		
		red.info();
		
		Phone black = new Phone("검정"); //pColor 호출
		
		black.info();
		
		Phone white = new Phone("흰색",100000);
		white.info();
		
		Phone blue = new Phone(200000,"파랑색");
		blue.info();
		
		//(색상 , 가격 ,모델)을 받는 생성자를 만들고 객체로 생성해보세요.
		
		Phone shadow = new Phone("블랙",1000000,"아이폰ZX");
		shadow.info();
		
		
	}

}
