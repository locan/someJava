package niuke.ceping3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by locan on 17/5/19.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n*3];
        for(int i=0;i<n*3;i++){
            a[i] = scanner.nextInt();
        }

        Arrays.sort(a);

        int sum = 0;
        for(int i=n;i<3*n;i=i+2){
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
