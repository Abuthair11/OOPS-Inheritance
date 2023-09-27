package Assignment;

/**
 * @author abuthair on 27/09/23.
 * 9:50 pm
 * @project OOPS-Inheritance
 */
public class Savings extends Account{


    @Override
    void withdraw(double amount) {
        super.withdraw(amount);
        balance= balance - amount;
    }

    @Override
    void deposit(double amount) {
        super.deposit(amount);
        balance+=amount;
    }
}
