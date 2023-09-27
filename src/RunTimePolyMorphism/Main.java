package RunTimePolyMorphism;

import java.util.Scanner;

/**
 * @author abuthair on 27/09/23.
 * 9:04 pm
 * @project OOPS-Inheritance
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Designation M/D" );
        String select = sc.next();
        if(select.equalsIgnoreCase("M")){
            Employee employee = new Manager();
            employee.calBonus(2000);
        }
        else if (select.equalsIgnoreCase("D")){
            Employee employee = new Developer();
            employee.calBonus(1800);
        }
        else{
            Employee employee = new Employee();
            employee.calBonus(1000);
        }
    }
}
