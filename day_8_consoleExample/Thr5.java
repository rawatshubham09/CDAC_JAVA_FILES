package day_8_consoleExample;


public class Thr5 implements Runnable
{
	@Override
	public void run()
	{
		try {
			for(int i=0; i<10; i++)
			{
				System.out.println("Hello Runnable");
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			
		}
	}
}

