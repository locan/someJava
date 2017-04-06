package basetest.executionsequence;

/**
 * Created by locan on 17/3/31.
 */
public class Base {
    static{
        System.out.println("Base static block");
    }
    {
        System.out.println("Base Block");
    }
    public Base(){
        System.out.println("Base Constructor");
    }

}

