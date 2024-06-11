package day11.inter.basic2;

public class Dog extends Animal implements IPet{

	@Override
	public void eating() {
		System.out.println("강아지는 사료를 먹어용");
		
	}

	@Override
	public void playing() {
		System.out.println("갱얼쥐는 밖에서 놀아용");
		
	}

}
