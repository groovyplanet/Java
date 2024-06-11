package day11.abstract_.good;

public class MainClass {
	
	public static void main(String[] args) {
		//추상클래스는 객체 생성이 안됩니다.
		//추상클래스를 사용하려면
		//자식으로 생성해서 , 부모타입에 저장하고 이것을 객체추상화라고 부릅니다.
//		Store s = new Store();
		
		Store s = new BusanStore();//new SeoulStore(); 
		//다형성 - 객체 추상화 (자식으로 만들어서 부모님 타입에 저장) 
		//하나의 변수에 다양한 클래스 가능
		s.melon();
		s.apple();
		s.orange();
		s.mango();//부모님한테 상속받은 메서드 사용 가능.
		String name = s.getName();//부모님한테 상속받은 메서드.
		System.out.println(name);
	}

}
