package Programs;

import java.util.Scanner;

public class Test12LPA {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
		String s=scanner.next();
		System.out.println("Enter String length");
		int l=scanner.nextInt();
		
		String res="";
		
		char [] ch=s.toCharArray();
		int first=ch[0]-48;
		
		if(ch.length==l) {
			
			for(int i=0;i<ch.length;i++) {

				if(ch[i]-48==first) {
					res=res+ch[i];
					first++;
				}
			}
		}
		else {
			System.err.println("please, Enter valid length");
		}
		System.out.println("The sequence of Numbers is : "+res);
		System.out.println("The length of Sequence is : "+res.length());
	}
}
