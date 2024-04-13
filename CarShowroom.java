package Programs;

public class CarShowroom {

	String brand;
	int speed;
	public CarShowroom(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarShowroom c1=new CarShowroom("BMW",100);
		System.out.println(c1+" speed is "+c1.hashCode());
		c1=new CarShowroom("HONDA",150);
		System.out.println(c1+" speed is "+c1.hashCode());
		c1=new CarShowroom("JAGUAR",200);
		System.out.println(c1+" speed is "+c1.hashCode());
		c1=new CarShowroom("VW",120);
		System.out.println(c1+" speed is "+c1.hashCode());
		c1=new CarShowroom("FERRARI",180);
		System.out.println(c1+" speed is "+c1.hashCode());
		c1=new CarShowroom("RR",250);
		System.out.println(c1+" speed is "+c1.hashCode());
		c1=new CarShowroom("AUDI",50);
		System.out.println(c1+" speed is "+c1.hashCode());
		
	}
	@Override
	public String toString()
	{
		return brand;
	}
	public int hashCode()
	{
		return speed;
		
	}
	
}
