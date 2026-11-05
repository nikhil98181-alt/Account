package Practice;
import java.util.Scanner; 

/**
 *
 * @author Nikhil Kumar
 */
public class Accounts {
    private  double balance;
    public void deposite(double amount)
    {
        balance = balance + amount ;
        System.out.println("Amount is deposite succesfully.");
    }
    public void withdraw(double amount)
    {
        if (balance >=amount )
        {
            balance = balance - amount;
            System.out.println("withdraw is succesfully");
            
        }
        else
        {
            System.out.println("insufficiant balance ");
        }
    }
    
    public double getbalance()
    {
        return balance;
    }
}
package Practice;
import java.util.Scanner;
/**
 *
 * @author Nikhil Kumar
 */
public class perimeter {
    public static void main(String arg[])
    {
        Scanner s1 = new Scanner(System.in);
       Accounts a1 = new Accounts();
       System.out.println(" Enter deposite amount = ");
       double d = s1.nextDouble();
       a1.deposite(d);
       System.out.println("Enter withdraw amount = ");
       double w = s1.nextDouble();
       a1.withdraw(w);
       System.out.println("updated balance = "+a1.getbalance());
        
        
    }
    
  
}
