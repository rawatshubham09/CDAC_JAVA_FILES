package day_8_consoleExample;

public class Thr6 implements Runnable{
	
	Thread t;
	String msg;
	public Thr6(String m, int priority)
	{
		t = new Thread(this);
		msg=m;
		t.setPriority(priority);
		t.start();
	}

	public void run() {
		try {
			for(int i=0; i<10;i++)
			{
				System.out.println(msg);
				Thread.sleep(1000);
			}}
			catch (Exception e)
			{
				
			}
		}
	}

