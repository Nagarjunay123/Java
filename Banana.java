package Programs;

 abstract public class Banana implements FruitImplements{

	@Override
	public void name() {
		System.out.println("Fruits name is Banana");
		
	}

	@Override
	public void colories() {
		System.out.println("Banana contains 100 colories");
		
	}

	@Override
	abstract public void nativecity();

	
}
