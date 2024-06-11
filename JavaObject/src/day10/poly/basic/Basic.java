package day10.poly.basic;


/*
 * 하나의 클래스 파일에는 여러 클래스 선언이 가능합니다.
 * 단 파일명과 동일한 클래스가 있어야하고 , 해당 클래스만 public이어야 합니다.
 */

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class Basic {
	
	int x = 1;
	double y = x; // int > double로 형변환
	
	A a = new A(); // 멤버변수 a에 A 클래스를 삽입 자식이 부모에 저장.
	B b = new B(); // b 선언
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b; //B -> A 클래스로 형변환 부모에 자식 저장됨 a1은 b의 형질을 가지나, 주소값은 a에 있다
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	//상속 관계가 없으면 다형성이 불가능
//	B b2 = new E(); 반드시 상속으로 이루어져있어야 가능.
	
	//object에는 모든 클래스가 저장됩니다.
	Object o1 = a;
	Object o2 = 3.14;
	Object o3 = "홍길동";
	Object o4 = new A();
	

	
	B b1 = d;
	
	
	


}
