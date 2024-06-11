package day05;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		//배열문법
		int[] arr; // 배열 선언
		
		//배열생성
		arr=new int[5];
		
		//초기화
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열의 모형을 문자열로 확인
		System.out.println(Arrays.toString(arr));
		System.out.println(arr); //주소값 : 어딘가 만들어진 주소
		
		//배열의 길이
		System.out.println("배열의 길이: "+arr.length);
		
		//배열을 선언하는 다양한 방법들
		int[] arr2 = new int[7]; //초기화가 안됨
		int[] arr3 = {1,2,3,4,5,6}; // 초기화까지 함께 진행 
		int[] arr4 = new int[] {1,2,3,4,5}; //위 두개가 합쳐진 모습
		
		//배열은 값을 지정하지 않으면 , 기본값으로 초기화
		// 0, 0.0 , false , 문자열 null
		System.out.println(Arrays.toString(arr2));

	}

}
