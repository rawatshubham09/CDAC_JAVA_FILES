package day_10_synchro;

class EvenThread extends Thread
{
	public void  run()
	{
		try 
		{
			for (int i=1; i<=20; i++)
			{
				if (i%2==0) {
					System.out.println("Even : "+ i);
					Thread.sleep(1000);
				}
			}
		}catch (Exception e) {
			
		}
	}
}

class OddThread extends Thread
{
	public void  run()
	{
		try 
		{
			for (int i=1; i<=20; i++)
			{
				if (i%2!=0) {
					System.out.println("Odd : "+ i);
					Thread.sleep(1000);
				}
			}
		}catch (Exception e) {
			
		}
	}
}

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EvenThread t1 = new EvenThread();
		OddThread t2 = new OddThread();
		
		t1.start();
		t2.start();
	}

}
