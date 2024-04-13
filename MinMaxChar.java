package Programs;

import java.util.Scanner;

public class MinMaxChar {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter your String");
		String str=scan.nextLine();
		System.out.println("Original String is : "+str);
		
		All_In_One a1=new All_In_One();
		String result=a1.duplicate(str);
		
		String minch=String.valueOf(a1.minChar(str,result));
		System.out.println("Minimum times occuring character is : "+minch);
		
		System.out.println("Enter characters to replace minimum occuring character");
		String minreplace=scan.next();
		
		String maxchar=String.valueOf(a1.maxchar(str,result));
		System.out.println("Maximum times occuring character is : "+maxchar);
		
		System.out.println("Enter characters to replace maximum occuring character");
		String maxcharreplace=scan.next();

		String finalstring=a1.FinalString(str,minch,minreplace,maxchar,maxcharreplace);
		System.out.println("Minimun occuring character is replacing with "+minreplace+" and Maximum occuring character is replacing with "+maxcharreplace+" then result is : "+finalstring);
		scan.close();
	}
	
}
