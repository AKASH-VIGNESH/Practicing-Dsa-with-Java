public class SingleNumber {
    public static int single(int[] nums) {
        int ans = 0;
        for (int n : nums) ans ^= n;
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 4, 4};
        System.out.println(single(a));
    }
}
