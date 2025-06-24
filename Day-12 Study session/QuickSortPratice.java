import java.util.Scanner;


public class QuickSortPratice {

    private int[] data = new int[20];

    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }

    public void Swap(int i,int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public int FindPratition(int low, int high) {
        int pivot = data[low];
        int i = low;
        int j = high;
        while (i<j){
            while(data[i]<=pivot && i<=high-1){
                i++;
            }
            while(data[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j)
            {
                Swap(i, j);
            }
        }
        Swap(low, j);
        return j;
        
    }

    public void QuickSort(int low, int high) {
        if(low<high)
        {
            int partitionIndex = FindPratition(low, high);
            QuickSort(low,partitionIndex-1);
            QuickSort(partitionIndex+1,high);
        }
    }

    public static void main(String[] args) {
        Scanner ReadInput = new Scanner(System.in);
        QuickSortPratice obj = new QuickSortPratice();

        int n = ReadInput.nextInt();

        int[] Temp = new int[n];

        for (int i = 0; i < n; i++) {
            Temp[i] = ReadInput.nextInt();
        }
        obj.setData(Temp);

        obj.QuickSort(0, obj.getData().length - 1);

        System.out.println("Result:");
        for (int num : obj.getData()) {
            System.out.println(num);
        }

        ReadInput.close();

    }
}
