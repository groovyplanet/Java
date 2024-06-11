package day02;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {

		String grade;
		// 점수를 입력 받아서 학점을 부여.

		Scanner scan = new Scanner(System.in);

		System.out.print("점수 입력>");
		int point = scan.nextInt();

		if(point>=90) { 
//			grade = "A학점";
//			System.out.println(grade); 
//			// 90 이상일 때 또 다른 조건을 검사하고 싶어졌다.
			if(point>=95) {
				grade="A++학점";
				System.out.println(grade);
			} else {
				System.out.println("A학점");
			}
			
			System.out.println("축하합니다!");

		} else if(point>=80) {
			grade = "B학점";
			System.out.println(grade);

		}else if (point>=70) {
			grade = "C학점";
			System.out.println(grade);
		}
		else {
			System.out.println("재수강");
		}


	}

}
