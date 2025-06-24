
public class CheckSorted {

    public boolean CheckIsSorted(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 2, 9};
        CheckSorted obj = new CheckSorted();
        System.out.println("Is the array is sorted: "+(obj.CheckIsSorted(arr)?"yes":"no"));
    }
}
