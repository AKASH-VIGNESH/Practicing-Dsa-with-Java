//Finding the number of unique element in a sorted array

public class RemoveDulipcate {
    public static void main(String[] args) {
       int [] arr = {1,1,2,2,3,3,4,4,5,5,6,7};
       int original = arr[0];
       int count =1;
       for(int i=0;i<arr.length;i++)
       {
            if(arr[i]!=original)
            {
                original = arr[i];
                count++;
            }
       }
       System.out.println("Number of unique Elements: "+count);
    }
}
