package day11.inter.basic2;

public class PetHouse {

	public void carePet(IPet pet) {
		if(pet instanceof Dog) {
			Dog dog=(Dog)pet;
			dog.eating();
			dog.playing();
			System.out.println("강아지");
		}else if(pet instanceof Cat) {
			Cat cat=(Cat)pet;
			cat.eating();
			cat.playing();
			System.out.println("고양이");
		}else if(pet instanceof GoldFish){
			GoldFish fish = (GoldFish)pet;
			fish.swiming();
			fish.playing();
			System.out.println("금붕어");
		}
		



	}

	public void petInfo(IPet[] Pet) {
		
		for(IPet x : Pet) {
			System.out.print("펫 활동 : ");
			x.playing();
             
		}

	}

	


	/*
	 * 1. 메서드 생성 carePet()
	 * 매개변수 - 펫들의 공통부모타입
	 * 기능 - instanceOf 사용해서 적합한 펫타입으로 캐스팅
	 * 반환 - x
	 */

	/*
	 * 2. 메서드 생성 petInfo()
	 * 매개변수 - IPet[]
	 * 기능- 배열 반복
	 * 반환 - x
	 * 
	 */

}
