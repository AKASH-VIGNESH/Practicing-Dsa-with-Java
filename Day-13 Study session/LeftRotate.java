public class LeftRotate {
    //Left rotate an array by D places
    public static void main(String[] args) {
        int arr [] = {2,4,6,8,10,12,14,16,18,20,22};
        int CopyElement = arr[0];

        for(int element : arr)
        {
            System.out.println(element);
        }

        for(int i=1;i<arr.length;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[(arr.length-1)] = CopyElement;

        System.out.println("result:");
        for(int element : arr)
        {
            System.out.println(element);
        }
    }    
}
