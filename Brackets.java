package Programs;

import java.util.Scanner;

public class Brackets {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		String s="{{}}{}(())()";
		System.out.println("Enter String for desired output");
		String in=scanner.next();
		boolean res=false;
		if(s.contains(in)) {
			res=true;
		}
		System.out.println(res);

	}

}
