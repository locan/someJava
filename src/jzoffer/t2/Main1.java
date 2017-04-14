package jzoffer.t2;

/**
 * Created by locan on 17/4/11.
 */
public class Main1 {
    public static void main(String... args){
        int[][] a={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(a,4,4,5));

    }

    public static boolean find(int[][] a,int rows,int cols,int num){
        if(a==null)
            return false;
        int row = 0;
        int col = cols-1;
        while(row<rows&&col>=0){
            if(a[row][col]==num){
                return true;
            }else if(a[row][col]>num){
                col--;
            }else{
                row++;
            }
        }


        return false;
    }
}
