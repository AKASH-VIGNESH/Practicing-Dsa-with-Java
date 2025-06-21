import java.util.Scanner;

public class HashArray {
    public static void main(String[] args) {
        int [] OrginalArray = {1,2,3,4,5,2,3,1,2,4,3};
        int [] FrequencyArray = new int[12]; 

        for(int num : OrginalArray)
        {
            FrequencyArray[num] += 1;
            System.out.println(num);
        }
        Scanner ReadInput = new Scanner(System.in);
        System.out.println("Enter number of time you use the frequency:");
        int n = ReadInput.nextInt();
        while(n>0)
        {
            System.out.println("Enter the number you need the frequency of :");
            int Number = ReadInput.nextInt();
            System.out.println("frequency:"+FrequencyArray[Number]);
        }
        ReadInput.close();
    }
}
