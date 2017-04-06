package basestu.finallystu;

/**
 * Created by luan on 2017/4/5.
 */
public class Main {
    public static int testFinally(){
        try{
            return 1;
        }catch (Exception e){
            return 0;
        }finally {
            System.out.println("执行Finally");
        }
    }

    public static int testFinally2(){
        try{
            return 1;
        }catch (Exception e){
            return 0;
        }finally {
            System.out.println("执行Finally");
            return 3;
        }
    }

    public static int testFinally3(){
        int result = 1;
        try{
            result=2;
            return result;
        }catch (Exception e){
            return 0;
        }finally {
            result = 3;
            System.out.println("执行Finally");
        }

    }
    public static StringBuffer testFinally4(){
        StringBuffer s = new StringBuffer("Hello");
        try{
            return s;
        }catch (Exception e){
            return null;
        }finally {
            s.append(" world!");
            System.out.println("执行Finally");
        }
    }
    public static void main(String[] args) {
        int result = testFinally3();
        System.out.println(result);
        StringBuffer result2 = testFinally4();
        System.out.println(result2);
    }
}
