package basetest.executionsequence;

/**
 * Created by locan on 17/3/31.
 */
public class Derived extends Base {
    static {
        System.out.println("Derived static block");
    }
    {
        System.out.println("Derived block");
    }
    public Derived(){
        System.out.println("Derived constructor");
    }

    public static void main(String[] args) {
        new Derived();
    }
}
