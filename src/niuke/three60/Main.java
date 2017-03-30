package niuke.three60;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/25.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0;i<n;i++){
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        double qiwang = 0d;
        for(int i=0;i<n;i++){
            qiwang += x[i]*y[i];
        }

        System.out.println(String.format("%.3f", (1.0*qiwang)/((1.0)*100)));

    }
}
