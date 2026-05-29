package sorting;

public class bubble_sort {
    public static void bubble_sort(int[]arr){
        int n = arr.length;
        for ( int i = n-1 ; i >= 0 ; i--){
            Boolean didswap = false ;
           for ( int j =0 ; j<i ; j++ ){
            if ( arr[j]> arr[j+1]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                didswap = true;
            }
           } if(!didswap){
                break;
            }
        }

        for ( int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        int [] arr = {13, 46, 24, 52, 20, 9};
        bubble_sort(arr);
    }
}
