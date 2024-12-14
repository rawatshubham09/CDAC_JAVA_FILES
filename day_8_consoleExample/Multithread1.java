package day_8_consoleExample;

// WAP to print welcome msg 10 times with 1000 millisecond pause

class Thr1 extends Thread
{
	public void run()
	{
		try {
		for(int i=0; i<10;i++)
		{
			System.out.println("Welcome");
			
				Thread.sleep(1000);
			} }
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

class Thr2 extends Thread
{
	public void run()
	{
		try {
		for(int i=0; i<10;i++)
		{
			System.out.println("Welcome2");
			
				Thread.sleep(1000);
			} }
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

class Thr4
{
	void show()
	{
		try {
		for(int i=0; i<10;i++)
		{
			System.out.println("Welcome4");
			
				Thread.sleep(1000);
			} }
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
public class Multithread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thr1 V1 = new Thr1();
		Thr2 V2 = new Thr2();
		Thr3 V3 = new Thr3(); // from another file
		Thr4 V4 = new Thr4();
		
		Thr5 v5 = new Thr5();
		Thread k = new Thread(v5);
		
		k.start();
		V2.start();
		V4.show();
		V1.start();
		V3.start();
	}

}
