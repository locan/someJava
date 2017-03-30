package sn360.t2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by luan on 2017/3/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int sum = 1;

        for(int i=n-1;i>0;i--){

              for(int j=0;j<i+1;j++){
                //cheak(a,j,)
              }


        }
    }

    public static int useful(int[] a,int start,int end,int num){
        for(int i=0;i<=num;i++){

        }
        return 1;
    }

    public static boolean cheak(int a[],int i,int j){

        int aa = j-i+1;

        Set set = new HashSet() ;
        for(int ii = i;ii<=j;ii++){
            set.add(a[ii]);
        }
        int bb =set.size();
        if(aa!=bb){
            return false;
        }else{
            return true;
        }

    }


}
