package jjd;

import java.util.Scanner;

/**
 * Created by luan on 2017/4/7.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String a = scanner.next();
        String b = scanner.next();
        int sum =0;
        for(int i=n-1;i>=0;i--){
            Integer aa = Integer.valueOf(String.valueOf(a.charAt(i)));
            Integer bb = Integer.valueOf(String.valueOf(b.charAt(i)));
            if(!aa.equals(bb)){
                sum+=Math.pow(2,n-i-1);
            }
        }
        System.out.println(sum);
    }
}
