
public class SecondLargestAraay {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 7, 7, 5 };
        int largestElement = arr[0];
        int SecondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElement && arr[i] != largestElement) {
                SecondLargest = largestElement;
                largestElement = arr[i];
            } 
            else if(arr[i]<largestElement && arr[i]>SecondLargest) {
                SecondLargest = arr[i];
            }
        }
        System.out.println("Second largest : " + SecondLargest);
    }
}
