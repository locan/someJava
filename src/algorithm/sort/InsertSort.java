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

    /**
     * 这种是需要交换空间的方法，每次都把值重新交换
     * @param list
     */
    public void sort2(Integer[] list){
        int N = list.length;
        for(int i=0;i<N;i++){
            for(int j=i;j>0&&SortTestHelper.less(list[j],list[j-1]);j++){
                SortTestHelper.swap(list,j,j-1);
            }
        }
    }
    public static void main(String... args){
        /*Integer[] arr = SortTestHelper.generateRandomArray(10000,1,100);
        Integer[] arr1 = SortTestHelper.copyInArray(arr);
        Integer[] arr2 = SortTestHelper.copyInArray(arr);
        SortTestHelper.testsort("SelectSort",new SelectSort(),arr);

        SortTestHelper.testsort("InsertSort",new InsertSort(),arr1);
        SortTestHelper.testsort("QuickSort",new QuickSort(),arr2);*/
        byte b1=2,b2=2,b3,b6;
        final byte b4 = 4,b5=6;
        b6 =b4+b5;
        b3 = (byte)(b1+b2);
        System.out.println(b3+b6);
    }
}
