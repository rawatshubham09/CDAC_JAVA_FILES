package day_10_synchro;

import java.lang.reflect.Constructor;

public class Reflect1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class r = Class.forName("java.lang.String");
		
		Constructor k[] = r.getConstructors();
		
		for(int i=0; i<k.length;i++)
		{
			System.out.println((i+1)+ " "+ k[i]+ " "+ k[i].getModifiers()+ " "+ k[i].getParameterCount());
		}
	}

}
