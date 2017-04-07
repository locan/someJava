package jjd;

import java.util.Scanner;

/**
 * Created by luan on 2017/4/7.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        double[] b = new double[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            b[i] = a[i]*1.0/100;
        }
        int xn = (int)Math.ceil(n*0.6);
        double e =0d;
        for(int i=xn;i<n;i++){
            e+=select(b,0,i);
        }
        double result = 1.0*Math.round(e*100000)/100000;
        System.out.printf("%.5f",result);
        System.out.printf("%.5f",e);

    }

    public static double select(double[]a,int begin,int num){
        int length = a.length;
        if(num==0)
            return 1.0d;
        if(length-begin==num){
            // 1 select
            double s = 1d;
            for(int i=0;i<num;i++){
                s*=a[begin+i];
            }
            return s;
        }else if(length-begin<num)
            return 0;
        // begin
        double s = 0d;
        double s1 = 0d;
        if(a[begin]!=0)
           s =a[begin]*select(a,begin+1,num-1);
        // no begin
        if(1-a[begin]!=0)
            s1 =select(a,begin+1,num)*(1-a[begin]);
        return s+s1;
    }
}
