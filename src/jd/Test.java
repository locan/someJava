package jd;

/**
 * Created by locan on 17/4/7.
 */
class Parent {
    private final void Print(){
        System.out.println("Parent");
    }
}
public class Test extends Parent{
    private final void Print(){
        System.out.println("Child");
    }
    private static void Print2(){
        System.out.println("Print");
    }
    public static void main(String[] args) {
        new Test().Print();
        String str1 = "hello";
        String str2 = "he"+ new String("llo");
        System.out.println(str1==str2);

        ((Test)null).Print();
    }
}
