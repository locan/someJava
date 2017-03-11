package algorithm.sort;

/**
 * 算法名称：选择排序
 * 算法思想：首先找到数组中最小的那个元素，其次与数组当前最前面位置的元素交换位置。
 * Created by luan on 2017/2/23.
 */
public class SelectSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] list) {
        for(int i=0;i<list.length;i++){
            Integer minIndex = i;
            for(int j=i+1;j<list.length;j++){
                if(list[i]>list[j]){
                    minIndex = j;
                }
            }
            SortTestHelper.swap(list,i,minIndex);
        }
    }

    public static void main(String... args){
        Integer[] arr = SortTestHelper.generateRandomArray(100000,1,100);
        SortTestHelper.testsort("SelectSort",new SelectSort(),arr);
        SortTestHelper.testsort("QuickSort",new QuickSort(),arr);
    }
}
