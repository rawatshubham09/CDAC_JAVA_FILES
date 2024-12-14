package day7_stream_reflection_lambda;

import java.util.function.Consumer;
class Product
{
	private double price = 0.0;
	public void setPrice(double price) {this.price = price;}
		public void printPrice() { System.out.println(price);}
}

public class ConsumerExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<Product> p1 = (p) -> p.setPrice(5.9);
		
		Product r = new Product();
		
		p1.accept(r);
		
		r.printPrice();
	}

}