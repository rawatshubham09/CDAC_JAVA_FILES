package inherit;

class Software
{  
//	Software(){
//		
//		System.out.println("software no argument ");
//	}
	
    Software(int y)
	{   
		System.out.println("software with argument");
	}
}
class Hardware extends Software
{
//	Hardware ()
//	{
//		System.out.println("Hardware no argument");
//	}
	Hardware(int p)
	{   
		super(p);
		System.out.println(" Hardware with argument");
	}
	
}
public class DuleInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hardware r= new Hardware(333);
	}

}
