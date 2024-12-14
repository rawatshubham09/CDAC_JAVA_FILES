package day_9_Synchronization;

public class CallingBanner implements Runnable
{
Thread t;
String msg;
Banner b;

CallingBanner(Banner r, String m){
	msg=m;
	b=r;
	t=new Thread(this);
	t.start();
}

public void run()
{ // synchronized block in method
	synchronized(b) {
	b.call(msg);
	}
}
}
