import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortPratice {

    private int[] data = new int[20];

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void Merge(int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (data[left] <= data[right]) {
                temp.add(data[left]);
                left++;
            } else {
                temp.add(data[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(data[left]);
            left++;
        }
        while (right <= high) {
            temp.add(data[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            data[i] = temp.get(i - low);
        }
    }

    public void MergeSort(int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        MergeSort(low, mid);
        MergeSort(mid + 1, high);
        Merge(low, mid, high);
    }

    public static void main(String[] args) {
        Scanner ReadInput = new Scanner(System.in);
        MergeSortPratice obj = new MergeSortPratice();

        int n = ReadInput.nextInt();

        int[] Temp = new int[n];

        for (int i = 0; i < n; i++) {
            Temp[i] = ReadInput.nextInt();
        }
        obj.setData(Temp);

        obj.MergeSort(0, obj.getData().length-1);

        for (int num : obj.getData()) {
            System.out.println(num);
        }

        ReadInput.close();

    }
}
