package Programs;

public class EqualMetthod {
	int a;
	public EqualMetthod(int a)
	{
		this.a=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualMetthod e1= new EqualMetthod(10);
		EqualMetthod e2= new EqualMetthod(10);
		System.out.println(e1==e2);//compare address level
		System.out.println(e1.equals(e2));//compare content level because of override equals method

	}
	public boolean equals(Object obj)//syntax of equals method and implicitly upCasting 
	{
		int x=this.a;
		EqualMetthod e3= (EqualMetthod)obj;
		int z=e3.a;
		return x==z;
		//return this.a==((EqualMetthod)obj).a; //code minimization
		
	}

}
