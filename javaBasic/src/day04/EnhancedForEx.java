package day04;

public class EnhancedForEx {
	
	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,5,6,7,8,9}; 
		//마지막 인덱스는 8 이므로 , i<arr.lengrth;
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		//향상된 for 문
		for(int v:arr) {
			System.out.println(v); //배열의 값을 순서대로 v에 담는다.
			
		}
		System.out.println("------------------------------");
		
		char[]arr2= {'A','B','C','D','E'};
		
		for(char c:arr2) {
			System.out.println(c);
		}
		System.out.println("------------------------------");
		
		int[] score = {33, 55, 43,23,43,66};
		int sum=0;
		
		//향상된 for문을 이용해서 합계와 평균(실수부분)을 출력
		for(int x:score) {
			sum+=x;
			
		}
		 
		System.out.println("합계는:"+sum);
		System.out.println("평균은:"+(double)sum/score.length);
	}
		


	}


