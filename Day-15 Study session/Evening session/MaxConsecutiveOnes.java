public class MaxConsecutiveOnes {
    public static int maxOnes(int[] nums) {
        int max = 0, cur = 0;
        for (int n : nums) {
            cur = n == 1 ? cur + 1 : 0;
            if (cur > max) max = cur;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] a = {1, 1, 0, 1, 1, 1};
        System.out.println(maxOnes(a));
    }
}
