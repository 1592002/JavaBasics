package Basics;

//This class performs Addition,Subtraction,Multiplication,Division and modulos.  
public class Calculator
{
//Creating a Constructor
Calculator()
{

}
//Addition method 
public int add(int A,int B)
{
int addition=A+B;
return addition;
}
//Subtraction method 
public int subtract(int A,int B)
{
int sub=A-B;
return sub;
}
//Multiplication method 
public int multiply (int A,int B)
{
int mul=A*B;
return mul;
}
//Division method 
public int divide(int A,int B)
{
int div=A/B;
return div;
}
//Modules method 
public int modulo(int A,int B)
{
int mod=A%B;
return mod;
}
public static void main(String [] args)
{
Calculator myCalculator=new Calculator();
int A=myCalculator.subtract(45,11);
 System.out.println("Subtraction is :" +A );
 System.out.println("Addition is :" +myCalculator.add(5,7));
 System.out.println("Division is :" +myCalculator.divide(7,7));
 System.out.println("Multiplication is :" +myCalculator.multiply(7,7));
 System.out.println("modulos is :" +myCalculator.modulo(7,7));
}
}