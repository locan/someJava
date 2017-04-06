package test.m1;




/**
 * Created by locan on 17/3/7.
 */
public class Main {
    public static void main(String[] args) {
        int n = 27;
        if(1==n){
            System.out.println("No");
            return;
        }
        for(int i=2;i<n/2;i++){
            if(isPrime(i)){
                int m=n;
                int chu =0;
                while(true){
                    int mm = m/i;
                    int nn = m%i;
                    chu++;
                    if(mm==1&&nn==0){
                        System.out.println(i+" "+chu);
                        return;
                    }else if(mm==0){
                        break;
                    }
                }


            }
        }

    }
    public static boolean isPrime(int a) {

        boolean flag = true;

        if (a < 2) {// 素数不小于2
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {// 若能被整除，则说明不是素数，返回false

                    flag = false;
                    break;// 跳出循环
                }
            }
        }
        return flag;
    }
}
