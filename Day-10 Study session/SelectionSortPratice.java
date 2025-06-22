import java.util.Scanner;

public class SelectionSortPratice {
    
    private int [] data = new int [20];
    
    public void setData(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public void swap(int i , int j)
    {
        int temp = data[i];
        data[i]= data[j];
        data[j] = temp;
    }
    
    public void SelectionSort()
    {
        int n = data.length;
        for(int i=0;i<n-2;i++)
        {
            int minima = i;

            for(int j=i;j<=n-1;j++)
            {
                if(data[j]<data[minima])
                {
                    minima = j;
                }    
            }
            swap(i, minima);
        }
    }

    public static void main(String [] args)
    {
        Scanner ReadInput = new Scanner(System.in);
        SelectionSortPratice obj = new SelectionSortPratice();

        int n = ReadInput.nextInt();

        int [] Temp = new int [n];

        for(int i=0;i<n;i++)
        {
            Temp[i] = ReadInput.nextInt();
        }
        obj.setData(Temp);

        obj.SelectionSort();


        for(int num : obj.getData())
        {
            System.out.println(num);
        }
        
        ReadInput.close();

    }
}
