package superKeyword;

public class SuperMethodChild extends SuperMethodParent {
	
	public void display()
	{
		super.print();
		System.out.println("This is the Child class");
	}

	public static void main(String[] args) {
		
		SuperMethodChild obj = new SuperMethodChild();
		obj.display();
		// TODO Auto-generated method stub

	}

}
