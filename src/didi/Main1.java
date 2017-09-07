package didi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by locan on 17/8/26.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        if (a.equals("")){
            System.out.println(0);
            return;
        }
        String[] aan = a.split(" ");
        int[] an = new int[aan.length];


        for (int i = 0; i < aan.length; i++) {
            an[i] = Integer.valueOf(aan[i]);
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < an.length; i++) {
            sum += an[i];
            if (sum < 0) {
                sum = 0;
            }
            max = Math.max(sum, max);


        }
        System.out.println(max);

    }
}
