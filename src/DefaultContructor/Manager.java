package DefaultContructor;

/**
 * @author abuthair on 27/09/23.
 * 5:37 pm
 * @project OOPS-Inheritance
 */
public class Manager extends Employee{
    int salary;

    Manager(){
        salary = 2000;
    }
    void calBonus (int a){
        System.out.println(a*salary);
    }
}
