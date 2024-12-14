package inherit_exception;

// we use extends when class is used in class and interface use in interface
// when class inherit interface we use implements
b y6h nb  8v
public class UseInterface8 implements Interface8 {
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseInterface8 p= new UseInterface8();
		
		p.banner();
		p.show();
		
		Interface8.print();
	}

	

}
