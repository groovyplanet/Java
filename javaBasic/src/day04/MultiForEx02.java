package day04;

import java.util.Scanner;

public class MultiForEx02 {

	public static void main(String[] args) {
		// 사각형 출력.
		/*
		 * 가로 5 세로 4
		 * *****
		 * *****
		 * *****
		 * *****
		 * 
		 */
		
		
		Scanner scan = new Scanner(System.in);
		
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i = 1 ; i<=b; i++) { //세로
			for(int j= 1 ; j<=a; j++) { //가로
				System.out.print("★");
			}
			System.out.println(); //줄 바꿈
		}
		
		
		

	}

}
