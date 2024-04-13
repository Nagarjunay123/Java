package Programs;

public class RemoveDigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="QSP1234JSP";
		int res=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if (Character.isDigit(ch))
			{
				int j=Character.getNumericValue(ch);//int j=ch-48;//int j=ch-'0';
				res=res+j;
			}
			
		}
		System.out.println(res);

	}

}
