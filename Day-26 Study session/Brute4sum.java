import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Brute4sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        long Sum = nums[i];
                        Sum += nums[j];
                        Sum += nums[k];
                        Sum += nums[l];
                        if (Sum == target) {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            Collections.sort(temp);
                            ans.add(temp);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        Brute4sum obj = new Brute4sum();
        List<List<Integer>> result = obj.fourSum(nums, target);

        System.out.println("Quadruplets that sum to " + target + ":");
        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }
}
