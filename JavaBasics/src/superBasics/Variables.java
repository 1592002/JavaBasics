package superBasics;

public class Variables {
	
	// Class Variables
	static String name="Sai";
	
	int number=10;
public Variables()
{
	
}
	public static void Name()
	{
		//Local Variable
		name="Vamsi";
		System.out.println("Value came from LOCAL : " +name);	
	}
	
	public static void name(String name)
	{
		//Instance Variable
	
		System.out.println("Value came from OBJECT : " +name);
			
	}
	
	public static void main(String[] args)
	{
	System.out.println("Value came from CLASS : " +name);
	Variables n=new Variables();
	n.number=n.number+10;
	System.out.println("Value came from object instance : " +n.number);
	Name();
	name("Kolla");
	}

}
