package day07.import_ex;

import java.util.Scanner;

//import day07.abc.Apple; // 불러오기 import
//import day07.abc.Melon;

import day07.abc.*; // 아스타링크 두가지의 뜻  (곱하기 , 모두 다)

public class MainClass {

	public static void main(String[] args) {
		//abc패키지에 있는 Apple를 사용
		
		Apple apple = new Apple(); //동일한 이름을 가지고 있는 클래스들이 많음
		//내가 import를 뭘 했냐에 따라 사용하는게 달라질 수 있음.
		
		Melon melon =new Melon();
		//Melon = 데이터 타입. melon = 변수명.
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println(melon); //주소값이 나오는 참조 타입?
		
		int a= 1;
		double b = 3.14; // 기본타입 변수 - 스택에 값을 저장
		
	}
	
}
