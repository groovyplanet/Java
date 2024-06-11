package day04;

import java.util.Scanner;

public class MultiForEx03 {

	public static void main(String[] args) {
		
		//바깥 반복 횟수에 따라서 다르게 회전하는 반복문
		
		Scanner scan = new Scanner(System.in);
		
//		for(int i =1 ; i<=5; i++) {
//			
//			for(int j=1; j<= i; j++) {
//				System.out.println(i+"-"+j);
//			}
//		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		int star = 5;
		
		for(int i = 1 ; i<=star; i++)
		{
			for(int j=1; j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println(); //줄바꿈
		}
		System.out.println("------------------------------");
		
	
		
//		for(int i = 1 ; i<=star; i++) //세로
//		{
//			for(int j=1; j<=star+1-i;j++) { //가로
//				System.out.print("*");
//				
//			}
//			System.out.println(); //줄바꿈
//		
//		
//
//	}
		
		for(int i = 1 ; i<=star; i++) {
			for(int j = star+1-i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------------");
		
		/*
		 * 별을 찍기 전 공백을 출력하라.
		 * 바깥 반복문 = 행
		 * 내부 반복문 = 출력
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****
		 ******
		 *
		 */
		
		
//		for(int i = 1 ; i<=star; i++)// 세로
//		{
//			for(int j=1; j<=5;j++) { // 가로 
//				if(j>=star+1-i) {
//				System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println(); //줄바꿈
//		}
//		
		
		for(int i = 1; i<= star; i++) {
			for(int j=1; j<=star-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {//별을 출력하는 for문
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------------------");
		
		/*
		 * 별을 찍기 전 공백을 출력하라.
		 *       *
		 *      ***
		 *     *****
		 *    *******
		 *   *********
		 *
		 */
		
//		for(int i = 1 ; i<=star; i++)// 세로
//		{
//			for(int j=1; j<=9;j++) { // 가로 
//				//세로 i가 1일때 가로 j가 1234 6789가 별이 생기지 않아야 함.
//				// i가 1일때 j 값은 5 
//				// i가 2일때 j 값은 456
//				//    5
//				//   456
//				//  34567
//				// 2345678
//				//123456789
//				if(j>=star+1-i && j<star+i) {
//				System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(); //줄바꿈
//		}
		
		for(int i = 1 ; i <= star ; i++){ //i는 세로
			for(int j = 1; j<=star-i; j++) {//j는 가로 공백 찍음
				System.out.print(" ");
			}
			for(int j= 1; j<=i*2-1;j++) { //별 찍음 1,3,5,7,9 -i값에 따라서
		     
		    	 System.out.print("*");
		     }
			System.out.println();
				
			}
	

	

		
		
		
		
		
		
		
		
	}	
		
		}

	
