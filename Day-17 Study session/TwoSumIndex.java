import java.util.HashMap;
import java.util.Map;

public class TwoSumIndex {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int element = nums[i];
            int required = target-element;
            if(map.containsKey(required)){
                return new int[] {i,map.get(required)};
            }
            map.put(element,i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        int target = 14;
        TwoSumIndex obj = new TwoSumIndex();
        int answerIndex [] = obj.twoSum(arr, target);
        for(int i : answerIndex){
            System.out.println(i);
        }
    }
}
