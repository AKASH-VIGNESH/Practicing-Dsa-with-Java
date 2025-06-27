import java.util.ArrayList;
import java.util.List;

public class Union {
    public static void main(String[] args) {
        int nums1 [] = {1,2,3,5,5,6,7};
        int nums2 [] = {1,2,3,5,5,6,7,8,9};
        int n= nums1.length;
        int m = nums2.length;
        List<Integer> out = new ArrayList<>();
        int i=0,j=0;
        Integer lastAdded = null;
        while (i<n && j<m){
            int a = nums1[i];
            int b =nums2[j];
            int pick;
            if(a==b){
                pick = a;
                i++;
                j++;
            }
            else if(a<b){
                pick = a;
                i++;
            }
            else{
                pick = b;
                j++;
            }
            if(lastAdded == null || pick != lastAdded){
                out.add(pick);
                lastAdded = pick;
            }
        }
        while (i<n) {
            if(lastAdded == null || nums1[i] != lastAdded){
                out.add(nums1[i]);
                lastAdded = nums1[i];
            }
            i++;
        }
        while (j<m) {
            if(lastAdded == null || nums2[j] != lastAdded){
                out.add(nums2[j]);
                lastAdded = nums2[j];
            }
            j++;
        }
        System.out.println(out);
    }
}
