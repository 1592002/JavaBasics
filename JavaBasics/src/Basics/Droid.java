
//Why name is working and task is not working
//how toStrring() is woring once.
package Basics;

public class Droid
{
    //This Variables set battery level to 100; 
	// There would be any differnce between scope of construtor variable and method variables ? 
    int batteryLevel=100;
    String name;
    String task;
  //Constructor method
  public Droid(String droidName)
  {
  name= droidName; 
  batteryLevel=100; 
  System.out.println(name);
  }
  //how this method is working ?
  // where it is the sending return  value 
  //why it is run only once? 
   // where it is taking the name value from? 
  public String toSring(String name)
  {
     return "Hello, I’m the droid:"+ name;
  }
//performTask Method
public String performTask(String Task)
{
  task=Task;
  System.out.println(name+ " is performing task:"+ task );
  batteryLevel=batteryLevel-10;
 return task; 
  
}
//batteryLevel
public void energyReport()
{

  System.out.println(name+ " lost this much power level by doing :" +task +" present battery Level "+ batteryLevel );
  
}

//Main Method
  public static  void main(String[] args)
  {
    //what it is called creating a new object and paiing a values in that ?
    Droid codey=new Droid ("Codey");
    System.out.println(codey);
    codey.toSring("Codey");
    codey.performTask("Singing");
    codey.energyReport();
    Droid jane=new Droid ("Jane");
    System.out.println(jane);
    jane.toSring("Jane");
    jane.performTask("Dancing");
    jane.energyReport();
    


  }
}