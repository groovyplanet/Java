package day09.modi.member.pac1;

public class A {
	public int var1;
	int var2;
	private int var3;
	
	//반환유형 이름() {
	public void methode01 () {} 
	void methode02() {}
	private void methode03() {}
	
	//생성자
	public A() {
		var1=1;
		var2=2;
		var3=3;
		methode01();
		methode02();
		methode03();
	}
	/////////////////////////
	//같은 패키지 안에서만 접근이 가능 protected
	//단, 패키지가 다르더라도 , super 키워드를 통해서 접근이 가능하다.
	protected int var;
	protected A(int i) {
		
	}
	protected void method() {
		
	}
	
	
	
	
}
