package superKeyword;

public class SuperConstructorChild extends SuperConstructorParent {
	
	public SuperConstructorChild()
	{
	super(5,5);
	System.out.println("This is the Child Constructor");
	}

	public static void main(String[] args) {
		
		SuperConstructorChild obj = new SuperConstructorChild();
		

	}

}
