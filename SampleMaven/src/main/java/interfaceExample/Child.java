package interfaceExample;

public class Child implements Parent {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print();
		obj.display();
		// TODO Auto-generated method stub

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
