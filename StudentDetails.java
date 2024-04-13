package Programs;
/**
 * provide Student Details of a Student and information should be secure.
 * information are :- Name, RollNo, Age, SchoolName, nativeCity, Address.
 * provide the getters and setters to access and modify the secure information.
 * use setters only for those information where it is require 
 * @author Nagarjuna
 */
public class StudentDetails {
	
	private String name;
	private int rollno;
	private int age;
	private String schoolname;
	private String nativecity;
	private String adderss;
	public StudentDetails(String name, int rollno, int age, String schoolname, String nativecity, String adderss) {
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.schoolname = schoolname;
		this.nativecity = nativecity;
		this.adderss = adderss;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	public String getName() {
		return name;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public String getNativecity() {
		return nativecity;
	}
	
	
	

}
