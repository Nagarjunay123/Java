package Programs;
/**
 * provide Account Details of a person and information should be secure.
 * information are :- AccName, AccNo, PhNo, Age, PanNo, AadharNo, Address.
 * provide the getters and setters to access and modify the secure information.
 * use setters only for those information where it is require 
 * @author Nagarjuna
 */

public class AccountDetails {

	private String accname;
	private long accno;
	private long phno;
	private int age;
	private String panno;
	private long aadharno;
	private String adderss;
	
	public AccountDetails(String accname, long accno, long phno, int age, String panno, long aadharno, String adderss) {
		super();
		this.accname = accname;
		this.accno = accno;
		this.phno = phno;
		this.age = age;
		this.panno = panno;
		this.aadharno = aadharno;
		this.adderss = adderss;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
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

	public String getAccname() {
		return accname;
	}

	public long getAccno() {
		return accno;
	}

	public String getPanno() {
		return panno;
	}

	public long getAadharno() {
		return aadharno;
	}
	
	
	
}
