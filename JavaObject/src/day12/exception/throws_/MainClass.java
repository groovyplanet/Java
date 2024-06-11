package day12.exception.throws_;

public class MainClass {

	public static void main(String[] args) {

		try {
			new ThrowsEx02();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("예외처리 완료");
		}
		System.out.println("프로그램 정상 종료"); //강제종료
	}

}
