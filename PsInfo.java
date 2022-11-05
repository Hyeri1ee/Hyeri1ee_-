package generics;

public class PsInfo {

	private String name;
	private int age;
	private String address;
	private String cellPhone;
	public PsInfo(String name, int age, String address, String cellPhone) {
		
		this.name = name;
		this.age = age;
		this.address = address;
		this.cellPhone = cellPhone;
	}
	@Override
	public String toString() {
		String info;
		info = "\t이름 : "+name+",\t나이 : "+age+"세 \t, 주소 : "+address+"\t, 이동전화번호 : "+cellPhone;
		return info;
	}
	
	
	
	
}
