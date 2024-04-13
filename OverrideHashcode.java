package Programs;

public class OverrideHashcode {

	int a;
	public OverrideHashcode(int a)
	{
		this.a=a;
	}
	public static void main(String[] args) {
		OverrideHashcode h1=new OverrideHashcode(20);
		OverrideHashcode h2= new OverrideHashcode(10);
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
	}
	@Override
	public int hashCode()
	{
		return a;
	}
}
