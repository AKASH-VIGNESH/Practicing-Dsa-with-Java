import java.util.ArrayList;
import java.util.List;

public class MajorityNdiv3 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1=0,count2=0;
        int e1 = Integer.MIN_VALUE;
        int e2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(count1==0 && nums[i]!=e2){
                count1 = 1;
                e1 = nums[i];
            }
            else if(count2==0 && nums[i]!=e1){
                count2 = 1;
                e2 = nums[i];
            }
            else if(e1==nums[i]){count1++;}
            else if(e2==nums[i]){count2++;}
            else{count1--;count2--;}
        }
        ans.add(e1);
        ans.add(e2);
        return ans;
    }
}
