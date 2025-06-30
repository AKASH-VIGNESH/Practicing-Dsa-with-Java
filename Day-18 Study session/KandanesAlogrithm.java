import java.util.ArrayList;
import java.util.List;

public class KandanesAlogrithm {
    
    public long maxSubarraySum(ArrayList<Integer> arr, int n) {
        long sum =0, maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            sum += arr.get(i);

            if(sum>maxi){
                maxi = sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        // if(maxi<0){
        //     return ;
        // }
        return maxi;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
            List.of(-2,-3,4,-1,-2,1,5,-3)
        );
        KandanesAlogrithm obj = new KandanesAlogrithm();
        long result = obj.maxSubarraySum(numbers, numbers.size());
        System.out.println("The maximum sum of the subarray is : "+result);

    }
}
