package java8.common;

import java.lang.reflect.Array;

/**
 * Created by luan on 2017/2/23.
 */
public class PrintUtil {
    private static Integer index = 1;
    public static void print(Object object){

        System.out.printf("result(%d)->: %s\n",index++,object.toString());
    }
}
