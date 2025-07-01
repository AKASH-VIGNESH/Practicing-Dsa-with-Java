public class ReArrangeArray {
    public static void main(String[] args) {
        int [] arr ={3,1,-2,-5,2,-4};
        int [] ans = new int [arr.length];
        int posIndex =0 , negIndex=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[negIndex]=arr[i];
                negIndex+=2;
            }
            else{
                ans[posIndex]=arr[i];
                posIndex+=2;
            }
        }

        for(int num : ans){
            System.out.println(num);
        }
    }
}
