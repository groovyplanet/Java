package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i<=10; i++) {

			if(i%2==0) {
				continue; 
				//조건이랑 같이 쓴다 . 조건문을 충족했을 때 반복문의 다음으로 넘어간다.
			}

			System.out.println(i);
		}
		System.out.println("--------------------------------");

		int i=1;
		while(i<=10) {
		
			
		if(i==5) {
			i++;
			
			
			continue;
		}System.out.println(i);
		i++;
		

	}

}
}