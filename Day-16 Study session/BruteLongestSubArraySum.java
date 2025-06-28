public class BruteLongestSubArraySum {
    //only positive integers
    public static void main(String[] args) {
        int [] arr ={1,2,3,1,1,1,4,2,3};
        int k = 3;
        int Maxlength = 0;
        for(int i =0 ; i<arr.length;i++){
            int sum = 0;
            for(int j=i ; j<arr.length ; j++){
                sum += arr[j];
                if(sum == k) Maxlength = Math.max(Maxlength, j-i+1);
            }
        }
        System.out.println("The length of longest subarray: "+Maxlength);
    }
}
