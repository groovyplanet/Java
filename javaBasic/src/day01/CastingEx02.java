package day01;

public class CastingEx02 {

	public static void main(String[] args) {
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환 할 때는 (type) 캐스팅을 사용해서
		 * 명시적 형변환을 해야합니다.
		 */
		
		int i = 70;
		char c = (char)i; // (저장된 타입이 문자형) c -> 알파벳 F
		byte b = (byte)i; // 70
		
		System.out.println(c);

		double d = 3.14;
		int j = (int)d; // 3 = d를 int 값으로 만들었기 때문에 소숫점 자리는 무시된다.
		System.out.println(j); 
		
		
		/*주의할 점
		 * 명시적 형 변환 시에 값을 저장할 수 없는 범위가 되면 , 잘려나간 값이 저장됩니다.
		 */
		
		int k = 1000;
		byte b2 = (byte) k;
		System.out.println(b2); 
		
		//예외적으로 형 변환을 해야하는 경우
		// char(문자형) -> short(숫자형) ,
		
		char cc = 'A';
		short ss = (short)cc;
		
		
		
		
		
		
	}
}
