package day04;

public class BreakEx03 {

	public static void main(String[] args) {
		// 중첩반복에서 break
		//탈출을 위한 변수를 활용
//		boolean bool = false;
//		for(char c='A'; c<='Z'; c++) {
//
//			for(char l = 'a'; l<='z'; l++) {
//				System.out.println(c+"-"+l);
//				if(l=='e') {
//					bool = true; //if 문을 실행했음을 나타냄.
//					break;
//
//					//break는 break가 몇개가 있든 , 가장 가까운 반복문으로 탈출한다.
//				}
//			} if(bool) { //true였으면 완전탈출
//				break ;
//				// flag 변수
//				
//			}
//		}
		//이름붙이기
		//중첩반복문에서 바깥 반복문을 완전히 탈출하려면, 탈출할 반복문에 이름을 붙여줍니다.
		ex:for(char c = 'A'; c<='Z';c++) {
			
			for(char l = 'a'; l<='z';l++) {
				System.out.println(c+"-"+l);
				if(l=='e') {
					break ex; //탈출할 반복문 이름
					
				}
			
			}
		}
		
		
	}

}
