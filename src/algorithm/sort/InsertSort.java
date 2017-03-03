package algorithm.sort;

/**
 * Created by luan on 2017/2/23.
 */
public class InsertSort implements Sort<Integer> {

    @Override
    public void sort(Integer[] list) {
        /*
        for(int i=0;i<list.length;i++){
            for(int j=i;j>0&&list[j]<list[j-1];j--){
                SortTestHelper.swap(list,i,j);
            }
        }
        */
        for(int i=0;i<list.length;i++){
            Integer e = list[i];
            int j;
            for(j=i;j>0&&list[j]<list[j-1];j--){
               list[j] = list[j-1];
            }
            list[j] = e;
        }
    }
    public static void main(String... args){
        Integer[] arr = SortTestHelper.generateRandomArray(10000,1,100);
        Integer[] arr1 = SortTestHelper.copyInArray(arr);
        Integer[] arr2 = SortTestHelper.copyInArray(arr);
        SortTestHelper.testsort("SelectSort",new SelectSort(),arr);

        SortTestHelper.testsort("InsertSort",new InsertSort(),arr1);
        SortTestHelper.testsort("QuickSort",new QuickSort(),arr2);
    }
}
