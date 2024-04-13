package Programs;

import java.util.ArrayList;

public class EmployeeDetailsImp {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al=new ArrayList();
		EmplooyesDetails ed1=new EmplooyesDetails("Nag",101,21,"kmm",2000.0,"Abc");
		EmplooyesDetails ed2=new EmplooyesDetails("Vijay",102,22,"Hyd",3000.0,"def");
		EmplooyesDetails ed3=new EmplooyesDetails("Om",103,23,"Hyd",4000.0,"ghi");
		EmplooyesDetails ed4=new EmplooyesDetails("vardan",104,24,"kn",5000.0,"jkl");
		EmplooyesDetails ed5=new EmplooyesDetails("koti",105,25,"hyd",6000.0,"mno");
		
		al.add(ed1.details());
		al.add(ed2.details());
		al.add(ed3.details());
		al.add(ed4.details());
		al.add(ed5.details());
		
		for(int i=0;i<al.size();i++)
		{
			//if(al.get(i).contains("Hyd"));
			System.out.println(al.get(i));
		}
		//System.out.println());

	}

}
