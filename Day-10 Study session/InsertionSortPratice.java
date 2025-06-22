import java.util.Scanner;

public class InsertionSortPratice {
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

    public void InsertionSort() {
        int n = data.length;
        for(int i=0;i<n-1;i++){
            int j=i;
            while((j>0)&&data[j-1]>data[j]){
                swap(j-1, j);
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner ReadInput = new Scanner(System.in);
        InsertionSortPratice obj = new InsertionSortPratice();

        int n = ReadInput.nextInt();

        int[] Temp = new int[n];

        for (int i = 0; i < n; i++) {
            Temp[i] = ReadInput.nextInt();
        }
        obj.setData(Temp);

        obj.InsertionSort();

        System.out.println();
        for (int num : obj.getData()) {
            System.out.print(num + ",");
        }

        ReadInput.close();

    }
}
