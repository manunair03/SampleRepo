package aggregation;

public class Child {
	
	String city, state;
	Parent ref;
	
	public Child(String city, String state, Parent ref)
	{
		this.city = city;
		this.state = state;
		this.ref = ref;
		
	}
	
	public void print()
	{
		System.out.println(ref.name);
		System.out.println(ref.rollno);
		System.out.println(ref.address);
		System.out.println(city);
		System.out.println(state);
	}

	public static void main(String[] args) {
		
		Parent obj = new Parent("Manu","Exit 25, texas",10);
		Child obj1 = new Child("LA", "USA",obj);
		obj1.print();
		// TODO Auto-generated method stub

	}

}
