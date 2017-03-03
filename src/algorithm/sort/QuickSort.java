package algorithm.sort;


import java.util.Random;

/**
 * Created by luan on 2017/2/23.
 */
public class QuickSort implements Sort<Integer> {
    @Override
    public void sort(Integer[] list) {
        quickSort(list,0,list.length-1);

    }
    private void quickSort(Integer[] array ,int l,int r){
        if(l>r)
            return;
        int p = partition(array,l,r);
        quickSort(array,l,p-1);
        quickSort(array,p+1,r);

    }

    private int partition(Integer[] array, int l, int r) {
        //此处为优化，随机选择首个数的索引
        if(l==r)
            return l;
        Random random = new Random();
        int randIndex = random.nextInt(r-l)+l+1;

        SortTestHelper.swap(array,l,randIndex);

        Integer v = array[l];
        int j = l;
        for(int i = l+1;i<=r;i++){
            if(array[i]<v){
                SortTestHelper.swap(array,j+1,i);
                j++;
            }

        }
        SortTestHelper.swap(array,l,j);
        return j;
    }




}
