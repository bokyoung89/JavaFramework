package day0427.example1;

public class Company {
	
	String name;
	String address;
	String phone;
	
	public Company(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void printInfo() {
		System.out.println("------ 회사 정보 ------");
		System.out.println("회사명=" + name);
		System.out.println("주소=" + address);
		System.out.println("전화번호=" + phone);
	}

}
