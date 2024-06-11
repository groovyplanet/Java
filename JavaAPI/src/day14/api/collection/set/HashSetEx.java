package day14.api.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		//set 생성
		//HashSet <String> set =new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//값 추가
		set.add("java");
		set.add("spring");
		set.add("java");  //중복 x
		set.add("python");
		set.add("oracle");
		set.add("jsp");
		
		//set의 크기
		System.out.println("크기 : "+ set.size());
		
		System.out.println(set.toString());
		
		//set은 순서가 없는 바구니 형태이기 때문에 get()이 없습니다.(인덱스가 없다)
		//set.get() 없음
		
		//set에 들어있는 값은 전부 확인하려면 , 반복자 개념을 사용해서 확인해야 합니다.
		
		Iterator<String> iter = set.iterator(); //set 요소를 반복자 형태로 바꿈
		
		while(iter.hasNext()) {//다음이 있으면 true
			System.out.println(iter.next());
		}
		System.out.println("------------------------");
		
		for( String s : set ) {
			System.out.println(s);
		}
		
		System.out.println("---------------------------");
		
		//값의 삭제
		set.remove("java"); // index 로 삭제 기능이 없고 , 값으로 지웁니다.
		System.out.println(set.toString()); // tq wlsWk anjsthflsi
		
		//값의 포함여부
		if(set.contains("java")) { // 값이 들어있으면 true
			System.out.println("java가 포함되어 있음.");
			
		}else {
			System.out.println("java가 없음");
		}
		
		
	
	}
}
