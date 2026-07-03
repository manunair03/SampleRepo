package inheritance;

public class HerirachialChild2 extends HerirachialParent {
	public void child2()
{
		System.out.println("This is the second child");
}
	public static void main(String args[])
	{
		HerirachialChild2 obj = new HerirachialChild2();
		obj.parent();
		obj.child2();
		
		
	}
	

}
