package vo;

public class PersonVO {
	private String name;
	private int age;
	
	public PersonVO( String name, int age ) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
}
