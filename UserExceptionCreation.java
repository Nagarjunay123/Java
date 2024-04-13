package Programs;

public class UserExceptionCreation {

	public void eligible(int age) throws Exception
	{
		if (age>=18) 
		{
			System.out.println("Congratulation your eligible to give vote");			
		}
		else
		{
			throw new Exception("Better luck next time");
		}
	}
	public static void main(String[] args) throws Exception {

		UserExceptionCreation uec= new UserExceptionCreation();
		uec.eligible(17);

	}

}
