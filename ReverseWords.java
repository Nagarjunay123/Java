package Programs;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="my Name is Nagarjuna";
		String res="";
		String [] s=str.split(" ");
		/*for (int i=0;i<s.length;i++)
		{
			String a= s[i];
					
			for (int j = a.length()-1; j>=0; j--) {
				res=res+a.charAt(j);
			}
			res=res+" ";

		}
		System.out.println(res); // ym emaN si anujragaN*/
		
		for (int i=s.length-1;i>=0;i--)
		{
			String a= s[i];
			res=res+a+" ";

		}
		System.out.println(res); // Nagarjuna is Name my
		
	}

	}
