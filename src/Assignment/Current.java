package Assignment;

/**
 * @author abuthair on 27/09/23.
 * 9:53 pm
 * @project OOPS-Inheritance
 */
public class Current extends Account{


    @Override
    void withdraw(double amount) {
        super.withdraw(amount);
        balance -= amount-100;
    }

    @Override
    void deposit(double amount) {
        super.deposit(amount);
        balance+=amount;
    }

    void emi(){
        System.out.println("The Emi os 2%");
    }
}
