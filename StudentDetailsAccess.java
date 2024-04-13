package Programs;

public class StudentDetailsAccess {

	public static void main(String[] args) {
		StudentDetails s1=new StudentDetails("Nagarjuna", 201, 21, "ZPHS", "KHAMMAM", "KHAMMAM");
		String NAME=s1.getName();
		int ROLLNO=s1.getRollno();
		int AGE=s1.getAge();
		String SCHOOLNAME=s1.getSchoolname();
		String NATIVECITY=s1.getNativecity();
		String ADDRESS=s1.getAdderss();
		
		System.out.println(NAME);
		System.out.println(ROLLNO);
		System.out.println(AGE);
		System.out.println(SCHOOLNAME);
		System.out.println(NATIVECITY);
		System.out.println(ADDRESS);
		s1.setRollno(501);
		s1.setAge(22);
		s1.setAdderss("HYD");
		ROLLNO=s1.getRollno();
		AGE=s1.getAge();
		ADDRESS=s1.getAdderss();
		System.out.println(NAME);
		System.out.println(ROLLNO);
		System.out.println(AGE);
		System.out.println(SCHOOLNAME);
		System.out.println(NATIVECITY);
		System.out.println(ADDRESS);
	}
}
