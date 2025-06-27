import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        int nums1 [] = {1,2,3,5,5,6,7};
        int nums2 [] = {1,2,3,5,5,6,7,8,9};
        int n= nums1.length;
        int m = nums2.length;
        List<Integer> out = new ArrayList<>();
        int i=0,j=0;
        while (i<n && j<m){
            if(nums1[i] < nums2[j]){
                i++;
            }       
            else if(nums2[j]<nums1[i]){
                j++;
            }     
            else{
                out.add(nums1[i]);
                i++;
                j++;
            }
        }
        System.out.println(out);
    }

}
