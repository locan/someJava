package leetcode.q349;

import algorithm.sort.SortTestHelper;
import java8.common.PrintUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by luan on 2017/2/23.
 */
public class Result {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(result.size()==0||(result.size()!=0&&result.get(result.size()-1)!=nums1[i])){
                    result.add(nums1[i]);
                }
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }
        }
        int[] res =new int[result.size()];
        for(int ii=0;ii<res.length;ii++){
            res[ii] = result.get(ii);
        }
        return  res;
    }
    public static void main(String... args){
        Result res = new Result();
        int[] a = {1};
        int[] b = {1};
        int[] c = res.intersection(a,b);
        PrintUtil.print(c);
    }
}
