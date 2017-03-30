package sn360.t1;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/18.
 */
public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if(t>20){
            return;
        }
        int[][] a= new int[t][];
        for(int i=0;i<t;i++){
            int num = scanner.nextInt();
            if(num>500)
                return;
            a[i] = new int[num];
            for(int j=0;j<num;i++){
                a[i][j] = scanner.nextInt();
            }
        }


    }
}
