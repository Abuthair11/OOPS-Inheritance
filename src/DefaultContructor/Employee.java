package DefaultContructor;

/**
 * @author abuthair on 27/09/23.
 * 5:35 pm
 * @project OOPS-Inheritance
 */
public class Employee {
    String name;
    int empId;

    Employee(){
        name="Ram";
        empId=1;
    }
    void getDetails(){
        System.out.println("Name is "+name);
        System.out.println("EmpId is " + empId);
    }
}
