package day09.modi.construct.pac2;

import day09.modi.construct.pac1.A;

public class C {
	A a = new A(1);//public (o) >> 당연히 가능
//	A a2 = new A(true);//default (x) > 패키지가 동일하지 않기에 불가능
//	A a3 = new A("홍"); //private (x) >> 클래스 바깥으로 벗어남으로써 접근 불가능

}
