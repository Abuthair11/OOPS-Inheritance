package Assignment;

import java.util.Scanner;

/**
 * @author abuthair on 27/09/23.
 * 9:56 pm
 * @project OOPS-Inheritance
 */
public class ATMMain {
    public static void main(String[] args) {
        System.out.println("Enter your accort S/C" );
        Scanner sc =  new Scanner (System.in);
        String type = sc.next();


        if(type.equalsIgnoreCase("S")){

            System.out.println("You want to W or D");
            Account account = new Savings();
            String val= sc.next();
            int amount = sc.nextInt();
            if(val .equalsIgnoreCase("W")){
                account.withdraw((double) amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ans);
            }
            else {
                account.deposit((double) amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ans);
            }

        }
        else if(type.equalsIgnoreCase("C")){
            System.out.println("You want to WithDraw or deposit");
            Account account = new Current();
            String val= sc.next();
            int amount = sc.nextInt();
            if(val.equalsIgnoreCase("withdraw")){
                account.withdraw((double) amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ ans);
            }
            else{
                account.deposit((double) amount);
                double ans = account.getBalance();
                System.out.println("Balance is"+ ans);
            }

        }


    }
}
