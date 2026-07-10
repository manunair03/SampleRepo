package exceptionHandling;

public class ThrowHandling {

	public static void main(String[] args) {
		int age = 10;
		if(age>=18)
		{
			System.out.println("Eligble for Voting");
		}
		else
		{
			throw new ArithmeticException("Age unde 18!!!");
		}

	}

}
