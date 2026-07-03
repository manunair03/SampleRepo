package polymorphism;

public class Child extends Parent{
	
	public void print(int a, int b)
	{
		super.print(10,10);
		int c = a - b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Child obj = new Child();
		obj.print(50, 5);
		// TODO Auto-generated method stub

	}

}
