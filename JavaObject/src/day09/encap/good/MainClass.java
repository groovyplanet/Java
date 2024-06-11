package day09.encap.good;

public class MainClass {
	public static void main(String[] args) {
		
		MyDate me = new MyDate(); 
		
//		me.setYear(2025);
		
		me.setYear(2024);
		int year = me.getYear();
		
		
		me.setMonth(5);
		me.setDay(21);
		me.setSsn("900000-1122356");
		
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		
		System.out.println("년도:"+year);
		System.out.println(month);
		
	}

}
