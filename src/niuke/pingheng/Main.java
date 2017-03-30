package niuke.pingheng;

import java.util.Scanner;

/**
 * Created by luan on 2017/3/23.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n=scanner.next();
        int length = n.length();
        if(length==2){
            if(Integer.valueOf(String.valueOf(n.charAt(0)))==Integer.valueOf(String.valueOf(n.charAt(1)))){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        int[] nums = new int[length];
        for(int i=0;i<length;i++){
            nums[i] = Integer.valueOf(String.valueOf(n.charAt(i)));
        }

        int left = 1;
        int right = length-2;
        int sumleft = nums[0];
        int sumRight = nums[length-1];
        while(right>=left){
            if(sumleft>sumRight){
                sumRight*=nums[right];
                right--;
            } else{
                sumleft*=nums[left];
                left++;
            }
        }

        if(sumleft==sumRight){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
