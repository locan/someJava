package niuke.wy;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/25.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] tx = new int[n];
        int[] ty = new int[n];
        for(int i=0;i<n;i++){
            tx[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            ty[i] = scanner.nextInt();
        }

        int gx = scanner.nextInt();
        int gy = scanner.nextInt();
        int walktime = scanner.nextInt();
        int taxitime = scanner.nextInt();



        int walklength = (Math.abs(gx)+Math.abs(gy))*walktime;
        int taxtlength = 0;
        for(int i=0;i<n;i++){
            int s1 = Math.abs(tx[i])+Math.abs(ty[i]);
            int s2 = Math.abs(tx[i]-gx)+Math.abs(ty[i]-gy);
            int time = walktime*s1+taxitime*s2;
            taxtlength=taxtlength==0?time:Math.min(time,taxtlength);
        }

        System.out.println(Math.min(walklength,taxtlength));


    }
}
