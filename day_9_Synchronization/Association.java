package day_9_Synchronization;

class Engine
{
	String model;
	int horsepower;
	String companyName;
	
	Engine(String m, int h, String c){
		this.model = m;
		this.horsepower = h;
		this.companyName = c;
	}

	@Override
	public String toString() {
		return "Engine [model=" + model + ", horsepower=" + horsepower + ", companyName=" + companyName + "]";
	}	
}

class Car
{
	Engine e;
	String Brand;
	String Color;
	
	Car(Engine e, String b, String c){
		this.e = e;
		this.Brand = b;
		this.Color = c;
	}

	@Override
	public String toString() {
		return "car [e=" + e + ", Brand=" + Brand + ", Color=" + Color + "]";
	}
}

public class Association {

	public static void main(String[] args) {
		
		Engine e = new Engine("V214",4000,"Tata");
		Car c = new Car(e, "Tata Motors", "Red");
		
		System.out.println(c);
	}
}
