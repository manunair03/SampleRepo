package exceptionHandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {
		
		int age = 10;
		if(age>=18)
		{
			System.out.println("Eligble for Voting");
		}
		else
		{
			throw new VotingException("Age unde 18!!!");
		}
		
		

	}

}
