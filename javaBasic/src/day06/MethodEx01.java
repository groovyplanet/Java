package day06;

public class MethodEx01 {

	public static void main(String[] args) {
		
		
		/*
		 * 메서드는 , 다른 메서드안에서 선언할 수 없음.
		 * main은 사실 메서드입니다.
		 * -main 밖에 클래스 안 어디서든 선언할 수 있습니다.
		 */
		
		//함수의 호출
		int result = calsum();
		System.out.println("1~10까지의 합 "+result);
		int result2 = calsum();
		System.out.println("1~10까지의 합"+result2);
		
		String result3 = randomStr();
		System.out.println("결과:"+result3);

		//리턴이 있는 함수는 출력문 안에서 바로 호출이 됩니다.
		System.out.println("결과 : "+randomStr());
		
		
	}
	
	
	//반환유형 + 이름
	static int calsum() {
		//우리가 여태 배웠던 코드를 모두 쓸 수 있음.
		System.out.println("calsum 호출");
		//1~10까지 합계
		int sum = 0;
		for(int i= 1; i<=10; i++) {
			sum+=i;
		}
		
		
		return sum; // 호출위치로 다시 돌아감	
	}

	static String randomStr() {
		
		String str = "";
		
		for(char c='A'; c<= 'Z'; c++) {
			str+=c;
		}
		
		
		
		return str;
	}


}
