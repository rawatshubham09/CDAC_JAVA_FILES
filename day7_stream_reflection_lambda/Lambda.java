package day7_stream_reflection_lambda;


@FunctionalInterface
interface Testing
{
	void test();
}
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ======================method local class========================
		class Software implements Testing
		{
			public void test()
			{
				System.out.println("Testing data");
			}
		}
		Testing s = new Software();
		s.test();
		
		// ======================local anonymous class======================
		Testing s1 = new Testing()
		{
			public void test()
			{
				System.out.println("Anynomous Testing data");
			}
		};
		s1.test();
		
		// =========================using lambda=============================
		Testing t1 = ()->System.out.println("Welcome to lambda testing data");
		t1.test();
	}

}
