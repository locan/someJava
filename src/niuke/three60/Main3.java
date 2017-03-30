package niuke.three60;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by luan on 2017/3/25.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] list = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            list[i] = scanner.nextInt();
            max = Math.max(list[i],max);
        }
        int[] temp = new int[m];
        for(int i=0;i<m;i++){
            temp[i] = scanner.nextInt();
        }
        Arrays.sort(list);

        int[] result = new int[m];
        int index = 0;
        int tindex = 0;
        for(int i=1;i<=max;i++){
            if(list[index]==i){
                index++;
                continue;
            }else{
                for(int j =0;j<m;j++){
                    if(result[j]==0&&temp[j]<=i){
                        result[j]=i;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            if(result[i]==0)
                System.out.println(max+1);
            else
                System.out.println(result[i]);
        }
    }
}
