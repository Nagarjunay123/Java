package Programs;

import java.util.ArrayList;

public class EmplooyesDetails {
	
	private String name;
	private int id;
	private int age;
	private String place;
	private double sal;
	private String company;
	
	public EmplooyesDetails(String name, int id, int age, String place, double sal, String company) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.place = place;
		this.sal = sal;
		this.company = company;
	}
	public ArrayList details()
	{
		ArrayList a= new ArrayList();
		a.add(name);
		a.add(id);
		a.add(age);
		a.add(place);
		a.add(sal);
		a.add(company);
		return a;
	}


}
