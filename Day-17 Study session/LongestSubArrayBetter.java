import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayBetter {

    int LongestSubArrayWithSumk(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int MaxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                MaxLen = Math.max(MaxLen, i + 1);
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                MaxLen = Math.max(MaxLen, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return MaxLen;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,-6,4,-5,6,1,2,3,4,5,3,1,1,5,1,5,1,1};
        LongestSubArrayBetter obj = new LongestSubArrayBetter();
        System.out.println(obj.LongestSubArrayWithSumk(arr, 8));
    }
}