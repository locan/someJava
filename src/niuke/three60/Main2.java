package niuke.three60;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/25.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        if(str.length()>100000)
            return;
        int sum =0;
        if(str.length()==0||str.length()==1){
            System.out.println(0);
        }

        for(int i=1;i<=str.length();i++){
            int begin =0;

            while(begin+i<=str.length()){
                String son = str.substring(begin,begin+i);
                if(isOStr(son)){
                    sum++;
                }
                begin++;
            }
        }
        System.out.println(sum);

    }


    public static boolean isOStr(String s){
        if(s.length()==1){

            return false;
        }

        int[] hash = new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++){
            if(hash[i]%2!=0){

                return false;
            }
        }
        return true;
    }
}
