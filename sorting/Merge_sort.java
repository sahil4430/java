package sorting;

import java.util.ArrayList;

public class Merge_sort {
    public void Merge(int[] arr,int low ,int high, int mid){

        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left <= mid && right <=high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        // re checking the temp array and putting the value in original array
        for (int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);
    
    }
    public void Merge_sort(int[] arr, int low, int high  ){
        int mid= (low + high)/2;
        if(low >= high)
            return;
        
        Merge_sort(arr, low, mid);
        Merge_sort(arr, (mid + 1), high);
        Merge(arr, low, high , mid);
        
    }
    
    public static void main ( String arg[]){
        int[] arr = {13, 46, 24, 52, 20, 9};
        Merge_sort obj = new Merge_sort();
        obj.Merge_sort(arr, 0, arr.length - 1);
        for ( int num : arr){
            System.out.print(num + " ");
        }
    }
}