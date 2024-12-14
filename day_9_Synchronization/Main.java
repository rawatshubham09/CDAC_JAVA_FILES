package day_9_Synchronization;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banner b = new Banner();
		CallingBanner c = new CallingBanner(b,"Hello");
		CallingBanner c1 = new CallingBanner(b,"Kaisan ba");
		CallingBanner c2= new CallingBanner(b,"Namste");
	}

}
