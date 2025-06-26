public class MoveZeroToRight {
    public void swap(int [] arr,int index1 , int index2){
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
    }
    public static void main(String[] args) {
        int arr [] = {1,0,3,4,5,6,7,8,9,10};

        MoveZeroToRight obj = new MoveZeroToRight();
        int j = -1;
        for(int i=0 ; i<arr.length;i++){
            if(arr[i] == 0){
                j= i;
                break;
            }
        }
        if(j == -1){
            System.out.println("no zeroes in the array");
            return ;
        }
        for(int i = j+1 ; i<arr.length;i++){
            if(arr[i]!=0){
                obj.swap(arr, i, j);
                j++;
            }
        }
        for(int element : arr)
        {
            System.out.println(element);
        }
    }    
}
