package accessModifiers;

public class Access2 {
	
	

	public static void main(String[] args) {
		
		Access1 obj = new Access1();
		obj.display();
		//obj.display1(); //is protected. so cannot invoke
		obj.display2();
		obj.display3();
		

	}

}
