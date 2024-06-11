package day09.encap.data;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//멤버 객체를 두개 만듬
		Member m = new Member("홍길동",20,"naver","서울시","010");
		Member m2= new Member();
		m2.setName("이순신");
		m2.setAge(20);
		m2.setEmail("google");
		m2.setAddr("경ki도");
		m2.setPhone("010");
		
		
		//객체배열에 담는다.
		Member[]arr = new Member[2];
		arr[0]=m; // 변수명(주소값)
		arr[1]=m2;
		
		
		//객체배열을 순회
		for(int i = 0; i<arr.length; i++) {
			
//			System.out.println(arr[i]);
			
//			Member member = arr[i];
			System.out.println(arr[i].getName());
			System.out.println(arr[i].getAge());
		}
		
		
		
		
//		String []arr = new String[] {"~","@@"};
		
		
		
		

	}

}
