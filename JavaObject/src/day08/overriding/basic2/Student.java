package day08.overriding.basic2;

public class Student extends Person{
	

	String subjectId;
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + subjectId;
		//overriding
	}
	
	


}
