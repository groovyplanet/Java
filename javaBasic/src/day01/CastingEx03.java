package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		//연산시에도 형변환이 일어납니다.
		char c ='A';
		int i = 2;
		
		//연산에서의 형변환
		//int보다 작은 타입의 연산은 무조건 int가 됩니다.
		System.out.println(c+i); // int
		char cc =(char)(c +i);
		
		System.out.println(cc); // int
		
		byte b1 = 3;
		byte b2 = 5;
		int b3 = b1 + b2 ;
		
		//int보다 큰 타입의 연산은 무조건 큰 타입을 따라가게 됩니다.
		int k = 3;
		double d = 3.14;
		System.out.println(k+d); // 따라서, double형
		
		int z = 4;
		float p = 1.1213f;
		System.out.println(z+p); // 따라서, float형
		
		boolean x = !true;
		System.out.println(x);
		


		
		


	}

}
