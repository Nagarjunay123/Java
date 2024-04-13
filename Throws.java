package Programs;

public class Throws {
	public static void m1()
	{
		System.out.println("m1 is running");
	}
	public static void m2()
	{
		System.out.println("m2 is running");
	}
	public static void m3() throws Exception
	{
		m1();
		Thread.sleep(3000);//3 sec delay
		m2();
		Thread.sleep(3000);
		System.out.println("m3 is running");
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Main method is running");
			Thread.sleep(3000);
			m3();

	}

}
