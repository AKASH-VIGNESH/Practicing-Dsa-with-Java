import java.util.Scanner;

public class BubbleSort {
    private int[] data = new int[20];

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void swap(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void Bubblesort() {
        int n = data.length;
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if(data[j]>data[j+1]){
                    swap(j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner ReadInput = new Scanner(System.in);
        BubbleSort obj = new BubbleSort();

        int n = ReadInput.nextInt();

        int[] Temp = new int[n];

        for (int i = 0; i < n; i++) {
            Temp[i] = ReadInput.nextInt();
        }
        obj.setData(Temp);

        obj.Bubblesort();

        System.out.println();
        for (int num : obj.getData()) {
            System.out.print(num + ",");
        }

        ReadInput.close();

    }
}
