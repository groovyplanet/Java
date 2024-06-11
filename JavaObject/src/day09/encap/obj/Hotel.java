package day09.encap.obj;

public class Hotel {
	
	//호텔이 쉐프를 필요로 한다면?
	private Chef chef= new Chef();
	//클래스를 타입으로 보면 멤버스위치에 멤버변수가?
	
//	//호텔이 생성될 때 , 쉐프를 초기화한다.
//	public Hotel() {
//		this.chef = new Chef();
//	}
//	
//	
	
	
	public Hotel(Chef chef) { // (타입 변수명)
		//생성자
		this.chef = chef;
	}
	
	//getter / setter - 객체를 매개변수로 받는 , 객체를 반환하는 모형
	public void setChef(Chef chef) {
		this.chef = chef;
		
	}
	
	public Chef getChef() {
		//객체 반환 
		return chef;
	}
	
	
	
}
