import java.util.Scanner;

public class RotateLeftD {
    
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10};
        for(int element: arr){
            System.out.println(element);
        }
        Scanner ReadInput = new Scanner(System.in);
        System.out.println("Enter the D: ");
        int d = ReadInput.nextInt();
        int [] temp = new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++)
        {
            arr[i-d] = arr[i];
        }
        for(int i = arr.length-d ; i<arr.length ; i++){
            arr[i] = temp[i-(arr.length-d)];
        }
        ReadInput.close();

        for(int element: arr){
            System.out.println(element);
        }
    }
}
