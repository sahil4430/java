public class QuickSort {

    public static void quickSort(int[] arr, int low ,int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }

    static  int partition(int[] arr, int low , int high){
          int pivot_index  = medianOfThree(arr,low,high);
        if(pivot_index!=low){
            swap(arr,low,pivot_index);
        }
        int pivotElement = arr[low];
        int i = low + 1;
        int j = high;

        while(true){
            while(i<=j && arr[i]<pivotElement ){
                i++;
            }
            while(j>=i && arr[j]>pivotElement){
                j--;
            }
            if(i<=j){
                swap(arr,i,j);
            }else {
                break;
            }
        }
        swap(arr,low,j);
        return j;
    }

    static  int medianOfThree(int arr[] , int low, int high){
        int mid = low + (high-low)/2;
        int a  = arr[low];
        int b = arr[mid];
        int c = arr[high];
        if((a>b && a<c) || (a<b &&  a>c)){
            return low;
        } else if ((b>a && b<c) || (b>c && b<a)){
            return  mid;
        }else {
            return high;
        }
    }

    static  void swap(int arr[], int i , int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }


    public static void main(String[] args) {
        int arr[] = {10,20,30,5,7,8,3};
        quickSort(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



}