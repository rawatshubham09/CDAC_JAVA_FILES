package day_9_Synchronization;

public class Banner {
	//synchronized void call(String msg)  // method 1
	void call(String msg)
	{
		try {
			System.out.print("["+msg);
		}catch(Exception d) {}
		System.out.println("]");

	}

}
