package encapsulation;

public class Encap1 {
	
	private String name;
	private int age;
	
	public void setter(String name, int age)//for setting values
	{
		this.name = name;
		this.age = age;
		
	}
	
	public void getter() // for getting values
	{
		System.out.println(name);
		System.out.println(age);
		
	}

}
