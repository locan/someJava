package sourcecode.io;

/**
 * Created by locan on 17/3/25.
 */
public class NowCode extends Dad{
    private String name = "s";
    public static void main(String[] args) {
     NowCode n = new NowCode();
        System.out.println(n.getHisFather());

        int num1 =1;
        int num2 =2;


    }



}
class Dad{
    private String name = "f";
    public String getHisFather(){
        return name;
    }
}