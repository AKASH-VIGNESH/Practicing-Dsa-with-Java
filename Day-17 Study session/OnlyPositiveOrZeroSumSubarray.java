public class OnlyPositiveOrZeroSumSubarray {
    int LongestSubArrayWithSumk(int arr[], int k) {
        int left = 0,right = 0;
        int sum = arr[0];
        int MaxLen = 0;
        int n = arr.length;
        while(right<n){
            while(left<=right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                MaxLen = Math.max(MaxLen, right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return MaxLen;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 3, 1, 1, 5, 1, 5, 1, 1 };
        LongestSubArrayBetter obj = new LongestSubArrayBetter();
        System.out.println(obj.LongestSubArrayWithSumk(arr, 8));
    }
}
