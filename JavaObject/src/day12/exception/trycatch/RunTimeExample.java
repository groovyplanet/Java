package day12.exception.trycatch;

public class RunTimeExample {
	public static void main(String[] args) {
		
		//실행예외 - 프로그램 실행시 발생되는 예외
		//nullpointer
//		
//		String name = null;
//		name.charAt(0);
		
		//classcast
//		String s = (String)new Object();
		
		//ArrayIndexBound - 배열의 범위를 잘못 참조
//		int [] arr = {1,2,3};
//		arr[5]= 100;
		
		//NumberFormat - 문자를 숫자로 바꿀때 에러
//		int a = Integer.parseInt("홍길동"); //static 메서드
//		System.out.println(a+10);
//		//실행예외가 발생하면 , 찾아서 고민해보기
//		Integer.parseInt 메서드는 문자열을 정수로 변환하는 데 사용됩니다. 
//		예를 들어 num_list 배열의 요소들이 문자열로 주어지고 이를 정수 배열로 변환해야 하는 경우 
//		Integer.parseInt가 유용할 수 있습니다.
		
		
		System.out.println("프로그램 종료"); // 실행되지 않음.
		
	}

}
