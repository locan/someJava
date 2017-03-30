package niuke.wy;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/25.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<2||n>50)
            return;
        int k = scanner.nextInt();
        if(k<1||k>2000000000)
            return;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<k;i++){
            int a1 = a[0];
            for(int j=0;j<n;j++){
                if(j==n-1){
                    a[j] = (a[j]+a1)%100;
                }else{
                    a[j] = (a[j]+a[j+1])%100;
                }

            }
            System.out.print("K: "+i+"    ");
            for(int ii=0;ii<n;ii++){
                if(ii==n-1){
                    System.out.println(a[ii]);
                }else{
                    System.out.print(a[ii]+" ");
                }

            }
        }
        for(int i=0;i<n;i++){
            if(i==n-1){
                System.out.println(a[i]);
            }else{
                System.out.print(a[i]+" ");
            }

        }

    }
}
