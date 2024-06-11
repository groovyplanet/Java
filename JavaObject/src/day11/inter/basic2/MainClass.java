package day11.inter.basic2;

public class MainClass {
	public static void main(String[] args) {
		//Dog는 세가지 타입이 될 수 있습니다.
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		Animal[]arr = {dog,cat,tiger};
		
		for(Animal ani : arr) {
		ani.eating();
		}
		
		System.out.println("------------------------------------");
		//IPet 배열을 생성하고 , Ipet에 들어갈 수 있는 타입은 , dog, cat, goldfish
		IPet[] arr2 = new IPet[3];
		arr2[0]=(IPet)dog; //Animal과 IPet관계가 없지만 , dog가 상호 연관성이 있으면 , 형변환이 됩니다.
		arr2[1]=(IPet)cat;
		arr2[2]=new GoldFish(); //금붕어> IPet으로 자동 형변환
		
		for(IPet pet : arr2) {
			pet.playing();
			
		}
		System.out.println("------------------------------------");
		PetHouse house = new PetHouse();
		house.carePet((IPet)dog);
		house.carePet((IPet)cat);
		house.carePet(new GoldFish());
		house.petInfo(arr2);
		
		
		
		
	}

}
