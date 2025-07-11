import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Optimal4Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n;i++){
            if(i>0 && nums[i] == nums[i-1]){continue;}
            for(int j = i+1;j<n;j++){
                if(j>i+1 && nums[j] == nums[j-1]){continue;}
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum =  nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]){k++;}
                        while(k<l && nums[l] == nums[l+1]){l--;}
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2}; 
        int target = 0;                   
        Optimal4Sum obj = new Optimal4Sum();
        List<List<Integer>> result = obj.fourSum(nums, target);

        System.out.println("Quadruplets that sum to " + target + ":");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}