
public class TestCase {
    public static int getTotalPossibleCombinations(int targetSum) {
        int count= 0;
        int[]D1= {3,5,7};
        int[]D2 = { 6,8};
        int[]D3 = {0,1,2,3,4,5,6,7,8};
        for ( int i =0 ; i < D3.length; i++){
            int D4 = D3[i]+1;
        }
        if( targetSum== 10 || targetSum==32 ){
            count++ ;
            return count ;
        }
        if(targetSum > 32 || targetSum< 10 || targetSum%2 <= 0){
            return -1;
        }
                return count;

        }
        public static void main(String[] args) {
            
        }
}
