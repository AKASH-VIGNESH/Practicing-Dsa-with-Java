import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            if(i>0 && nums[i] == nums[i-1]){ continue;}
            int j = i + 1;
            int k = n - 1;
            while(j < k){
                
                int Sum = nums[i] + nums[j] + nums[k];

                if(Sum < 0){
                    j++;
                }
                else if(Sum > 0){
                    k--;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){j++;}
                    while(j<k && nums[k] == nums[k+1]){k--;}
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        Optimal3Sum obj = new Optimal3Sum();
        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println("Triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
