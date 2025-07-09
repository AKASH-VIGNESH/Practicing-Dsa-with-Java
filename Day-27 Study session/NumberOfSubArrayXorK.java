import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArrayXorK {
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;

        int xr = 0, count = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        for (int value : a) {
            xr ^= value;
            int needed = xr ^ k;
            count += freq.getOrDefault(needed, 0);
            freq.put(xr, freq.getOrDefault(xr, 0) + 1);
        }

        System.out.println(count);
    }
}
