package collection;

import java.util.ArrayList;

public class Lunch {
 
  public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
    // Add your code below
   for(int i =0;i< lunchBox.size();i++)
   {
     if(lunchBox.get(i)=="ant")
     {
       lunchBox.remove(i);
       i--;
         
     }
     System.out.println(lunchBox.get(i));

   }
   return lunchBox;

  }
 
  
  public static void main(String[] args) {
    ArrayList<String> lunchContainer = new ArrayList<String>();
    lunchContainer.add("apple");//0
    lunchContainer.add("ant");//1
    lunchContainer.add("ant");//2
    lunchContainer.add("sandwich");//3
    lunchContainer.add("ant");//4
    lunchContainer = removeAnts(lunchContainer);
    System.out.println(lunchContainer);

  }
}
