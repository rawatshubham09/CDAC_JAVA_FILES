package day_10_synchro;

public class FileThread extends Thread{
	
	FileRead r;
	String filename;
	
	FileThread(FileRead t, String f)
	{
		r = t;
		filename = f;
		start();
	}
	
	public void run()
	{
		r.display(filename);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileRead k = new FileRead();
		FileThread g = new FileThread(k,"hellow.txt");
		
		FileThread g1 = new FileThread(k,"data.txt");
		
		g.run();
		g1.run();
	}

}
