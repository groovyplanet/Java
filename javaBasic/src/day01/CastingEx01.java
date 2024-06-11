package day01;

public class CastingEx01 {

	public static void main(String[] args) {
		
		/* 크기가 작은 타입을 큰 타입에 넣을 때는
		 * 자바 가상 머신이 자동으로 형 변환을 해줍니다.
		 */

		
		
		byte b = 10;
		
		short s = b; // byte - > short로 자동형변환 (AutoCasting)
		int i = b; // byte -> int 자동형변환
		long x = b; // byte -> long 자동형변환
		
		
		char c = '가'; // 2byte
		int j = c;  // char >> int 자동 형변환
		System.out.println(j); // 정수형이므로 44032
		
		int k = 1000;
		double d = k;
		
		System.out.println(d); // 실수형으로 자동형변환
		
		
		
		


	}

}
