package quiz01;

public class quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65 
		
		//아래 값은 몇이 될까요?
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2); //5
		System.out.println( !('A' <= c && c <='Z') ); //false 
		System.out.println('C'-c); // 2 char - char = int
		System.out.println(c+1); // 66  char + int = int
		System.out.println(++c); // B    ++char = char
		System.out.println(c++); // B       next
		System.out.println(c);  // C      ++char

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
