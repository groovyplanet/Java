package day09.encap.data;

public class Member {
	
	//단순히 데이터를 저장하는 용도의 클래스 dto
	private String name;
	private int age;
	private String email;
	private String addr;
	private String phone;
	
	public Member() { // 기본 생성자 = ctrl + space
		// TODO Auto-generated constructor stub
	}
	
	
	//생성자를 빠르게 만드는 방법 //alt +shift + s constructor using field
	public Member(String name, int age, String email, String addr, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.addr = addr;
		this.phone = phone;
	}
	
	
	
	
	
	public String getName() {//alt +shift + s generate getter and setter
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	

}
