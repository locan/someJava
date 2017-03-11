package algorithm.sort;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

/**
 * Created by luan on 2017/2/23.
 */
public class SortTestHelper {

    public static Integer[] generateRandomArray(int n,int rangeLeft,int rangeRight){
        Integer[] arr = new Integer[n];
        Random ra =new Random();
        for (int i=0;i<n;i++){
            arr[i] = ra.nextInt((rangeRight-rangeLeft))+rangeLeft+1;
        }
        return arr;
    }
    public static Integer[] generateNearlyOrderArray(int n,int swapTimes){
        Integer[] arr = new Integer[n];
        for(int i = 0;i>n;i++){
            arr[i] = i;
        }
        Random ra =new Random();
        for(int i=0;i<swapTimes;i++){
            int posx = ra.nextInt(n);
            int posy = ra.nextInt(n);
            swap(arr,posx,posy);
        }
        return arr;
    }

    public static Integer[] copyInArray(Integer a[]){
        Integer[] b = Arrays.copyOf(a,a.length);
        return b;
    }

    public static boolean isSort(Integer[] array){
        for(int i = 0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }

    public static <T> void printArray(T[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static boolean less(Comparable t,Comparable t2){
        return t.compareTo(t2)<0;
    }

    public static void swap(Integer[] array,Integer a,Integer b){
        Integer c=array[a];
        array[a] = array[b];
        array[b] = c;
    }

    public static void testsort(String sortName,Sort sort,Integer[] arr){
        long starttime = new Date().getTime();
        sort.sort(arr);
        long endtime = new Date().getTime();
        System.out.println(sortName+" : "+ Double.valueOf(endtime-starttime)/1000+"s");

        assert isSort(arr);
    }
    public static void main(String... args){
        Integer[] arr = generateRandomArray(1000000,1,10000);
        testsort("QuickSort",new QuickSort(),arr);

    }
}
