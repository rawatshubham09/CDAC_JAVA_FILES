package strings_concept;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("javamodel"); // this is mutable
		
		// String is not mutable so we use Bufffer method
		sb.ensureCapacity(6);
		sb.append("world");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity()); //20
		System.out.println(sb.substring(2)); // vamodelworld
		System.out.println(sb.substring(2,6));
		
		System.out.println(sb.charAt(10)); // o
		// java has concept of auto Garbage Collection
	}

}
