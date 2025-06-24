public class SecondSmallest {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int SmallestElement = arr[0];
        int SecondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < SmallestElement) {
                SecondSmallest = SmallestElement;
                SmallestElement = arr[i];
            } else if (arr[i] > SmallestElement && arr[i] < SecondSmallest) {
                SecondSmallest = arr[i];
            }
        }
        System.out.println("Second smallest : " + SecondSmallest);
    }
}
