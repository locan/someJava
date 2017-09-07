package didi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by locan on 17/8/26.
 */
public class Main2 {
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

        int n = in.nextInt();

        Stack<Integer> stack = new Stack<>();

    }

    public static void push(Stack<Integer> s, Integer n, Integer l){
        Stack<Integer> temp = new Stack<>();
        if(s.peek()>n){
            if(s.size()==l){
                return;
            }
        }
    }
}
