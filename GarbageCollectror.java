package Programs;

public class GarbageCollectror {
	
	int a;
	public GarbageCollectror(int a)
	{
		this.a=a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollectror g1= new GarbageCollectror(10);
		GarbageCollectror g2= new GarbageCollectror(20);
		GarbageCollectror g3= new GarbageCollectror(30);
		GarbageCollectror g4= new GarbageCollectror(40);
		GarbageCollectror g5= new GarbageCollectror(50);
		g1=null;//REMOVING THE DATA THEN OBJECT BECOME NULL
		g2=null;//REMOVING THE DATA THEN OBJECT BECOME NULL
		g3=null;//REMOVING THE DATA THEN OBJECT BECOME NULL
		g4=null;//REMOVING THE DATA THEN OBJECT BECOME NULL
		g5=null;//REMOVING THE DATA THEN OBJECT BECOME NULL
		
		System.gc();//CALLING THE GARBAGE COLLECTOR
		
	}
	protected void finalize()//IMPLICITLY INVOKE THE GARBAGE COLLECTOR
	{
		System.out.println("Object de-ref and cleaned successfully");
	}

}
