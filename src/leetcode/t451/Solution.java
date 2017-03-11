package leetcode.t451;

import java8.common.PrintUtil;

/**
 * Created by luan on 2017/3/11.
 */
public class Solution {
    public int trap(int[] height) {
        int finalsum = 0;
        int sum = 0;
        int headPeak = 0;
        int headPeakIndex = 0;
        int tailPeak = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]>=headPeak){
                headPeak = height[i];
                headPeakIndex=i;
                tailPeak = 0;
                finalsum+= sum;
                sum = 0;
            }else if(height[i]<headPeak){
                sum += headPeak-height[i];
                if(height[i]>tailPeak)
                    tailPeak = height[i];
            }
            if(i==height.length-1&&headPeakIndex!=i){
                i = headPeakIndex;
                height[i] = tailPeak;
                headPeak = height[i];
                sum = 0;
            }
        }
        return finalsum;
    }




    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = new int[]{2,0,2};
        PrintUtil.print(s.trap(height));
    }
}
