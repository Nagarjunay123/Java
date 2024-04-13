package Programs;

public class OverrideToString {

	public String countryName;

	private OverrideToString(String countryName) {
		this.countryName = countryName;
		System.out.println(countryName);
	}
	
	public static void main(String[] args) {
		OverrideToString c1=new OverrideToString("INDIA");
		
		c1= new OverrideToString("USA");
	
		c1=new OverrideToString("AUSTRALIA");

		c1= new OverrideToString("CANADA");

		c1= new OverrideToString("CHINA");
		
		
	}
	
}
