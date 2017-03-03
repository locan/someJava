package java8.time;

import java8.common.PrintUtil;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by luan on 2017/2/25.
 */
public class Result {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        PrintUtil.print(dtf.format(now).toString());
        try {
            if(true){
                throw  new Exception();
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
