/**
 * Created by locan on 17/3/31.
 */
public class basetest {



    public void quickSort(int[] arr,int l,int r){

        if(r<l)
            return;

        int pos = partition(arr,l,r);
        quickSort(arr,l,pos-1);
        quickSort(arr,pos+1,r);
    }

    public int partition(int[] arr,int l,int r){
        if(l==r)
            return l;
        int j = l;
        for(int i=l+1;i<=r;i++){
            if(arr[l]>arr[i]){
                int temp = arr[j+1];
                arr[j+1] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        int temp = arr[j];
        arr[j] = arr[l];
        arr[l] = temp;
        return j;
    }


    public static void main(String... args){
        int[] arr = {6,4,2,8,4,2,0,1};
        basetest test = new basetest();
        test.quickSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
