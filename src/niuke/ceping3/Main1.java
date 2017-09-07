package niuke.ceping3;

import java.util.Scanner;

/**
 * Created by locan on 17/5/19.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        if(n==1&&n==2)
            System.out.println(1);


        int count = 1;
        int l = 0;
        int ll= 0;
        for(int i =0;i<n-1;i++){



            if(a[i]==a[i+1]){
                continue;
            }else if(a[i]>a[i+1]){
                ll = l;
                l = 1;
            }else{
                ll = l;
                l = -1;
            }
            if(i>0){
                if(ll!=l&&ll!=0&&l!=0){
                    count++;
                    ll=l=0;
                }
            }


        }

        System.out.println(count);
    }
}
