package day09.modi.construct.pac1;

public class B {
	A a = new A(1);//public (o) >> 당연히 가능
	A a2 = new A(true);//default (o) > 같은 패키지이기에 가능
//	A a3 = new A("홍"); //private (x) >> 클래스 바깥으로 벗어남으로써 접근 불가능

}
