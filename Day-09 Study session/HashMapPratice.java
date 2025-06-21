import java.util.HashMap;
import java.util.Scanner;

public class HashMapPratice {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        Scanner ReadInput = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = ReadInput.nextInt();

        //Getting element from user
        int[] Arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i =0;i<n;i++)
        {
            Arr[i] = ReadInput.nextInt();
        }

        //pre compute data
        for (int num : Arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);


        ReadInput.close();
    }

}
