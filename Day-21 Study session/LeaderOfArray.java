import java.util.ArrayList;

public class LeaderOfArray {
    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        ArrayList <Integer> answer = new ArrayList<>();
        int maximum = Integer.MIN_VALUE;
        int n =  arr.length;
        for(int i= n-1;i>=0;i--){
            if(arr[i]>maximum){
                answer.add(arr[i]);
            }
            maximum = Math.max(maximum, arr[i]);
        }
        System.out.println(answer);
    }
}
