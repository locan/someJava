package niuke.ceping3;

import java.util.Scanner;

/**
 * Created by locan on 17/5/20.
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }

        for(int i=85;i<=92;i++){
            //System.out.print(a[i]+" ");
        }
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int x = getUpChange(a,i,j);
                int y = getDownChange(a,i,j);
                max = Math.max(Math.max(x,y),max);
                System.out.println("i:"+i+" j:"+j+" x:"+x+" y:"+y);
            }
        }
        System.out.println(max);
    }

    public static int getChange(int a[],int begin,int end){


        return 0;
    }

    public static int getUpChange(int a[],int begin,int end){
        if(begin==end)
            return 1;
        int count = 1;
        boolean change = true;
        for (int i=begin;i<end;i++){
            if(a[i]>=a[i+1]){
                if(i+1<end){
                    int jiange = a[i+2]-a[i];

                    if(jiange>1&&change){
                        a[i+1] = a[i]+1;
                        change = false;
                    }else if(jiange<0&&i>begin&&change&&(a[i+1]-a[i-1]>1)){
                        a[i] = a[i-1]+1;
                        change = false;
                    }else{
                        return count;
                    }
                }
            }
            count++;
        }
        return count;
    }
    public static int getDownChange(int a[],int begin,int end){
        if(begin==end)
            return 1;
        int count = 1;
        boolean change = true;
        for (int i=begin;i<end;i++){
            if(a[i]<=a[i+1]){
                if(i+1<end){
                    int jiange = a[i]-a[i+2];

                    if(jiange>1&&change){
                        a[i+1] = a[i]-1;
                        change = false;
                    }else if(jiange<0&&i>begin&&change&&(a[i-1]-a[i+1]>1)){
                        a[i] = a[i-1]-1;
                        change = false;
                    }else{
                        return count;
                    }
                }
            }
            count++;

        }
        return count;
    }

    public static void test(){

    }
}

/***
 * 第一个数和第二个数得出二中可能，
 *      递增，过递减，后面的数同样遵守
 *      第二个数为假数，这个数组的趋势是根据第一个和第三个决定的，但是第一个数和第三个数间隔大于等于2
 *
 *
 *
 */


