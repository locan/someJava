package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by locan on 17/9/6.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        List<String> max = new ArrayList<>();
        //48 -57
        List<String> list = new ArrayList<>();
        for(int i=0;i<chars.length;i++){
            int ask = (int)chars[i];
            if(ask>=48&&ask<=57){
                list.add(String.valueOf(chars[i]));
            }else{
                list.clear();
            }
            if(max.size()<=list.size()){
                max = new ArrayList<>(list);
            }
        }
        String result = "";
        for(String s:max){
            result+=s;
        }
        if(result.length()<=0){
            System.out.println("0");
        }else{
            System.out.println(result);
            System.out.println(max.size());
        }
    }

}


