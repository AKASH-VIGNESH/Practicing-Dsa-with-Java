import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            int key = nums.get(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 1, 1, 1, 2, 2));
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
