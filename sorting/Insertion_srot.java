package sorting;

public class Insertion_srot {
    public static void main ( String arg[]){
        int[] arr = {13, 46, 24, 52, 20, 9};
        INsertionsort(arr);
    };
    public static void INsertionsort(int[] arr){
        int n = arr.length;
        for ( int i =1; i<n ; i++){
            int key = arr[i];
            int j  =i-1;
            while ( j>=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for( int num :arr){
            System.out.print ( num + " ");
        }
    }
}
