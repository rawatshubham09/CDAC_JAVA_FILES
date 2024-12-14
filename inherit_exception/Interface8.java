package inherit_exception;

public interface Interface8 {

int code =22;
void show(); //abstract public


default void banner()
{
	System.out.println("Banner method");
}

static void print()
{
	System.out.println("Static method of interface");
}

// we canonly make default and static method
}
