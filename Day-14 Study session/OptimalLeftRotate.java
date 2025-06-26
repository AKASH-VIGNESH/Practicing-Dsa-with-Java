import java.util.Scanner;

public class OptimalLeftRotate {
    private int arr [] = {1,2,3,4,5,6,7,8,9,10};

    public void reverse(int start , int end){
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
     public void setArr(int[] arr) {
        this.arr = arr;
    }
    public int[] getArr() {
        return arr;
    }

    public void LeftRotate(int d){
        int n = arr.length;
        reverse(0, d);
        reverse(d+1, n-1);
        reverse(0, n-1);
    }

    public static void main(String[] args) {
        Scanner ReadInput = new Scanner(System.in);
        System.out.println("Enter the D: ");
        int d = ReadInput.nextInt();
        OptimalLeftRotate obj = new OptimalLeftRotate();
        for(int element : obj.getArr()){
            System.out.println(element);
        }

        obj.LeftRotate(d);

        for(int element : obj.getArr()){
            System.out.println(element);
        }
        ReadInput.close();
    }
}
