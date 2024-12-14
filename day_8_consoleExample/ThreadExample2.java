package day_8_consoleExample;


class Thr3 extends Thread
{
	public void run()
	{
		try {
		for(int i=0; i<10;i++)
		{
			System.out.println("Welcome_out_1");
			
				Thread.sleep(1000);
			} }
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
