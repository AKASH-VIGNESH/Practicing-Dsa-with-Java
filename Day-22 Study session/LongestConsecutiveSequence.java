import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0)return 0 ;
        int longest = 0;
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }
        for(int element : st){
            if(!st.contains(element-1)){
                int count = 1; 
                int x = element;
                while (st.contains(x+1)) {
                    x +=1;
                    count +=1;
                }
                longest = Math.max(longest,count);
            }
        }
        return  longest;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        int arr [] = {102,4,100,1,101,3,2,1,1};
        int x = obj.longestConsecutive(arr);
        System.out.println(x);
    }
}
