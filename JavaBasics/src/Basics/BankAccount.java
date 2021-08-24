package Basics;

public class BankAccount {
		  
		  int balance;
		  //constructor
		  public BankAccount(int initialBalance){
		    balance = initialBalance;
		  }
		  //Check Balance Method
		public void checkBalance()
		{

		    System.out.println("Hello!");
		    System.out.println("Your balance is "+ balance);
		}  

		//Depostie method 
		public void deposit(int amountToDeposit)
		{
		    
		     int amoutDeposit=amountToDeposit;
		    int afterDeposit = balance + amoutDeposit;
		    balance = afterDeposit;
		    System.out.println("You just deposited "+amoutDeposit);
		   
		}  

		//Withdraw method 
		public int withdraw(int amountToWithdraw )
		{
		 

		    int afterWithdraw = balance - amountToWithdraw;
		    balance=afterWithdraw;
		    System.out.println("You just withdrew "+amountToWithdraw);
		   return amountToWithdraw;
		}
		//String method
		public void toSting()
		{
		    
		    System.out.println("Your balance is "+balance);
		}

		  public static void main(String[] args){
		    BankAccount savings = new BankAccount(2000);
		        //Check balance:
		      savings.checkBalance();
		       //Deposit:
		      savings.deposit(600);
		      //Withdrawing:
		      savings.withdraw(200);
		     //Check balance:
		     savings.toString();
		    
		    
		  }       
		}


