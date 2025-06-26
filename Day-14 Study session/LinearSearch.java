import java.util.Scanner;

public class LinearSearch {

    public int linearSearchAlgorithm(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 4, 8, 6, 2, 3, 7 };

        Scanner ReadInput = new Scanner(System.in);
        int element = ReadInput.nextInt();
        LinearSearch obj = new LinearSearch();
        int x = obj.linearSearchAlgorithm(arr, element);
        if (x >= 0) {
            System.out.println("Element found at index: " + x);
        } else {
            System.out.println("Element not found");
        }
        ReadInput.close();
    }
}
