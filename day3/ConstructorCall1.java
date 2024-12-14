package day3;

public class ConstructorCall1 {
	int id;
	String name;
	
	ConstructorCall1(int x, String y)
	{
		id = x;
		name = y;
	}
	
	void show()
	{
		System.out.println("Name :"+name+", Id : "+ id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorCall1 obj1 = new ConstructorCall1(33,"Pankaj"); 
		ConstructorCall1 obj2 = new ConstructorCall1(22,"Sachine"); 
		
		obj1.show();
		obj2.show();

	}

}
