package quiz15;

import java.util.Scanner;

public class TryCatch02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = (int)(Math.random()*100)+1;		
		int cnt = 0;
		while(true) {
			try {
				System.out.print("1과 100 사이의 값을 입력하세요 >");
				int a = Integer.parseInt(scan.nextLine());
				if(x<a) {
					System.out.println("더 작은 수를 입력하세요");
					cnt++;
				}else if(x>a) {
					System.out.println("더 큰 수를 입력하세요");
					cnt++;
				}else {
					cnt++;
					System.out.println("정답입니다.");
					System.out.println("시도횟수는 : "+cnt);
					break;
					
				}
				
				
			} catch (Exception e) {
				System.out.println("잘못 입력했습니다");
				cnt++;
			}
			
			
		}
		
		
		
		
	}

}
