package day09.modi.member.pac2;

import day09.modi.member.pac1.A;

public class C {
	
	public C() {
	
	A a = new A(); // A 생성
	
	a.var1 = 1;
//	a.var2 = 2; // default (x)
//	a.var3 = 3; //private (x)
	a.methode01();
//	a.methode02();// default (x)
//	a.methode03(); // private (x)
	
	
	/////////////////////////////
	//protected
//	A aa= new A(1);
//	aa.var = 1;
//	aa.method();

	}
}
