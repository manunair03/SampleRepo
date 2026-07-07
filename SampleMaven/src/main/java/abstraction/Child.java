package abstraction;

public class Child extends Parent {

	public static void main(String[] args) {
		
	Child obj = new Child();
	obj.print();
	obj.show();
	obj.show1();
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		System.out.println("I am Parent");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show1() {
		System.out.println("Example");
		// TODO Auto-generated method stub
		
	}

}
