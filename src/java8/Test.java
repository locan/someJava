package java8;

/**
 * Created by luan on 2017/3/7.
 */
public class Test {
    static  boolean out(char c){
        System.out.println(c);
        return  true;
    }
    public static void main(String[] args) {
        int i=0;
        for(out('A');out('B')&&(i<2);out('C')){
            i++;
            out('D');
        }
    }
}
