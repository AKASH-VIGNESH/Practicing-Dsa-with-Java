public class MissingNumber {
    public static int missing(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) xor ^= i ^ nums[i];
        return xor;
    }
    public static void main(String[] args) {
        int[] a = {3, 0, 1};
        System.out.println(missing(a));
    }
}
