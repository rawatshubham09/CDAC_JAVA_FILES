package day_8_consoleExample;

public class LambdaThread {

	public static void main(String[] args) {
		
		Runnable r=()->
		{
			try {
				for(int i=0; i<10;i++) {
					System.out.println("Welcome");
					Thread.sleep(1000);
				}
			}catch(Exception e) {}
		};
		
		Thread e= new Thread(r);
		e.start();
	}

}
