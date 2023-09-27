package RunTimePolyMorphism;

/**
 * @author abuthair on 27/09/23.
 * 9:02 pm
 * @project OOPS-Inheritance
 */
public class Manager extends  Employee{
    @Override
    void calBonus(int a) {
        System.out.println("Bonus for Manager "+a*3);
    }
}
