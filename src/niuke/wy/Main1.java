package niuke.wy;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/25.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = scanner.next();
        int n = c.length();
        String[] children = new String[n];
        for(int i=0;i<n;i++){
            children[i] = String.valueOf(c.charAt(i));
        }

        int left =0;
        int right = 0;
        int[] index = new int[n];
        int bsum = 0;
        for(int i=0;i<c.length();i++){
            if(children[i].equals("B")){
                index[i] = 1;
                bsum++;
            }
        }
        int li = 0;
        int ri = n-bsum;
        for(int i=0;i<n&&ri<n&&li>=0;i++){
            if(index[i]==1){
                left+=i-li;
                li++;
                right+=ri-i;
                ri++;
            }
        }
        System.out.println(Math.min(left,right));

    }
}
