package superBasics;

import org.junit.Test;

public class StringFunctions {

@Test
public void test()
{
String v="vamsi Sai     Kolla  Edmonton ";
System.out.println("Lenght of a given string"+ v.length() +v);
String n=v.trim();
System.out.println("Lenght of a given string with out spaces"+ n.length() +n);
//System.out.println("Lenght of a given string"+ v.toLowerCase());
//System.out.println("Lenght of a given string"+ v.toUpperCase());

}
@Test
public void test1()
{
String v="Akhil Sai     Kolla  Edmonton ";
System.out.println("Lenght of a given string"+ v.length() +v);
String n=v.trim();
System.out.println("Lenght of a given string with out spaces"+ n.length() +n);
//System.out.println("Lenght of a given string"+ v.toLowerCase());
//System.out.println("Lenght of a given string"+ v.toUpperCase());

}

}