package niuke.super_prime_power;


import java.util.Scanner;

/**
 * Created by luan on 2017/3/14.
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(1==n){
            System.out.println("No");
        }
        for(int i=2;i*i<n;i++){
            double p = Math.pow((double)n, 1d/i);
            //(long)p == p 判断p经过 Math.pow((double) num, 1d/q)后是否为整数            
            if ((long)p == p && isPrime((long) p)) {
                System.out.println((long) p + " " + i);
                return;
            }
        }
        System.out.println("No");
    }


    public static boolean isPrime(long a){
        boolean flag = true;
        if(a<2){
            return false;
        }else{
            for(long i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }



}
