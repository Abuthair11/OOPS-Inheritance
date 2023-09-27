package multiLevelInheritance;

/**
 * @author abuthair on 27/09/23.
 * 5:56 pm
 * @project OOPS-Inheritance
 */

    public class A {
        A(){
            System.out.println("In A");
        }
    }
    class B extends  A{
      B(){
          System.out.println("In B");
      }
    }
     class  C extends B{
        C(){
            System.out.println("In C");

        }
    }
      class main {
        public static void main(String[] args) {
         C c = new C();
    }
}
