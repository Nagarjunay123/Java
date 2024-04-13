package Programs;
/**
 * provide setters and getter for access and modification.
 * @author Nagarjuna 
 */
public class AccountDetailsAcces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails p1=new AccountDetails("Nagarjuna", 37174542215L, 9640002566L, 21, "CMZPN4272J", 872767819278L, "CKK");
		
		String ACCNAME=p1.getAccname();
		long ACCNO=p1.getAccno();
		long PHNO=p1.getPhno();
		int AGE=p1.getAge();
		String PANNO=p1.getPanno();
		long ADRNO=p1.getAadharno();
		String ADD=p1.getAdderss();
		
		System.out.println(ACCNAME);
		System.out.println(ACCNO);
		System.out.println("Please update your phno : "+PHNO);
		System.out.println("please update your age : "+AGE);
		System.out.println(PANNO);
		System.out.println(ADRNO);
		System.out.println("please update your address : "+ADD+"\n\n");
		
		p1.setPhno(9573236260l);
		p1.setAge(22);
		p1.setAdderss("HYD");
		
		PHNO=p1.getPhno();
		AGE=p1.getAge();
		ADD=p1.getAdderss();
		
		//System.out.println("---------------------------------------------------------------");
		System.out.println(ACCNAME);
		System.out.println(ACCNO);
		System.out.println("Thank you for updating your phno, now your phno is : "+PHNO);
		System.out.println("Thank you for updating your age, now your age is : "+AGE);
		System.out.println(PANNO);
		System.out.println(ADRNO);
		System.out.println("Thank you for updating your address, now your address is : "+ADD);
	}

}
