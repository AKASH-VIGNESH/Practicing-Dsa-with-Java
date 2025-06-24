
public class LargestElementArray {
    public static void main(String[] args) {
        int [] arr = {3,2,1,5,2};
        int MaximumElement = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>MaximumElement){
                MaximumElement = arr[i];
            }
        }
        System.out.println("Largest Element: "+MaximumElement);
    }
}
