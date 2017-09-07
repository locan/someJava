package huawei;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by locan on 17/9/6.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<100;i++){
            list.add(i+1);
        }
        int index = m;
        while(list.size()>m){
            System.out.println(index-1);
            list.remove(index-1);
            index = (index+index)%list.size();
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
