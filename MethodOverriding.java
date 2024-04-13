package Programs;

public class MethodOverriding extends MethodOverLoading{
	
	public void a()
	{
		System.out.println("A1");
	}
	public void b()
	{
		System.out.println("b1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m1= new MethodOverriding();
		m1.a();
		m1.b();
		

	}

}
