package day3;

public class Mathematic {
	public int square(int num)// for integer value
	{
		return num*num;
	}
	
	public float square(float num) // for float value
	{
		return num*num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mathematic n = new Mathematic();
		
		System.out.println("Number 3 = "+ n.square(3));
		System.out.println("Number 0.2 = "+ n.square(0.2f));
	}

}
