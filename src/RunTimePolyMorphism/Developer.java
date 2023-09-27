package RunTimePolyMorphism;

/**
 * @author abuthair on 27/09/23.
 * 9:03 pm
 * @project OOPS-Inheritance
 */
public class Developer extends Employee{

    @Override
    void calBonus(int a) {
        System.out.println("bonus for Dev is" +a*2);
    }
}
