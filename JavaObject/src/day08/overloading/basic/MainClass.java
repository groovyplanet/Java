package day08.overloading.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b= new Basic();
		b.input(10);
		b.input("홍길동");
		b.input(1,3.14);
		b.input(3.14,1);
		//사실은 오버로딩된 메서드를 쓰고 있었다.
		
				

	}

}
