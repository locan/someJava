package niuke.ceping3;

import java.util.Scanner;

/**
 * Created by locan on 17/5/19.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
            b[i]=scanner.nextInt();

        }
        int m = n;
        while(m>1){
            int index = getMaxIndex(a);
            int index2 = getMaxVal(a,b,index);
            a[index] = a[index]+b[index2]-b[index2];
            a[index2] =0;
            a[index2]=0;
        }
    }



    public static int getNewZhandou(int x,int y1,int y2){
        return x+y2-y1;
    }


    public static int getVal(int[] a,int[] b,int index){
        return b[index]-a[index];
    }

    public static int getMaxVal(int a[],int b[] ,int expect ){
        int index = 0;
        int x = 0;
        for(int i=0;i<a.length;i++){
             if(getVal(a,b,i)>x){
                 x = getVal(a,b,i);
                 index = i;
             }
        }
        return index;
    }

    public static int getMaxIndex(int a[]){
        int index = 0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])
                index = i+1;
        }
        return index;
    }
}
