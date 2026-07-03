package inheritance;

public class HerirachialChild1 extends HerirachialParent {
	public void child()
	{
		System.out.println("This is the first child");
	}

public static void main(String args[])
{
	HerirachialChild1 obj = new HerirachialChild1();
	obj.parent();
	obj.child();
}
}
