package DefaultContructor;

/**
 * @author abuthair on 27/09/23.
 * 5:38 pm
 * @project OOPS-Inheritance
 */
public class inHeritanceDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getDetails();
        Manager manager = new Manager();
        manager.getDetails();
        manager.calBonus(2);

    }
}
