package inheritance;

public class MultipleClass implements MultipleParent1,MultipleParent2{
	
	public void show()
	{
		System.out.println("Multiple Child");
	}

	public static void main(String[] args) {
		
		MultipleClass obj = new MultipleClass();
		obj.display();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Display method");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print method");
		
	}

}
