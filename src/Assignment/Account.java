package Assignment;

/**
 * @author abuthair on 27/09/23.
 * 9:47 pm
 * @project OOPS-Inheritance
 */
public class Account {
    double balance = 2000;

    void withdraw(double amount){
        System.out.println("This is from DBS Bank");
    }
    void deposit(double amount){
        System.out.println("This is from DBS Bank");
    }

    double getBalance(){
        return balance;
    }
}
