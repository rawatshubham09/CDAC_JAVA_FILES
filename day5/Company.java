package day5;

// we can not make outer class as Static but it should be Public
// Inner class can be Static


public class Company {
	String cname;
	String address;
	static int passcode;
	
	static class Banner // it can only access ststic variable of outer class
	{
		String msg;
		void show()
		{
			msg = "Welcome to Java";
			passcode = 12345;
			// cname = "abcinfotech"; compile time error as it is non static filed
			System.out.println(msg+" "+passcode);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Company.passcode);
		Company.Banner b = new Company.Banner(); //Static Inner Class
		b.show();
	}

}
