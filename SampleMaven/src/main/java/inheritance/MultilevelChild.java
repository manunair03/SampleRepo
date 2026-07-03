package inheritance;

public class MultilevelChild extends MultilevelParent {
	public void child()
	{
		System.out.println("This is the Child");
	}

	public static void main(String[] args) {
		MultilevelChild obj = new MultilevelChild();
		obj.grandparent();
		obj.parent();
		obj.child();
		// TODO Auto-generated method stub

	}

}
