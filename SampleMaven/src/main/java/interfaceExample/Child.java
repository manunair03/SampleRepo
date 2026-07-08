package interfaceExample;

public class Child implements Parent {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		obj.display();
		obj.show();
		// TODO Auto-generated method stub
		
		// reference creation
		
		//interfacename objectname = new class name();
		Parent obj1 = new Child();
		obj1.display();
		obj1.print();
		
		
	}
	
	public void show ()
	{
		System.out.println("Child Class");
	}

	@Override
	public void print() {
		System.out.println("Sample");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display() {
		System.out.println("Sample2");
		// TODO Auto-generated method stub
		
	}

}
