package algorithm.sort;

import java8.common.PrintUtil;

/**
 * 冒泡排序
 * Created by luan on 2017/2/23.
 */
public class BubbleSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] list) {
        int i,j;
        int len = list.length;
        int tmp;
        for(i=0;i<len-1;i++){
            for(j = len-1;j>i;--j){
                if(list[j]<list[j-1]){
                    tmp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer a[]={5,4,9,8,7,6,0,1,3,2};
        Sort<Integer> sort = new BubbleSort();
        sort.sort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        PrintUtil.print(a);
    }
}
