public class MergeTwoSortedArr {
    private void SwapIfGreater(int[] arr1, int[] arr2, int ind1, int ind2) {
        if (arr1[ind1] > arr2[ind2]) {
            arr1[ind1] = arr1[ind1] ^ arr2[ind2];
            arr2[ind2] = arr1[ind1] ^ arr2[ind2];
            arr1[ind1] = arr1[ind1] ^ arr2[ind2];
        }
    }

    private int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int len = n + m;
        int gap = nextGap(len);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left < n && right >= n) {
                    SwapIfGreater(nums1, nums2, left, right - n);
                } else if (left >= n) {
                    SwapIfGreater(nums2, nums2, left - n, right - n);
                } else {
                    SwapIfGreater(nums1, nums1, left, right);
                }
                left++;
                right++;
            }

            gap = nextGap(gap);
        }

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 4, 7, 8, 10};   
        int[] nums2 = {2, 3, 9};        

        MergeTwoSortedArr sol = new MergeTwoSortedArr();
        sol.merge(nums1, nums1.length, nums2, nums2.length);

        System.out.print("Merged nums1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }

        System.out.print("\nMerged nums2: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}